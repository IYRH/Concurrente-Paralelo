/*
		cerillo  +  tabaco		Fuma	F1
		Tabaco   +  papel		Fuma	F2
		Papel	 +	cerrilo		Fuma	F3
*/

class agente extends MyObject implements Runnable
{
	private mesa m;
	private int n;
	public agente(mesa m1, int y)		//constructor
	{	m=m1;
		n=y;
	}
	public void run()
	{	while(n>0)
		{
			for(int i=7; i<=9; i++)
			{
				nap(500);
				
				System.out.println("Poniendo: ");
				if(i==9)
					System.out.println("	Cerrillo + Papel");
				else
					if(i==8)
						System.out.println("	Cerrillo + Tabaco");
					else
						if(i == 7)
							System.out.println("	Tabaco + Papel");
				m.poner(i);
			}
			n--;
		}
	}
}

		