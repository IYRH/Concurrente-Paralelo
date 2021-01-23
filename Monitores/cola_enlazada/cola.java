import java.io.*;

class cola
{
	public static void main(String[] args)
	{	int opc;
		String cad;
		cola_enlazada c = new cola_enlazada();
		leer lee = new leer();
		do
		{
			System.out.print("\n\n\n\t\t\tM E N U\n\n"
							  +"\t1.\tInsertar\n"
							  +"\t2.\tExtraer\n"
							  +"\t3.\tVer\n"
							  +"\t4.\tSalir\n\n"
							  +"\tElige la Opcion: ");	
			opc=lee.entero();
			
			switch(opc)
			{
				case 1 :	
							System.out.print("\n\tCadena a insertar: ");
							cad=lee.cadena();
							c.insertar(cad);
							break;
				case 2 :	
							System.out.println("\n\t- "+c.extrae());
							break;
				case 3 :	
							c.ver();
							break;
				case 4 :	
							break;
				default:
							for(int i=0; i<=80; i++)
								System.out.println();
							break;
			}
			
		}while(opc!=4.0);
				
	}
}

