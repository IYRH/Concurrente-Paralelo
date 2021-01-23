
//Trabajar las moleculas
import java.io.*;

public class trabajar extends MyObject
{
	public static void main(String[] args)
	{	
		int Nmoleculas=10;
		enlace m             = new enlace();
		Thread   po = new Thread(new poner_oxigeno(m, Nmoleculas));
		Thread   ph = new Thread(new poner_hidrogeno(m, Nmoleculas));
		
		po.start();
		ph.start();

	

		

	}
}

