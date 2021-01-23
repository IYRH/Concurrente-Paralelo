
class estacionamiento extends MyObject
{
	private int cont;
	private int tam;
	private boolean lleno;
	private ConditionVariable saca = null;
	private ConditionVariable mete = null;

	public estacionamiento(int x)
	{
		tam=x; 
		cont=0; 
		lleno=false; 
		saca = new ConditionVariable();
		mete = new ConditionVariable();
	}
	
	public synchronized void meter_carro()
	{
		if(cont == tam)
		{
			System.out.println("Espere...   Estacionamiento Lleno... \n");
			lleno=true;
		}
		
		if(lleno )
			wait(mete);
		System.out.println("Se levanta la barra, el Semaforo esta en verde");
		cont++;
		System.out.println("El Auto esta entrando");
		System.out.println("Se baja la barra");
		notify(saca);
	}
	public synchronized void sacar_carro()
	{
		if(cont==0)
		{
			wait(saca);
		}
		System.out.println("\n\t\t\t\tSe lev la barra, el Sem esta en verde");
		cont--;
		lleno=false;
		System.out.println("\t\t\t\tEl Auto esta saliendo");
		notify(mete);
		System.out.println("\t\t\t\tSe baja la barra\n");

	}
}
