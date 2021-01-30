
class productor extends MyObject implements Runnable
{
	private mesa c;
	
	public productor(mesa c1)
	{	c=c1;
	}
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			int temp=(int)(Math.random()*10);
			c.produce(temp);
			System.out.print(" Se produce "+temp);
			nap(200);
		}
	}
}
