
class poner_hidrogeno extends MyObject implements Runnable		//deposita
{
	private enlace m;
	private int N;
	public poner_hidrogeno(enlace m1, int N)
	{
		 m=m1; 
		 this.N=N;
	}
	public void run()
	{
			for(int j=1; j<=(N*2); j++)
			{
				m.hidro();
				nap(100);
			}
	}
}
