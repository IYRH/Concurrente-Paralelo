
class maquina extends MyObject
{
	private boolean boton;
	private ConditionVariable oprime = null;
	private ConditionVariable restaura = null;

	public maquina()
	{
		boton=false;
		oprime = new ConditionVariable();
		restaura = new ConditionVariable();
	}	//presionar
	
	public synchronized void oprimir()
	{
		if(boton)
			wait(oprime);
		else
		{
			System.out.println("Se oprime Boton");
			boton = true;
			notify(restaura);
		}
	}
	public synchronized void restaurar()
	{
		if(!boton)
			wait(restaura);
		else
		{
			System.out.println("Se restaura Boton");
			boton=false;
			notify(oprime);
		}
	}
	public boolean getEstado()
	{ return boton;}
}

