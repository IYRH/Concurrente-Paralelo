
class cocinando extends MyObject implements Runnable
{
	private olla o;
	public cocinando(olla o1)
	{
		o=o1;
	}
	public void run()
	{
		for(int i=1; i<=3; i++)
			for(int j=1; j<=10; j++)
			{
				o.cocina(j);
				nap(100);
			}
	}
}

