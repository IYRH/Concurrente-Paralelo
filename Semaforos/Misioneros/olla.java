
class olla extends MyObject
{
	CountingSemaphore mis;
	BinarySemaphore   puede;
	
	public olla(CountingSemaphore n, BinarySemaphore p)
	{
		mis = n;
		puede = p;	
	}
	
	public void cocina(int i)
	{
		P(mis);
		nap(100);
		System.out.println(" Se esta cocinando al misionero "+i);
		nap(100);
		if(mis.value==0)		//olla llena
		{
			System.out.println("\n Olla llena\n");	
			V(puede);
		}
	}
	public void come()
	{
		P(puede);
		for(int i=1; i<=10; i++)
		{
			V(mis);
			System.out.println("\t\t\t\t   Salvaje se come al misionero "+i);
			nap(100);
		}
	}
}
