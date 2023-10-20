package UIMain;
import java.util.Scanner;

import funcionalidades.*;
import gestorAplicación.Caja;
import gestorAplicación.Inventario;
import gestorAplicación.Sedes;



public class main {
	static {
	Sedes laAmerica=new Sedes ("la america", "cra80 #45-b", 300, new Inventario(), new Caja( 10000000, 21345 ) );
	Sedes envigado=new Sedes ("envigado", " Carrera 43 N° 38 sur 35", 350, new Inventario(), new Caja( 10000000, 21346 ) );
	Sedes sandiego=new Sedes ("Sandiego", " Carrera 33#27-105", 380, new Inventario(), new Caja( 10000000, 21347 ));
	Sedes belen=new Sedes ("belen", " Carrera 42#33-A", 380, new Inventario(), new Caja( 10000000, 21347 ));
	}
	// esto se puede cambiar y meter a una lista en sedes, e iterar y si la opcion elegida es igual elegirlo:)
	
	
	
	
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
				System.out.println("2.Mostrar sedes ");
				Scanner inputb=new Scanner(System.in);
				int opcion2;
				opcion2=inputb.nextInt();
				switch(opcion2) {
				case 1:
					break;
				case 2:
					System.out.println("1.envigado");
					System.out.println("2.sandiego");	
					System.out.println("3.belen");
					System.out.print("4.la america");
					Scanner inputc= new Scanner(System.in);
					int opcion3;
					opcion3=inputc.nextInt();
					
					
					// logica para  mostrar los items eliminados y eliminarlos, en caso que no, no se elimina nada
					if (opcion3==1) {
						if (Sedes.getLista().get(0).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						Sedes.getLista().get(0).getInventario().mostrarItemsVencidos();
						System.out.print("Inventario vencido, eliminado");}
						
					}
					if (opcion3==2) {
						if (Sedes.getLista().get(1).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						Sedes.getLista().get(1).getInventario().mostrarItemsVencidos();
						System.out.print("Inventario vencido eliminado");}
					}
					if(opcion3==3) {
						if (Sedes.getLista().get(2).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						Sedes.getLista().get(2).getInventario().mostrarItemsVencidos();
						System.out.print("Inventario vencido eliminado");}
					}
					if(opcion3==4) {
						
						if (Sedes.getLista().get(3).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						Sedes.getLista().get(3).getInventario().mostrarItemsVencidos();
						System.out.print("Inventario vencido eliminado");}
						
						
					}
							
				
					
					
					
					
					
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
