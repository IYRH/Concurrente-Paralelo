
class cuenta extends MyObject
{
	private int monto;
	private BinarySemaphore mutex;
	private BinarySemaphore puede_depositar;
	private BinarySemaphore puede_extraer;
	
	public cuenta(BinarySemaphore m1, BinarySemaphore pd1, BinarySemaphore  pe1)
	{
		mutex = m1;
		puede_depositar = pd1;
		puede_extraer = pe1;
		monto=20000;
	}
	public void ideposita(int value)
	{
		if( (monto + value) > 20000)
		{
			System.out.println("\n\t\tSobrepasa limite, hay: "+monto+"\n");
			P(puede_depositar);
		}
		else
		{
			P(mutex);	
			monto +=  value;
			System.out.println(" Se deposito "+value);
			V(mutex);
			V(puede_extraer);
		}
	}
	public void iextrae(int value)
	{
		if( (monto - value) < 0)
		{	
			System.out.println("\n\t\tNo suficiente, hay "+monto+"\n");
			P(puede_extraer);
		}
		else
		{
			P(mutex);	
			monto -= value;
			System.out.println("\t\t\t\tSe extrajo "+value);
			V(mutex);
			V(puede_depositar);
		}
	}
}
