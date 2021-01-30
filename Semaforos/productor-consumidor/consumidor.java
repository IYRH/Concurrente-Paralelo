
class consumidor extends MyObject implements Runnable
{
	private mesa c;
	
	public consumidor(mesa c1)
	{	c=c1;
	}
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print("\t\t\t\tSe consume "+c.consume()+"\n");
			nap(200);
		}
	}
}
