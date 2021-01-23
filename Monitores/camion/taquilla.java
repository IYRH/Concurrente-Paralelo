//taquilla
import java.io.*;
import java.lang.*;

public class taquilla extends MyObject
{
	public static void main(String[] args)
	{
		camion c    = new camion();
		
		Thread ll = new Thread ( new llenar_camion(c) );
		Thread va = new Thread ( new vaciar_camion(c) );
		ll.start();
		va.start();
	}
}
