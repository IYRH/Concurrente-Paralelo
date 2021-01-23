class cliente2 extends MyObject implements Runnable	
{
	private cajero c;
	public cliente2(cajero c1){ c=c1; }		
	public void run()
	{
		int temp;
		for(int i =1; i<=10; i++)
		{
			temp = (int)(Math.random()*10000);
			System.out.println("Se intento extraer: "+temp);
			c.extraer(temp);
			nap(500);		
		}
	}
}