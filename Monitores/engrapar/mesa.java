class mesa extends MyObject
{
	private int hojas;
	private ConditionVariable poner = null;
	private ConditionVariable engrapar = null;
	public mesa()
	{
		hojas = 0;
		poner = new ConditionVariable();
		engrapar = new ConditionVariable();
	}
	
	public synchronized void poner(int indice)
	{
		while(hojas == 4)
		{
			notify(engrapar);
			wait(poner);
		}
		//else
		{
			hojas++;
			System.out.println("Se pone una hoja "+indice);
			
		}
	}
	public synchronized void engrapar()
	{
		while(hojas <4)
			wait(engrapar);
		//else
		{
			hojas=0;
			System.out.println("Se engraparon 4 hojas\n");
			notify(poner);
		}
	}
}
