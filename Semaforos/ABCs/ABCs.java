
class ABCs extends MyObject
{
	protected static final BinarySemaphore    B = new BinarySemaphore(0);
	protected static final BinarySemaphore    C = new BinarySemaphore(1);
	protected static final CountingSemaphore sum = new CountingSemaphore(0);
	
	public static void main(String[] args)
	{
		Thread pa = new Thread(new Pa());
		Thread pb = new Thread(new Pb());
		Thread pc = new Thread(new Pc());

		pa.start();
		pb.start();
		pc.start();
	
		nap(9000);
		
		pa.stop();
		pb.stop();
		pc.stop();
		
		System.out.println("");
		
	}
}
