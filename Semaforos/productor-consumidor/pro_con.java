import java.io.*;
import java.lang.*;

class pro_con extends MyObject
{
	protected static final BinarySemaphore pd = new BinarySemaphore(1);
	protected static final BinarySemaphore con = new BinarySemaphore(0);
	protected static final BinarySemaphore mu = new BinarySemaphore(1);
	
	public static void main(String[] args)
	{
		mesa c = new mesa(mu, pd, con);
		Thread co   = new Thread(new consumidor(c) );
		Thread pr   = new Thread(new productor(c) );
		
		pr.start();
		co.start();

	}
	
}
