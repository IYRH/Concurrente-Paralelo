
class bano_disco extends MyObject
{
	protected static final BinarySemaphore mutex = new BinarySemaphore(1);
	protected static final BinarySemaphore ho = new BinarySemaphore(0);
	protected static final BinarySemaphore mu =  new BinarySemaphore(0);
	public static void main(String[] args)
	{	int n=8;
		bano b = new bano(mutex, ho, mu);
		
		for(int i=1; i<=n; i++)
			new Thread(new hombres("Chico "+i, b) ).start();
		for(int i=1; i<=n; i++)
			new Thread(new mujeres("Chica "+i, b) ).start();
	}
}
