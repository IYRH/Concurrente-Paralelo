
class poner_oxigeno extends MyObject implements Runnable
{
	private enlace m;
	private int N;
	public poner_oxigeno(enlace m1, int N)
	{ 
		m=m1;
		this.N = N;
	}
	public void run()
	{
			for(int j=1; j<=N; j++)
			{
				m.oxi();
				nap(100);
			}
	}
}


