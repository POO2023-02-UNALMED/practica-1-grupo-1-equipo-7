package UIMain;
import java.util.Scanner;

import funcionalidades.*;

public class main {
	public static void main(String[] args) {
		System.out.println("1. Ver menú\n2. Registro del restaurante\n3. Inventario\n4. Atención al cliente\n5. Reportes\n6. Salir");
		Scanner input1 = new Scanner(System.in);
	    int  opcion;
	    opcion = input1.nextInt();

		switch(opcion){
			case 1:
				System.out.println("Ver menú");
				break;
			case 2:
				System.out.println("Registro del restaurante");
				break;
			case 3:
				System.out.println("Inventario");
				
				System.out.println("1.Salir");
				System.out.println("2.Mostrar inventario ");
				Scanner inputb=new Scanner(System.in);
				int opcion2;
				opcion2=inputb.nextInt();
				switch(opcion) {
				case 1:
					break;
				case 2:
					
					
					
				}
				
				break;
			case 4:
				System.out.println("Atención al cliente");
				break;
			case 5:
				System.out.println("Reportes");
				Reportes.main(args);
				break;
			case 6:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opción no válida");
				break;







	}
}
}
