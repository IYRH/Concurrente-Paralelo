import java.io.*;
import java.lang.*;

class parking extends MyObject
{
	BinarySemaphore mutex = new BinarySemaphore(1);
	public static void main(String[] args)
	{		
		
		estacionamiento es  = new estacionamiento();
		
		Thread llega = new Thread ( new carro_llega(es));
		Thread sale  = new Thread ( new carro_sale(es));
		
		llega.start();
		sale.start();

	}
}
