//fumador3 pone tabaco

class fumador3 extends MyObject implements Runnable
{	private mesa m;
	private int y;
	public fumador3(mesa m1, int d)
	{	m=m1;
		y=d;
	}
	public void run()
	{
		for(int i=1; i<=y; i++)
		{
				m.sacar(3);
				System.out.println("\t\t\tFumo Fumador3: puso Tabaco\n");
				nap(500);
		}
	}
}


		
	