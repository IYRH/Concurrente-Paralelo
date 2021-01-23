//fumador1 pone papel

class fumador1 extends MyObject implements Runnable
{	private mesa m;
	private int y;
	public fumador1(mesa m1, int d)
	{	m=m1;
		y=d;
	}
	public void run()
	{	
		for(int i=1; i<=y; i++)
		{
				m.sacar(4);
				System.out.println("\t\t\tFumo Fumador1: Puso Papel\n");
				nap(500);
		}
	}
}
		
	
