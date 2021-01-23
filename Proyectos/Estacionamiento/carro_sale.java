class carro_sale extends parking implements Runnable
{
	
	private estacionamiento e;
	public carro_sale(estacionamiento e){this.e=e;} 
	
	public void run()
	{
                
		for(int i=1; i<=10; i++)
		{   
                    P(mutex);
                    int salida=(int)((Math.random()*4))+5;
                    System.out.println("\n Auto listo para salir");
                    e.Elevar_barrera(salida);
                    nap(5000);
                    System.out.println("\t\t\t\t\tEl auto esta saliendo por la puerta :"+ salida);
                    e.sacar_carro();
                    System.out.println("Desciende barrera");
                    V(mutex);
                  
		}
	}
}
