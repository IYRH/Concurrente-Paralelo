class almacen extends MyObject
{
	private int valor;
	private ConditionVariable produce = null;
	private ConditionVariable consume = null;
	
	public almacen()
	{
		valor=0;
		produce = new ConditionVariable();
		consume = new ConditionVariable();
	}
	public synchronized void poner(int v)
	{
		while(valor!=0)
			wait(produce);
		valor=v;
		notify(consume);
	}
	public synchronized int sacar()
	{
		while(valor==0)
			wait(consume);
		int temp=valor;
		valor=0;
		notify(produce);
		return temp;
	}
}

