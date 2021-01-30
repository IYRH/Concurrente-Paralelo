
class Pa extends ABCs implements Runnable
{
	public void run()
	{
		while(true)
		{
			nap( 1 + (int)(Math.random()*500) );
			System.out.print("A ");
			V(sum);
		}
	}
}
