

class enlace extends MyObject
{
	private ConditionVariable hidrogeno = null;
	private ConditionVariable oxigeno   = null;
	private int conthidrogeno ;
	private int contoxigeno ;
	
	public enlace ()
	{
		hidrogeno = new ConditionVariable();
		oxigeno = new ConditionVariable();
		contoxigeno = 0;
		conthidrogeno = 0;
	}
	public synchronized void hidro()
	{
		conthidrogeno++;
		//System.out.println(" Se tiene 1 atomo de hidrogeno");
		if( conthidrogeno == 2 )
		{
			System.out.println(" Se tienen 2 atomos de hidrogeno");
			notify(oxigeno);
			wait(hidrogeno);
		}
	}
	public synchronized void oxi()
	{
		contoxigeno++;
		System.out.println(" Se tiene 1 atomo de oxigeno");
	
		while(conthidrogeno  !=2 )
			wait(oxigeno);
		System.out.println(" Se tiene una molecula de agua\n");
		contoxigeno = 0;
		conthidrogeno = 0;
		notify(hidrogeno);

	}
}


