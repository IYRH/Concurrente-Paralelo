class llenar_camion extends MyObject implements Runnable
{
	private camion cm;
	public llenar_camion(camion c1){ 
		cm=c1; 
	}		
	public void run()
	{
			for(int j=1; j<=10; j++)
				for(int i =1; i<=25; i++)
					cm.llenar(i);
			nap(1500);
	}
}