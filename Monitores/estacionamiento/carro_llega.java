class carro_llega extends MyObject implements Runnable
{
	private maquina m;
	private estacionamiento e;
	
	public carro_llega(maquina m ,estacionamiento e){this.m=m; this.e=e;} 
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{   System.out.println("\nCarro llega");
		    m.oprimir();
			System.out.println("Tome su ticket");
			m.restaurar();
			e.meter_carro();
			nap(300);
		}
	}
}


