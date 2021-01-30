
class bano extends MyObject
{
	final static int disponible=1;
	final static int lleno=0;
	protected int estado = disponible;
	protected int chicos_dentro = 0;	//vc
	protected int chicas_dentro = 0;	//vc
	protected int wait_chicas = 0;		//vc
	protected int wait_chicos = 0;		//vc
	protected int lugares = 0;		//vc
	private BinarySemaphore mutex;
	private BinarySemaphore ho;
	private BinarySemaphore mu;
	public bano(BinarySemaphore mutex1, BinarySemaphore ho1, BinarySemaphore mu1)
	{	
		mutex=mutex1;	ho=ho1;	mu=mu1;
	}
	public void chicos()
	{
		if(estado==lleno || chicas_dentro>0)
		{	wait_chicos++;}	
		while(estado==lleno || chicas_dentro>0 || lugares>=5)
		{	
			P(ho);
		}
		P(mutex);
			//if(wait_chicos>0)
			{
				wait_chicos--;
				lugares++;
				chicos_dentro++;
			}
			if(lugares<5)
				estado=disponible;
			else
				estado=lleno;
		V(mutex);
	}
	public void chicas()
	{
		if(estado==lleno || wait_chicos>0 || chicos_dentro>0)
			wait_chicas++;
		while(estado==lleno || wait_chicos>0 || chicos_dentro>0)
		{	 P(mu);
		}
		if(wait_chicos==0 || chicos_dentro==0 || chicas_dentro==0)
		{
			P(mutex);
				lugares++;
				chicas_dentro++;
				if(wait_chicas != 0)
					wait_chicas--;
				estado=lleno;
			V(mutex);
		}
	}
	public void desbloquea_chicos()
	{
		P(mutex);
			chicos_dentro--;
			estado=disponible;
			lugares--;
		V(mutex);
		V(mu);
		V(ho);
	}
	public void desbloquea_chicas()
	{
		P(mutex);
			chicas_dentro--;
			estado=disponible;
			lugares--;
		V(mutex);
		V(ho);
		V(mu);
	}
}

