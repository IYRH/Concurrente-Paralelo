
class extrae extends MyObject implements Runnable
{
	private cuenta c;
	
	public extrae(cuenta c1)
	{	c=c1;
	}
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			int temp=(int)(Math.random()*9000);
			System.out.println("\t\t\t\tSe intenta extrer "+temp);
			c.iextrae(temp);
			nap(200);
		}
	}
}
