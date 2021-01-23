import java.io.*;
class cola2
{
	public static void main(String[] args)
	{	char opc;
		String cad;
		cola_enlazada c = new cola_enlazada();
		leer lee = new leer();
		do
		{
			System.out.print("\n\n\n\t\t\tM E N U\n\n"
							  +"\ta\tInsertar\n"
							  +"\tb\tExtraer\n"
							  +"\tc\tVer\n"
							  +"\td\tSalir\n\n"
							  +"\tElige la Opcion: ");	
			opc=lee.caracter();
			
			switch(opc)
			{
				case 'a' :	
							System.out.print("\n\tCadena a insertar: ");
							cad=lee.cadena();
							c.insertar(cad);
							break;
				case 'b' :	
							System.out.println("\n\t- "+c.extrae());
							break;
				case 'c' :	
							c.ver();
							break;
				case 'd' :	
							break;
				default:
							for(int i=0; i<=80; i++)
								System.out.println();
							break;
			}
			
		}while(opc!='d');
				
	}
}
