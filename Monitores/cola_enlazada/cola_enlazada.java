class cola_enlazada
{	private nodo frente, fondo;
	private int size;
	public cola_enlazada()		
	{	frente = null;
		fondo  = null;
		size = 0;
	}
	public int size()
	{	return size;
	}
	public void insertar(String s)
	{	nodo nuevo = new nodo();
		nuevo.setinfo(s);
		size++;
		if( frente==null && fondo==null )
		{	frente = nuevo;
			fondo  = nuevo;
		}
		else
		{	fondo.setprox(nuevo);
			fondo = nuevo;
		}
	}
	public String extrae()
	{	String temp = new String("Cola vacia");
		if(size > 0)
		{	if(frente == fondo)		//hay un solo nodo
			{	temp=frente.getinfo();
				frente = null;
				fondo  = null;
			}
			else
			{	temp=frente.getinfo();	
				frente = frente.getprox();
			}
			size--;
		}
		return temp;
	}
	public void ver()
	{
		nodo nuevo = new nodo();
		if(size==0)	
			System.out.println("\n\tCola Enlazada Vacia");
		else
		{	System.out.println("");
			nuevo=frente;
			do
			{	System.out.println("\tCadena: "+nuevo.getinfo());
				nuevo=nuevo.getprox();	
			}while(nuevo!=null);
		}
	}
}
