//Banco
import java.io.*;
import java.lang.*;

public class trabajar extends MyObject
{
	public static void main(String[] args)
	{
		mesa m    = new mesa();
		Thread  ph = new Thread ( new poner_hojas(m) );
		Thread  eh = new Thread ( new engrapar_hojas(m) );
		ph.start();
		eh.start();
	}
}

