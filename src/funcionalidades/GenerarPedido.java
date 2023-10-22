package funcionalidades;

import java.util.Scanner;

import gestorAplicación.PedidoOnlineEnvio;
import gestorAplicación.PedidoOnlinefisico;

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
        System.out.println("1. Pedido Fisico:");
		System.out.println("Nuestras sedes disponibles");
        System.out.println("1. Sede Envigado");
        System.out.println("2. Sede Centro");
        System.out.println("3. sede Estadio");
        System.out.println("4. Sede Bello");
        System.out.println("En donde desea recojer el pedido: ");
		opcion = input1.nextInt();
    
				
			}
        }
	}



