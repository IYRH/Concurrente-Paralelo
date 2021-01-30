
class banco extends MyObject
{
	protected static final BinarySemaphore mutex = new BinarySemaphore(1);
	protected static final BinarySemaphore pd = new BinarySemaphore(1);
	protected static final BinarySemaphore pe = new BinarySemaphore(0);
	
	public static void main(String[] args)
	{
		cuenta c = new cuenta(mutex, pd, pe);
		Thread d   = new Thread(new deposita(c) );
		Thread e   = new Thread(new extrae(c) );
		
		d.start();
		e.start();

	}
	
}
