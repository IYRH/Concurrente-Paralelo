
import java.util.ArrayList;


class estacionamiento extends MyObject
{
	private BinarySemaphore  lleno = null;
	private BinarySemaphore  mutex = null;
	private CountingSemaphore cont = null;
	private int tam;
        
        ArrayList<BinarySemaphore> barrera = new  ArrayList<BinarySemaphore> ();
        
	public estacionamiento()
	{
		mutex = new BinarySemaphore(1);
		cont  = new CountingSemaphore(0);
		lleno = new BinarySemaphore(1);	
		tam=3;
                for(int i=0; i<10; i++){
                    barrera.add(i, new BinarySemaphore(1));
                }
	}
	public void meter_carro()
	{
		P(lleno);
		V(cont);
		P(mutex);
		if(cont.value==tam)
			System.out.println("Estacionamiento lleno");
		V(mutex);
               
	}
	public void sacar_carro()
	{
		P(mutex);
		if(cont.value!=0)
			P(cont);
		V(lleno);
		V(mutex);
            
	}
        
        public void Elevar_barrera(int indice)
        {
           
            P(mutex);
            P(barrera.get(indice));
	    System.out.println("Se levanta la barra: " + indice);
	    V(barrera.get(indice));
          
            V(mutex);
        }
        
        public void Esperar_llegada(int indice)
        {
            P(mutex);
            System.out.println("\n Entrada " + indice + " en espera");
            V(mutex);
            
        }
}

	