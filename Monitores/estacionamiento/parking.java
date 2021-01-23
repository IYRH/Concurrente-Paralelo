import java.io.*;
import java.lang.*;

class parking extends MyObject
{
	public static void main(String[] args)
	{
		maquina m = new maquina();
		estacionamiento es  = new estacionamiento(2);
		
		Thread cll = new Thread ( new carro_llega(m, es) );
		Thread cs  = new Thread ( new carro_sale(m, es)  );
		
		cll.start();
		cs.start();
	}
}

