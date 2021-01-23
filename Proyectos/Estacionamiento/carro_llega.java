class carro_llega extends parking implements Runnable
{
	
	private estacionamiento e;
	
	public carro_llega(estacionamiento e){this.e=e;} 
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{   
                    P(mutex);
                    int entrada=(int)(Math.random()*4);
                    e.Esperar_llegada(entrada);
                    System.out.println("\n Carro llega a la entrada: " + entrada);
                    e.Elevar_barrera(entrada);
                    System.out.println("\t\t\t\t\tEl auto esta entrando por la puerta :"+ entrada);
                    e.meter_carro();
                    System.out.println("Desciende barrera");
                    V(mutex);
                   
                    
		}
	}
}
