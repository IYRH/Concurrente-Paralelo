import java.io.*;
import java.lang.*;

class leer
{
	public int entero()
	{
		String cad=new String();
		int dato=0;
		try
		{
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			cad = d.readLine();
			try{
				Integer x = new Integer(cad);
				dato = x.parseInt(cad);
			}catch(NumberFormatException a){System.out.println("Error: "+a.toString());return dato;}
			return dato;
		}catch(IOException e)
		{
			System.out.println("Error: "+e.toString());
			return dato;
		}	
	}
	public float flotante()
	{
		String cad=new String();
		float dato=0;
		try
		{
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			cad = d.readLine();
			try{
				Float x = new Float(cad);
				dato = x.parseFloat(cad);
			}catch(NumberFormatException a){System.out.println("Error: "+a.toString());return dato;}
			return dato;
		}catch(IOException e)
		{
			System.out.println("Error: "+e.toString());
			return dato;
		}	
	}
	public String cadena()
	{
		String cad=new String();
		try
		{
			BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
			cad=d.readLine();
			return cad;
		}catch(IOException e)
		{
			System.out.println("Error: "+e.toString());
			return cad;
		}
	}
	public char caracter()
	{
		String cad=new String();
		try
		{
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			try
			{	cad = d.readLine();
				return cad.charAt(0);
			}catch(StringIndexOutOfBoundsException a){System.out.println("Error: "+a.toString());return ' ';}
		}catch(IOException e)
		{
			System.out.println("Error: "+e.toString());
			return cad.charAt(0);
		}	
	}
	public float largo()
	{
		String cad=new String();
		long dato=0;
		try
		{
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			cad = d.readLine();
			try
			{
				Long x = new Long(cad);
				dato = x.parseLong(cad);
			}catch(NumberFormatException a){System.out.println("Error: "+a.toString());return dato;}
			return dato;
		}catch(IOException e)
		{
			System.out.println("Error: "+e.toString());
			return dato;
		}
		
			
	}
	public double doble()
	{
		String cad=new String();
		double dato=0.0;
		try
		{
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			cad = d.readLine();
			try
			{
				Double x = new Double(cad);
				dato = x.parseDouble(cad);
			}catch(NumberFormatException a){System.out.println("Error: "+a.toString()); return dato;}
			return dato;
		}catch(IOException e)
		{
			System.out.println("Error: "+e.toString());
			return dato;
		}
	}
}