package funcionalidades;

import gestorAplicación.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class GenerarPedido {
	
	static ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

	static {// las sedes que tenemos si algo sugerencias o las cambias, no problema :)

			Inventario inventario1 = new Inventario();
			Inventario inventario2 = new Inventario();
			Inventario inventario3 = new Inventario();
			Inventario inventario4 = new Inventario();
			
	ArrayList<Plato> menu1 = new ArrayList<Plato>();
	for (Plato platos : Plato.getPlatos().keySet()) {
        menu1.add(platos);
	}
    ArrayList<Plato> menu2 = new ArrayList<Plato>();
	for (Plato platos : Plato.getPlatos().keySet()) {
        menu2.add(platos);
	}
	ArrayList<Plato> menu3 = new ArrayList<Plato>();
	for (Plato platos : Plato.getPlatos().keySet()) {
        menu3.add(platos);
	}
	ArrayList<Plato> menu4 = new ArrayList<Plato>();
	for (Plato platos : Plato.getPlatos().keySet()) {
        menu4.add(platos);
	}
	
	
	restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Envigado", "Calle 1", inventario1,
			new Caja(1000000, 1234), 1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));
	restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Sandiego", "Calle 2", inventario2,
			new Caja(10000000, 1235), 1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));
	restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Belen", "Calle 3", inventario3,
			new Caja(10000000, 1236), 1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));
	restaurantes.add(new Restaurante("La Casa de Toño", "Sede: La America", "Calle 4", inventario4, new Caja(),
			1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));
	
	
	
	ArrayList<Item> ingredientesTacos = new ArrayList<>();
	ingredientesTacos.add(Item.buscarItem("Tortilla"));
	ingredientesTacos.add(Item.buscarItem("Carne"));
	ingredientesTacos.add(Item.buscarItem("Cebolla"));
	ingredientesTacos.add(Item.buscarItem("Cilantro"));

	ArrayList<Item> ingredientesTostadas = new ArrayList<>();
	ingredientesTostadas.add(Item.buscarItem("Tostada"));
	ingredientesTostadas.add(Item.buscarItem("Carne"));
	ingredientesTostadas.add(Item.buscarItem("Cebolla"));
	ingredientesTostadas.add(Item.buscarItem("Cilantro"));
	ArrayList<Item> ingredientesQuesadillas = new ArrayList<>();
	ingredientesQuesadillas.add(Item.buscarItem("Tortilla"));
	ingredientesQuesadillas.add(Item.buscarItem("Queso"));
	ArrayList<Item> ingredientesSopes = new ArrayList<>();
	ingredientesSopes.add(Item.buscarItem("Tortilla"));
	ingredientesSopes.add(Item.buscarItem("Frijoles"));
	ingredientesSopes.add(Item.buscarItem("Carne"));
	ingredientesSopes.add(Item.buscarItem("Cebolla"));
	ingredientesSopes.add(Item.buscarItem("Cilantro"));
	ArrayList<Item> ingredientesTamales = new ArrayList<>();
	ingredientesTamales.add(Item.buscarItem("Masa"));
	ingredientesTamales.add(Item.buscarItem("Carne"));
	ArrayList<Item> ingredientesEnchiladas = new ArrayList<>();
	ingredientesEnchiladas.add(Item.buscarItem("Tortilla"));
	ingredientesEnchiladas.add(Item.buscarItem("Queso"));
	ingredientesEnchiladas.add(Item.buscarItem("Carne"));
	ArrayList<Item> ingredientesPozol = new ArrayList<>();
	ingredientesPozol.add(Item.buscarItem("Maiz"));
	ingredientesPozol.add(Item.buscarItem("Carne"));
	ingredientesPozol.add(Item.buscarItem("Cebolla"));
	ingredientesPozol.add(Item.buscarItem("Cilantro"));
	
	Plato tacos = new Plato("Tacos", ingredientesTacos, 2000);
	System.out.print(tacos.getIngredientes());

	Plato tostadas = new Plato("Tostadas", ingredientesTostadas, 2000);
	System.out.print(ingredientesTostadas);
	Plato quesadilla = new Plato("Quesadillas", ingredientesQuesadillas, 5000);
	Plato sopes = new Plato("Sopes", ingredientesSopes, 6000);
	Plato tamales = new Plato("Tamales", ingredientesTamales, 7000);
	Plato enchilada = new Plato("Enchiladas", ingredientesEnchiladas, 8000);
	Plato pozol = new Plato("Pozol", ingredientesPozol, 9000);
	
	new Pedido(null, "Calle 2", " Pedido Fisico", new Restaurante(), new Cliente("David Gonzales", 123), new Empleado("Jose", "Domiciliario", 20000, 4791));
	new Pedido(null, "Calle 17 - 2", " Pedido de Envio", new Restaurante(), new Cliente("Andres Gutierres", 324), new Empleado("Daniel", "Domiciliario", 20000, 4791));
	new Pedido(null, "Calle 22 - 1", " Pedido de Envio", new Restaurante(), new Cliente("Carlos Duque", 456), new Empleado("Jose", "Domiciliario", 20000, 4791));
	new Pedido(null, "Calle 5 - 2", " Pedido Fisico", new Restaurante(), new Cliente("Carolina Leño", 145), new Empleado("Daniel", "Domiciliario", 20000, 4791));
	
	
	
	}



	
	

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
	    for( i=0; i< Restaurante.getSedes().size(); i++) {
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
				String mensaje2 = "Su pedido con el número de orden " + Pedido.getNumeroOrden() + " ha sido confirmado. Su pedido va en camino." + "\n";
				System.out.print(mensaje2);
				
				System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente."  + "\n");
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
						if (opcionRR != "N"){
							repetir case2;
						}
						else {
							System.out.println("Gracias por su compra.");
							System.out.println("Progama Terminado");
				    }
				}
			}
			
		}
	}
}
	







