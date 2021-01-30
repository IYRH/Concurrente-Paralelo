class poner_hidrogeno extends MyObject implements Runnable		
{
	private mesa m;
	private int N;
	public poner_hidrogeno(mesa m1, int N){ 
		m=m1; 
		this.N=N;
	}		
	public void run()
	{
			for(int j=1; j<=(N*2); j++)
			{
				m.poner_hidrogeno();
				nap(100);
			}
	}
}