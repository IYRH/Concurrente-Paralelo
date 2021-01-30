class poner_oxigeno extends MyObject implements Runnable		
{
	private mesa m;
	private int N;
	public poner_oxigeno(mesa m1, int N){ 
		m=m1; 
		this.N = N;
	}		
	public void run()
	{
			for(int j=1; j<=N+1; j++)
			{
				m.poner_oxigeno();
				nap(100);
			}
	}
}