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
		int i;
	    for( i=0; i<Restaurante.getSedes().size(); i++) {
	    	System.out.println(i+1 + ". " + Restaurante.getSedes().get(i).getUbicacion());
	    }
		System.out.println("¿En donde desea recojer el pedido? Recuerde que debe ser una sede cerca de su casa.");
		Scanner input2= new Scanner(System.in);
	    int opcion1;
		opcion1 = input2.nextInt();
		String sede = Restaurante.getSedes().get(opcion1-1).getUbicacion();
		if(opcion1 > i){
			System.out.println("Opción invalida");
		}
		else {
			System.out.println("------------Menu disponible en esta sede------------");
			int j = 1;
			for(Plato platos : Restaurante.getMenu(sede)) {
				System.out.println(j++ + ". " + platos.getNombre() + " " + platos.getPrecio());
			}
			System.out.println("¿Cuantos platos desea ordenar?");
			Scanner input3= new Scanner(System.in);
		    int opcion2;
			opcion2 = input3.nextInt();
			ArrayList<Plato> platos = new ArrayList<>();
			for(int k = 0; k < opcion2; k++) {
				System.out.println("Ingrese el nombre del plato");
				Scanner input4= new Scanner(System.in);
			    String opcion3;
				opcion3 = input4.nextLine();
				platos.add(Plato.buscarPlato(opcion3));
			}
			System.out.println("Confirma tus productos");
			for(Plato plato : platos) {
				System.out.println(plato.getNombre() + " " + plato.getPrecio());
			}
			System.out.println("¿Desea confirmar su pedido? (S/N)");
			Scanner input5= new Scanner(System.in);
		    String opcion4;
			opcion4 = input5.nextLine();
			if(opcion4 == "S"){
				System.out.println("Pedido confirmado");
			}
				
		
				System.out.println("Productos escogidos");
				// Enviar_una_notificación_dentro_de_la_aplicación_al_cliente
				String mensaje2 = "Su pedido con el número de orden "  + " ha sido confirmado. Su pedido va en camino.";
				System.out.print(mensaje2);
				
				System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
				System.out.println("¿Desea ordenar algo mas (S/N)?");
				Scanner input9= new Scanner(System.in);
				String opcionRR;
				opcionRR = input9.nextLine();
				if (opcionRR != "N"){
					System.out.println("Gracias por su compra.");
					System.out.println("Progama Terminado");
				}
				
			}
	

		case 2:
			System.out.println("2. Pedido de envio");
			System.out.println("Nuestras sedes disponibles");
			int i2;
		    for( i2=0; i2<Restaurante.getSedes().size(); i2++) {
		    	System.out.println(i2+1 + ". " + Restaurante.getSedes().get(i2).getUbicacion());
		    }
			System.out.println("¿En donde desea recojer el pedido? Recuerde que debe ser una sede cerca de su casa.");
			Scanner inputS2= new Scanner(System.in);
		    int opcion2;
			opcion2 = inputS2.nextInt();
			String sede2 = Restaurante.getSedes().get(opcion2-1).getUbicacion();
			if(opcion2 > i2){
				System.out.println("Opción invalida");
			}
			else {
				System.out.println("------------Menu disponible en esta sede------------");
				int j = 1;
				for(Plato platos : Restaurante.getMenu(sede2)) {
					System.out.println(j++ + ". " + platos.getNombre() + " " + platos.getPrecio());
				}
				System.out.println("¿Cuantos platos desea ordenar?");
				Scanner input3= new Scanner(System.in);
			    int opcionP;
				opcionP = input3.nextInt();
				ArrayList<Plato> platos = new ArrayList<>();
				for(int k = 0; k < opcion2; k++) {
					System.out.println("Ingrese el nombre del plato");
					Scanner input4= new Scanner(System.in);
				    String opcion3;
					opcion3 = input4.nextLine();
					platos.add(Plato.buscarPlato(opcion3));
				}
				System.out.println("Confirma tus productos");
				for(Plato plato : platos) {
					System.out.println(plato.getNombre() + " " + plato.getPrecio());
				}
				System.out.println("¿Desea confirmar su pedido? (S/N)");
				Scanner input5= new Scanner(System.in);
			    String opcion4;
				opcion4 = input5.nextLine();
				if(opcion4 == "S"){
					System.out.println("Pedido confirmado");
					 System.out.println("Productos escogidos");
						// Enviar_una_notificación_dentro_de_la_aplicación_al_cliente
						String mensaje2 = "Su pedido con el número de orden "  + " ha sido confirmado." + "\n"+ "Su pedido va en camino.";
						System.out.print(mensaje2);

						System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
						System.out.println("¿Desea ordenar algo mas? (S/N)");
						Scanner input9= new Scanner(System.in);
						String opcionRR;
						opcionRR = input9.nextLine();
						if (opcionRR != "y"){
							System.out.println("Gracias por su compra.");
							System.out.println("Progama Terminado");
				    }
				}
			}
			
		}
	}

}
	







