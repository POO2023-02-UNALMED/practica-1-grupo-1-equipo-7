package gestorAplicación;

public class AsignarEmpleadoEnvio{
	 private String referenciaPedido;
	 PedidoOnlineEnvio numeroOrden;
	 PedidoOnlineEnvio estadoPedido;
	 PedidoOnlineEnvio direccionPedido;
	 Empleado empleado;
	 //constructor7
	 public AsignarEmpleadoEnvio() {
		 
	 }
	
	public AsignarEmpleadoEnvio(String referenciaPedido, PedidoOnlineEnvio numeroOrden, Empleado empleado, PedidoOnlineEnvio estadoPedido, PedidoOnlineEnvio direccionPedido) {
		 this.referenciaPedido = referenciaPedido;
		 this.direccionPedido = direccionPedido;
		 this.referenciaPedido = referenciaPedido;
		 this.numeroOrden = numeroOrden;
		 this.empleado = empleado;
		 this.asignarDomiciliario(empleado);
	 }

	
	 public void asignarDomiciliario(Empleado domiciliario) {
	        this.empleado = domiciliario;
	 }
	
	 //getters and setters
	 public String getReferenciaPedido() {
		 return referenciaPedido;
		 
	 }
	 public void setReferenciaPedido(String referenciaPedido) {
		 this.referenciaPedido = referenciaPedido;
	 }
	 
}















package funcionalidades;

import gestorAplicación.*;
import java.util.*;




public class GenerarPedido {
	public static List<String> canasta;
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
        
		while (opcion2 != 1 && opcion2 != 2 && opcion2 != 3 && opcion2 != 4){
			System.out.println("Opción invalida");
		}
			System.out.println("------------Menu disponible en esta sede------------");
			System.out.println("Menu: " );
			System.out.println("¿Cuantos productos desea ordenar?");
			Scanner input13 = new Scanner(System.in);
			int productos;
			productos = input13.nextInt();
			
			
			while(productos > 0) {
				Scanner input4 = new Scanner(System.in);
				String productoCanasta;
				productoCanasta = input4.nextLine();
				
				Plato platoCanasta;
				platoCanasta = Plato.buscarPlato(productoCanasta);
				if(platoCanasta == null) {
				while(platoCanasta == null) {
					System.out.println("El plato no existe");
					System.out.println("Por favor ingrese un nuevo plato");
					String nuevoPlato;
					Scanner input5 = new Scanner(System.in);
					nuevoPlato = input5.nextLine();
					productoCanasta = nuevoPlato;
						
					}
				}
			GenerarPedido.canasta.add(productoCanasta);
			productos = productos-1;
			}
			
			
			
			
			
			
		    
		    
		    System.out.println("Productos escogidos");
			System.out.println("¿Desea ordenar algo mas?");
			Scanner input19= new Scanner(System.in);
			String opcion7;
			opcion7 = input19.nextLine();
			if (opcion7 != "y"){
				System.out.println("Progama Terminado");
			
			}
		    
		    
			
		    System.out.println(Pedido.setEstadoPedido("Confirmado"));

			// Enviar_una_notificación_dentro_de_la_aplicación_al_cliente
			String mensaje = "Su pedido con el número de orden " + Pedido.getNumeroOrden() + " ha sido confirmado. Pedido en espera para ser recogido.";
			System.out.print(mensaje);

			System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
			
			
			
			
			
			
			
			
		
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
		    opcion4 = input14.nextInt();
		    if (opcion4 != 1 && opcion4 != 2 && opcion4 != 3 && opcion4 != 4){
				System.out.println("Opción invalida");
		    }
			
			else {
				if (opcion4 == 1) {
				System.out.println("1. Sede Las americas");
				System.out.println("------------Menu disponible en esta sede------------");
				System.out.println("Menu: " );
				System.out.println("¿Que productos desea ordenar?");
				Scanner input16= new Scanner(System.in);
				int opcion6;
				opcion6 = input16.nextInt();
				
				System.out.println("Productos escogidos");
				System.out.println("¿Desea ordenar algo mas?");
				Scanner input9= new Scanner(System.in);
				String opcionr;
				opcionr = input9.nextLine();
				if (opcionr != "y"){
					System.out.println("Progama Terminado");
				    }
				}
			}
		    
			
		    
		    
		    System.out.println("Productos escogidos");
			System.out.println("¿Desea ordenar algo mas?");
			Scanner input9= new Scanner(System.in);
			String opcionRR;
			opcionRR = input9.nextLine();
			if (opcionRR != "y"){
				System.out.println("Progama Terminado");
			
			}
		    
		    
			
		    System.out.print(Pedido.setEstadoPedido("Confirmado"));

			// Enviar_una_notificación_dentro_de_la_aplicación_al_cliente
			String mensaje2 = "Su pedido con el número de orden " + Pedido.getNumeroOrden() + " ha sido confirmado. Su pedido va en camino. Gracias por su compra.";
			System.out.print(mensaje2);

			System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
		}
	}
}


