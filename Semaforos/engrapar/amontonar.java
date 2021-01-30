
class amontonar extends MyObject implements Runnable
{
	private mesa m1;
	public amontonar(mesa m)
	{	m1=m;
	}
	public void run()
	{
		for(int i=1; i<=12; i++)
		{
			int j=1;
			while(j !=5 )
			{
				m1.amontona(j);
				j++;
				nap(100);
			}
		}
	}
}
