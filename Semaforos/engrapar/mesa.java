
class mesa extends MyObject
{
	CountingSemaphore SA = new CountingSemaphore(4);	//amontar
	CountingSemaphore SG = new CountingSemaphore(1);	//engrapar
	
	public void mesa(CountingSemaphore A, CountingSemaphore G)
	{	SA=A; 	SG=G;
	}
	public void mesa()
	{	;
	}
	public void amontona(int i)
	{
		P(SA);
		System.out.println("Se pone la hoja "+i+" en la mesa");
		nap(500);			//sleep
		if(SA.value == 0)
			V(SG);
	}
	public void grapar()
	{
		P(SG);
		if(SG.value == 0 && SA.value==0)
		{
			System.out.println("\nSe engraparon 4 hojas\n");
			V(SA); V(SA); V(SA); V(SA);
		}
	}
}
