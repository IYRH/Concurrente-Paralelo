
class cocinando extends misioneros implements Runnable
{
	private olla o;
	
	public cocinando(olla o1)
	{	o=o1;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
			for(int j=1; j<=10; j++)
				o.cocina(j);
	}
}

				