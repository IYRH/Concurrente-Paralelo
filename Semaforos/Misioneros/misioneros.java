
class misioneros extends MyObject
{
	protected static final BinarySemaphore puede = new BinarySemaphore(0);
	protected static final CountingSemaphore mis = new CountingSemaphore(10);
	
	public static void main(String[] args)
	{
		olla o = new olla(mis, puede);
		
		Thread c1 = new Thread(new cocinando(o));
		Thread c2 = new Thread(new comiendo(o));
		
		c1.start();
		c2.start();
		
	}
}
