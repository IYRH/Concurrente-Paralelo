class cajero extends MyObject
{
	private int monto;
	private ConditionVariable deposita = null;
	private ConditionVariable extrae = null;
	
	public cajero()
	{
		monto=20000;
		deposita = new ConditionVariable();
		extrae = new ConditionVariable();
	}
	public synchronized void depositar(int cantidad)
	{
		while(monto+cantidad > 50000)
			wait(deposita);
		{
			monto+=cantidad;
			notify(extrae);
		}
	}
	public synchronized void extraer(int valor)
	{
		while(monto-valor <=0)
			wait(extrae);
		{
			monto-=valor;
			notify(deposita);
		}
	}
}