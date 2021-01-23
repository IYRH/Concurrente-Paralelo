

class misioneros extends MyObject
{
	
	public static void main(String[] args)
	{
		olla o = new olla();
		
		Thread c1 = new Thread(new cocinando(o));
		Thread c2 = new Thread(new comiendo(o));
		
		c1.start();
		c2.start();
		
	}
}

