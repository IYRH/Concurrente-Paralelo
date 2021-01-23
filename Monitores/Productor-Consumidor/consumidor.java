class consumidor extends MyObject implements Runnable
{
	private almacen alm;
	public consumidor(almacen a1){ alm=a1; }		//constructor
	public void run()
	{
		int temp;
		for(int i =1; i<=10; i++)
		{
			temp=alm.sacar();
			System.out.println("\t\tSe consumio el valor "+temp);
			nap(500);
		}
	}
}

