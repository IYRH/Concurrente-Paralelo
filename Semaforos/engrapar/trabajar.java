
import java.io.*;
import java.lang.*;

class trabajar extends MyObject
{	
	public static void main(String[] args)
	{
		mesa      m = new mesa();
		Thread Amontonar = new Thread( new amontonar(m) );
		Thread Grapar    = new Thread( new grapar(m) );
		
		Amontonar.start();
		Grapar.start();
	}
}
