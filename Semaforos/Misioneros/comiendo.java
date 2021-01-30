
class comiendo extends misioneros implements Runnable
{
	private olla o;
	
	public comiendo(olla o1)
	{	o=o1;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
				o.come();
	}
}

			