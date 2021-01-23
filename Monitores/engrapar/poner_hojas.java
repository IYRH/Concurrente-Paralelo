class poner_hojas extends MyObject implements Runnable		//deposita
{
	private mesa m;
	public poner_hojas(mesa m1){ m=m1; }		//constructor
	public void run()
	{
			for(int j=1; j<=4; j++)
				for(int i=1; i<=4; i++)
				{	m.poner(i);
					nap(100);
				}
	}
}

