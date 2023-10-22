package funcionalidades;

import java.time.LocalDate;
import java.util.Scanner;

import gestorAplicación.Empleado;
import gestorAplicación.PedidoOnlineEnvio;
import gestorAplicación.PedidoOnlinefisico;

public class GenerarPedido {
	private String TipoPedido;
	private String nombreSede;
	
	public static void main(String[] args) {
		boolean repetir;
		byte opcion;
		String salir;
		System.out.println("¿Qué tipo de pedido desea?");
		System.out.println("1. Pedido Fisico");
	    System.out.println("2. Pedido de envio");
	    
	    Scanner input1 = new Scanner(System.in);
        int opcion;
        opcion = input1.nextInt();
	
	switch(opcion){
	
    case 1:
       
		System.out.println("Nuestras sedes disponibles");
        System.out.println("1. Sede Las americas");
        System.out.println("2. Sede Sandiego");
        System.out.println("3. Sede Envigado");
        System.out.println("4. Sede Belen");
        System.out.println("En donde desea recojer el pedido: ");
		opcion = input1.nextInt();
		if (opcion ){
			System.out.println("Opción invalida");
		}

		else{
			
			System.out.println("En donde desea recojer el pedido: ");
			System.out.println("------------Menu disponible en esta sede------------");
			System.out.println("Qque productos desea escoger:");
			String fecha = input1.next();
			LocalDate fechaInicio = LocalDate.parse(fecha);
			System.out.println("Ingrese la fecha de fin");
			LocalDate fechaFin;
			while(true){
				fecha = input1.next();
				fechaFin = LocalDate.parse(fecha);
				if(fechaFin.isBefore(fechaInicio)){
					System.out.println("La fecha de fin debe ser posterior a la fecha de inicio");
				}
				else{
					break;
					}
				}
			}
        }
	}
}



