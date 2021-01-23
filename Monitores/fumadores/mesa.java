//region critica

class mesa extends MyObject
{
	private int tabaco, papel, cerillo, x;
	private boolean vacia;		//variable compartida
	private ConditionVariable pone = null;
	private ConditionVariable saca = null;
	
	public mesa()				//constructor generico
	{	
		tabaco=3;
		papel=4;
		cerillo=5;
		vacia=true;
		pone = new ConditionVariable();
		saca = new ConditionVariable();
	}
	public synchronized void poner(int n)
	{	while(!vacia)
			wait(pone);
		if( n == (cerillo+papel) )
			x = tabaco;
		else
			if( n == (tabaco+cerillo) )
				x = papel;
			else
				if(n == (tabaco + papel) )
				x = cerillo;
		vacia=false;
		notifyAll();
		//notify(saca);
	}
	public synchronized void sacar(int n)
	{	while(vacia || x != n )
			wait(saca);
		vacia=true;
		notifyAll();
		//notify(pone);
	}
}


		