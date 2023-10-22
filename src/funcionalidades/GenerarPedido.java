package funcionalidades;

import gestorAplicación.*;
import java.time.LocalDate;
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
			private List<String> platos;
			System.out.println("------------Menu disponible en esta sede------------");
			System.out.println("Menu: " + Menu.Map());
			System.out.println("Que productos desea escoger:");
			}
		}
	case 2:
		
	}
}



