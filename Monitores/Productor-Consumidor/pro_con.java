//Productor Consumidor
import java.io.*;
import java.lang.*;

public class pro_con extends MyObject
{
	public static void main(String[] args)
	{
		almacen a    = new almacen();
		
		Thread p = new Thread ( new productor(a)  );
		Thread c = new Thread ( new consumidor(a) );
		p.start();
		c.start();
	}
}
