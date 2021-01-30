import java.io.*;
import java.lang.*;

public class trabajar extends MyObject
{
	public static void main(String[] args)
	{	int Nmoleculas=10;
		CountingSemaphore h = new CountingSemaphore(2);
		CountingSemaphore o = new CountingSemaphore(1);
		
		mesa m= new mesa(h, o);
		Thread   po = new Thread(new poner_oxigeno(m, Nmoleculas));
		Thread   ph = new Thread(new poner_hidrogeno(m, Nmoleculas));
		
		po.start();
		ph.start();

	

		

	}
}