//fumador2 pone cerillo

class fumador2 extends MyObject implements Runnable
{	private mesa m;
	private int y;
	public fumador2(mesa m1, int d)
	{	m=m1;
		y=d;
	}
	public void run()
	{
		for(int i=1; i<=y; i++)
		{
				m.sacar(5);
				System.out.println("\t\t\tFumo Fumador2: Puso cerillo\n");
				nap(500);
		}
	}
}
		
	
