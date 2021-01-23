class bano extends MyObject
{
	final static int disponible=1;
	final static int lleno=0;
	protected int estado = disponible;
	protected int chicos_dentro = 0;	//	vc
	protected int chicas_dentro = 0;	//vc
	protected int wait_chicas = 0;		//vc
	protected int wait_chicos = 0;		//vc
	protected int lugares = 0;			//vc
	private ConditionVariable hombre = null;
	private ConditionVariable mujer = null;
	
	public bano()
	{
		hombre = new ConditionVariable();
		mujer = new ConditionVariable();
	}
	
	public synchronized void chicos()
	{
		if(estado==lleno || chicas_dentro>0)
			wait_chicos++;
			
		while(estado==lleno || chicas_dentro>0)
		{
			wait(hombre);
		}
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
	}
	public synchronized void chicas()
	{
		if(estado==lleno || wait_chicos>0 || chicos_dentro>0)
			wait_chicas++;
		while(estado==lleno || wait_chicos>0 || chicos_dentro>0)	
			wait(mujer);
		if(wait_chicos==0 || chicos_dentro==0 || chicas_dentro==0)
		{
			lugares++;
			chicas_dentro++;
			if(wait_chicas != 0)
				wait_chicas--;
			estado=lleno;
		}
	}
	public synchronized void desbloquea_chicos()
	{
		chicos_dentro--;
		estado=disponible;
		lugares--;
		notifyAll();
	}
	public synchronized void desbloquea_chicas()
	{
		chicas_dentro--;
		estado=disponible;
		lugares--;
		notifyAll();
	}
}
