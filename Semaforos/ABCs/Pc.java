class Pc extends ABCs implements Runnable
{
	public void run()
	{
		while(true)
		{
			nap( 1 + (int)(Math.random()*500) );
			P(B);
			P(sum);
			System.out.print("C ");
			V(C);
		}
	}
}
