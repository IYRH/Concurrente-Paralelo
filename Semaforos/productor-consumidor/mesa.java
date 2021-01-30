
class mesa extends MyObject
{
	private int monto; //vc, region critica
	private BinarySemaphore consumidor;
	private BinarySemaphore productor;
	private BinarySemaphore mutex;
	
	public mesa(BinarySemaphore mu,BinarySemaphore pro, BinarySemaphore  con)
	{
		productor = pro;
		mutex = mu;
		consumidor=con;
		monto=0;
	}
	public void produce(int value)
	{
			P(productor);
			P(mutex);	
			monto =  value;
			V(mutex);
			V(consumidor);
	}
	public int  consume()
	{
			P(consumidor);
			P(mutex);
			int tmp = monto;
			monto=0;
			V(mutex);
			V(productor);
			return tmp;
	}
}
