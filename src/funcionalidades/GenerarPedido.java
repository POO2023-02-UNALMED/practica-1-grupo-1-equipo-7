package funcionalidades;

import gestorAplicación.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class GenerarPedido {
	
	//inicia_la_funcionalidad
	public static void main(String[] args) {
		boolean repetir;
		byte opciones;
		String salir;
		System.out.println("------------¿Qué tipo de pedido desea?------------");
		System.out.println("1. Pedido Fisico");
	    System.out.println("2. Pedido de envio");
	    Scanner input1= new Scanner(System.in);
	    int opcion;
	    opcion = input1.nextInt(); 
	    
	    
	    
	switch(opcion){
	
    case 1:
    	System.out.println("1. Pedido Fisico");
		System.out.println("Nuestras sedes disponibles");
        System.out.println("1. Sede Las americas");
        System.out.println("2. Sede Sandiego");
        System.out.println("3. Sede Envigado");
        System.out.println("4. Sede Belen");
        System.out.println("¿En donde desea recojer el pedido?");
        Scanner input12= new Scanner(System.in);
        int opcion2;
        opcion2 = input12.nextInt(); 
		if (opcion2 != 1 && opcion2 != 2 && opcion2 != 3 && opcion2 != 4){
			System.out.println("Opción invalida");
		}

		else{
			
			System.out.println("------------Menu disponible en esta sede------------");
			
			System.out.println("Menu: " + gestorAplicación.Menu.menu());
			System.out.println("Que productos desea escoger:");
			Scanner input13= new Scanner(System.in);
			int opcion3;
			opcion3 = input13.nextInt();
		}
	
		
			
			
		case 2:
			System.out.println("2. Pedido de envio");
			System.out.println("Nuestras sedes disponibles");
		    System.out.println("1. Sede Las americas");
		    System.out.println("2. Sede Sandiego");
		    System.out.println("3. Sede Envigado");
		    System.out.println("4. Sede Belen");
		    System.out.println("¿En donde desea recojer el pedido? Recuerde que debe ser una sede cerca de su casa.");
		    Scanner input14= new Scanner(System.in);
		    int opcion4;
		    if (opcion4 != 1 && opcion4 != 2 && opcion4 != 3 && opcion4 != 4){
				System.out.println("Opción invalida");
		    }
			
			else {
					
				System.out.println("------------Menu disponible en esta sede------------");
				System.out.println("Menu: " + gestorAplicación.Menu.menu());
				System.out.println("¿Que productos desea ordenar?");
				Scanner input13= new Scanner(System.in);
				int opcion3;
				opcion3 = input13.nextInt();
				opcion3.add(listMenu);
				menu.size();
				System.out.println("Productos escogidos");
				System.out.println("¿Desea ordenar algo mas?");
				 Scanner input15= new Scanner(System.in);
				    String opcion5;
				    if (opcion5 != "y"){
						System.out.println("Progama Terminado");
				    }
				    else {
				    	return case 2;
				    }
			}
		}
	}
}





