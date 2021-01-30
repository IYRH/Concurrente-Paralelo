
class mujeres extends bano_disco implements Runnable
{
	private bano b;
	String nom;
	public mujeres(String nom, bano b){this.nom=nom;  this.b=b; }
	public void run()
	{
		System.out.println(nom+" intentando entrar");
		b.chicas();
		System.out.println("\t"+nom+" acaba de entrar");
		nap(100);
		System.out.println("\t\t\t\t"+nom+" salio");
		b.desbloquea_chicas();
	}
}
