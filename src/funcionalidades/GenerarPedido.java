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
			

			
			


		}
			}
		}
	}







