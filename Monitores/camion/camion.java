class camion extends MyObject
{
	private int Npasajeros;
	private ConditionVariable llena = null;
	private ConditionVariable vacia = null;
	
	public camion()
	{	
		llena = new ConditionVariable();
		vacia = new ConditionVariable();
		Npasajeros=0;
	}
	
	public synchronized void llenar(int indice)
	{
		while(Npasajeros >= 25)
		{
			notify(vacia);
			wait(llena);
		}
		System.out.println("Se sube el pasajero "+indice);
		Npasajeros++;
	}
	
	public synchronized void vaciar(int i)
	{
		while(Npasajeros <25)
			wait(vacia);
		
		Npasajeros=0;
		System.out.println("Sale camion "+i);
		notify(llena);
	}
}