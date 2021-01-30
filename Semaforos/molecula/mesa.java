class mesa extends MyObject
{
	CountingSemaphore hidrogeno;
	CountingSemaphore oxigeno;
	public mesa(CountingSemaphore h, CountingSemaphore o)
	{
		hidrogeno=h;
		oxigeno=o;
	}
	public void poner_hidrogeno()
	{
		P(hidrogeno);
		System.out.println(" Se crea 1 atomo de Hidrogeno ");
		if(hidrogeno.value==0)
			V(oxigeno);
		
	}
	public void poner_oxigeno()
	{
		P(oxigeno);
		if(oxigeno.value==0 && hidrogeno.value==0)
		{
			System.out.println(" Se crea 1 atomo de Oxigeno ");
			System.out.println("\tSe crea  1 molecula de Agua \n");
			V(hidrogeno);
			V(hidrogeno);
		}
	}
}