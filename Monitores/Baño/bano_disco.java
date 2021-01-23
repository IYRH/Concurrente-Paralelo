import java.io.*;
import java.lang.*;

class bano_disco extends MyObject
{
	public static void main(String[] args)
	{	int n=7;
		bano b = new bano();
		
		for(int i=1; i<=n; i++)
		{
			new Thread ( new mujeres("Chica "+i, b) ).start();
		}
		for(int i=1; i<=n; i++)
		{
			new Thread ( new hombres("Chico "+i, b) ).start();
		}
	}
}
