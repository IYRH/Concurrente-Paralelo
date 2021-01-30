
class deposita extends MyObject implements Runnable
{
	private cuenta c;
	
	public deposita(cuenta c1)
	{	c=c1;
	}
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			int temp=(int)(Math.random()*9000);
			System.out.println(" Se intenta depositar "+temp);
			c.ideposita(temp);
			nap(200);
		}
	}
}
