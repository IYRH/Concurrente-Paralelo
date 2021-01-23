
public class fabrica extends MyObject
{	public static void main(String[] args)
	{	
		int n=5;		//numero de cigarros a hacer.
		
		mesa      m = new mesa();
		
		Thread f1 = new Thread ( new fumador1(m,n) );
		Thread f2 = new Thread ( new fumador2(m,n) );
		Thread f3 = new Thread ( new fumador3(m,n) );
		
		Thread ag = new Thread ( new agente(m,n) );
		
		
		f1.start();
		f3.start();
		f2.start();
		ag.start();
		

	}
		
}

