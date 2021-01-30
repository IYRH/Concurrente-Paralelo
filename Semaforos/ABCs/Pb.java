
class Pb extends ABCs implements Runnable
{
	public void run()
	{
		while(true)
		{
			nap( 1 + (int)(Math.random()*500) );
			P(C);
			P(sum);
			System.out.print("B ");
			V(B);
		}
	}
}
