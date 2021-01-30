
class grapar extends MyObject implements Runnable
{
	private mesa m1;
	public grapar(mesa m)
	{	m1=m;
	}
	public void run()
	{
		for(int i=1; i<=12; i++)
		{	m1.grapar();
			nap(100);
		}
	}
}
