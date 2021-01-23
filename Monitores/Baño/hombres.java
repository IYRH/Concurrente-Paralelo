class hombres extends MyObject implements Runnable
{
	private bano b;
	private String nom;
	public hombres(String nom, bano b)
	{
			this.nom = nom;
			this.b=b; 
	}
	public void run()
	{
		System.out.println(""+nom+" intentando entrar al bano");
		b.chicos();
		System.out.println("\t"+nom+" acaba de entrar al bano");

		nap(500);
		
		System.out.println("\t\t"+nom+" salio del bano");
		b.desbloquea_chicos();

		nap(500);
	}
}
