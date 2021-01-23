class engrapar_hojas extends MyObject implements Runnable	//extrae
{
	private mesa m;
	public engrapar_hojas(mesa m1){ m=m1; }		//constructor
	public void run()
	{
		for(int i =1; i<=4; i++)
		{	m.engrapar();
			nap(500);
		}
	}
}

