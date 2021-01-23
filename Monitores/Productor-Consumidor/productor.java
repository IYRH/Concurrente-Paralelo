class productor extends MyObject implements Runnable
{
	private almacen alm;
	public productor(almacen a1){ alm=a1; }		//constructor
	public void run()
	{
		for(int i =1; i<=10; i++)
		{
			System.out.println("Se produce el valor "+i );
			alm.poner(i);
			nap(500);
		}
	}
}

