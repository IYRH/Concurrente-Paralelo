import java.io.*;
import java.lang.*;

public class banco extends MyObject
{
	public static void main(String[] args)
	{
		cajero c    = new cajero();
		
		Thread c1 = new Thread ( new cliente1(c) );
		Thread c2 = new Thread ( new cliente2(c) );
		c1.start();
		c2.start();
	}
}