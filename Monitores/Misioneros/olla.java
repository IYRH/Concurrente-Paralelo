
class olla extends MyObject
{
	private boolean vacio = true;
	private int misioneros=0;
	private ConditionVariable cocinar = null; 
	private ConditionVariable comer = null; 
	
	public olla()
	{	
		cocinar = new ConditionVariable();
		comer = new ConditionVariable();
		
	}
	public synchronized void cocina(int i)
	{
		while(!vacio)
		{
			wait(cocinar);
		}
		System.out.println(" Cocinando al misionero" +i);
		misioneros++;
		if(misioneros==10)
		{
			System.out.println(" Olla llena");
			vacio = false;
			notify(comer);
		}
	}
	public synchronized void come(int i)
	{
		while(vacio)
		{
			wait(comer);
		}
		System.out.println("\t\t\t\tSalvaje comiendo al misionero"+i);
		misioneros--;
		if(misioneros==0)
		{
			vacio = true;
			notify(cocinar);
		}
	}
}

