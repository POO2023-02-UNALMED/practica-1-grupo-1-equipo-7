package funcionalidades;

import java.util.Scanner;

import gestorAplicación.*;

public class GenerarPedido {
	private String TipoPedido;
	private String nombreSede;
	
	public static void main(String[] args) {
		System.out.println("¿Qué tipo de pedido desea?");
		System.out.println("1. Pedido Fisico");
	    System.out.println("2. Pedido de envio");
	    
	    Scanner input1 = new Scanner(System.in);
        int opcion;
        opcion = input1.nextInt();
	
	switch(opcion){
	
    case 1:
    	
        System.out.println("---¿Qué tipo de pedido desea?---");
        System.out.println("1. Pedido Fisico");
        System.out.println("2. Pedido de envio");
        opcion = input1.nextInt();
        
        switch(opcion){
        
        	case 1:
        		System.out.println("---¿Qué tipo de pedido desea?---");
				System.out.println("1. Pedido Fisico:");
				opcion = input1.nextInt();
    
				
			}
        }
	}
}



