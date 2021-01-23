class cliente1 extends MyObject implements Runnable		
{
	private cajero c;
	public cliente1(cajero c1){ 
		c=c1; 
	}		
	public void run()
	{
		for(int i =1; i<=10; i++)
		{
			int temp = (int)(Math.random()*10000);
			System.out.println("Se intento depositar: "+temp);
			c.depositar(temp);
			nap(300);
		}
	}
}