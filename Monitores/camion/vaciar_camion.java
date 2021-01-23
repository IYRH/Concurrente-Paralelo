class vaciar_camion extends MyObject implements Runnable
{
	private camion cm;
	public vaciar_camion(camion c1){ 
		cm=c1; 
	}		
	public void run()
	{
		int temp;
		for(int i =1; i<=10; i++)
		{
			cm.vaciar(i);
			nap(1500);
		}
	}
}

