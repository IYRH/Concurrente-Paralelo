class carro_sale extends MyObject implements Runnable
{
	private maquina m;
	private estacionamiento e;
	public carro_sale(maquina m ,estacionamiento e){this.m=m; this.e=e;} 
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{   
			e.sacar_carro();
			nap(300);
		}
	}
}

