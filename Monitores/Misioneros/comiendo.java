

class comiendo extends MyObject implements Runnable
{
	private olla o;
	public comiendo(olla o1)
	{
		o=o1;
	}
	public void run()
	{
		for(int i=1; i<=3; i++)
			for(int j=1; j<=10; j++)
			{
				o.come(j);
				nap(100);
			}
	}
}


