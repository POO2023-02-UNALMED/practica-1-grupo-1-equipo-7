package UIMain;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import funcionalidades.*;
import gestorAplicación.*;



public class main {
	
	static ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
	
	static {// las sedes que tenemos si algo sugerencias o las cambias, no problema :)
		
	Inventario inventario1=new Inventario();
	Inventario inventario2 = new Inventario();
	Inventario inventario3 = new Inventario();
	Inventario inventario4 = new Inventario();
	
	
    restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Envigado", "Calle 1", inventario1, new Caja(), 1234567, new Date(), new ArrayList<Plato>(), new ArrayList<Mesa>()));
    restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Sandiego", "Calle 2", inventario2, new Caja(), 1234567, new Date(), new ArrayList<Plato>(), new ArrayList<Mesa>()));
    restaurantes.add(new Restaurante("La Casa de Toño", "Sede: belen", "Calle 3", inventario3, new Caja(), 1234567, new Date(), new ArrayList<Plato>(), new ArrayList<Mesa>()));
    restaurantes.add(new Restaurante("La Casa de Toño", "Sede: la america", "Calle 4", inventario4, new Caja(), 1234567, new Date(), new ArrayList<Plato>(), new ArrayList<Mesa>()));
    
	
	}
	
	static{// por ahora lo trabajaré así, es posible que use un enumerado, si tienen alguna recomendación lo agradecería :)
		new Item("Tortilla", 100, 0.50,"01/01/2024",Inventario.obtenerInventarios().get(0));
        new Item("Carne", 100, 1.00,"01/01/2020",Inventario.obtenerInventarios().get(1));
        new Item("Cebolla", 100, 0.25,"01/01/2020",Inventario.obtenerInventarios().get(0));
        new Item("Cilantro", 100, 0.25,"01/01/2020",Inventario.obtenerInventarios().get(2));
        new Item("Tostada", 100, 0.50,"01/01/2020",Inventario.obtenerInventarios().get(3));
        new Item("Queso", 100, 0.50,"01/01/2020",Inventario.obtenerInventarios().get(1));
        new Item("Frijoles", 100, 0.50,"01/01/2020", Inventario.obtenerInventarios().get(2));
        new Item("Masa de Pizza", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
        new Item("Salsa de Tomate", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(1));
        new Item("Crema de Champiñones", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
        new Item("Maíz en Lata", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(2));
        new Item("Sopa de Champiñones", 100, 0.80, "01/01/2020", Inventario.obtenerInventarios().get(3));
        new Item("Lasaña de Pollo", 100, 1.50, "01/01/2020", Inventario.obtenerInventarios().get(1));
        new Item("Brócoli", 100, 1.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
        new Item("Sándwich de Pollo", 100, 1.20, "01/01/2020", Inventario.obtenerInventarios().get(0));
        new Item("Hamburguesa de Pollo", 100, 1.50, "01/01/2020", Inventario.obtenerInventarios().get(3));
        new Item("Pizza de Pepperoni", 100, 1.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
        new Item("Pasta Carbonara", 100, 1.20, "01/01/2020", Inventario.obtenerInventarios().get(1));
        new Item("Sashimi de Salmón", 100, 2.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
        new Item("Tacos de Carne", 100, 1.25, "01/01/2020", Inventario.obtenerInventarios().get(3));
        new Item("Agua Mineral", 100, 2.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
        new Item("Vino Blanco", 100, 3.00, "01/01/2020", Inventario.obtenerInventarios().get(1));
        new Item("Café Espresso", 100, 0.90, "01/01/2020", Inventario.obtenerInventarios().get(0));
        new Item("Té de Manzanilla", 100, 0.80, "01/01/2020", Inventario.obtenerInventarios().get(3));
        new Item("Refresco de Naranja", 100, 1.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
        new Item("Helado de Fresa", 100, 1.20, "01/01/2020", Inventario.obtenerInventarios().get(1));
        new Item("Pastel de Vainilla", 100, 1.50, "01/01/2020", Inventario.obtenerInventarios().get(0));

        
        
        
        
        
        /* new Item("Masa", 100, 0.50,"01/01/2020");// los relleno ahora sino que voy a probar el probar el programa
        new Item("Salsa", 100, 0.50,"01/01/2020");
        new Item("Crema", 100, 0.50,"01/01/2020");
        new Item("Maiz", 100, 0.50,"01/01/2020");
        new Item("Sopa de Tomate", 100, 0.80, "01/01/2020");
        new Item("Lasagna", 100, 1.50, "01/01/2020");
        new Item("Espárragos", 100, 1.00, "01/01/2020");
        new Item("Sándwich de Pavo", 100, 1.20, "01/01/2020");
        new Item("Hamburguesa", 100, 1.50, "01/01/2020");
        new Item("Pizza Margarita", 100, 1.00, "01/01/2020");
        new Item("Pasta Alfredo", 100, 1.20, "01/01/2020");
        new Item("Sushi", 100, 2.50, "01/01/2020");
        new Item("Tacos de Pescado", 100, 1.25, "01/01/2020");
        new Item("Cerveza", 100, 2.00, "01/01/2020");
        new Item("Vino Tinto", 100, 3.00, "01/01/2020");
        new Item("Café", 100, 0.90, "01/01/2020");
        new Item("Té Verde", 100, 0.80, "01/01/2020");
        new Item("Refresco de Cola", 100, 1.00, "01/01/2020");
        new Item("Helado de Vainilla", 100, 1.20, "01/01/2020");
        new Item("Pastel de Chocolate", 100, 1.50, "01/01/2020");*/
			        
	}

		
		
	
	// esto se puede cambiar y meter a una lista en sedes, e iterar y si la opcion elegida es igual elegirlo:)
	
	
	
	
	public static void main(String[] args) {
		System.out.println("1. Ver menú\n2. Registro del restaurante\n3. Inventario\n4. Atención al cliente\n5. Reportes\n6. Reservaciones\n7. Salir");
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
					System.out.println("1. Envigado");
					System.out.println("2. Sandiego");	
					System.out.println("3. Belen");
					System.out.print("4. La America");
					Scanner inputc= new Scanner(System.in);
					int opcion3;
					opcion3=inputc.nextInt();
					
					
					// logica para  mostrar los items eliminados y eliminarlos, en caso que no, no se elimina nada
					if (opcion3==1) {
						if (Restaurante.restaurantes.get(0).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						System.out.print(Restaurante.getSedes().get(0).getInventario().mostrarItemsVencidos());
						Restaurante.restaurantes.get(0).getInventario().eliminarVencidos();
						
						System.out.print("Inventario vencido, eliminado");}
						
					}
					if (opcion3==2) {
						if (Restaurante.restaurantes.get(1).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						System.out.print(Restaurante.restaurantes.get(1).getInventario().mostrarItemsVencidos());
						System.out.print("Inventario vencido eliminado");}
					}
					if(opcion3==3) {
						if (Restaurante.restaurantes.get(2).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						System.out.print(Restaurante..get(2).getInventario().mostrarItemsVencidos());
						System.out.print("Inventario vencido eliminado");}
					}
					if(opcion3==4) {
						
						if (Restaurante.restaurantes.get(3).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						System.out.print(Restaurante.restaurantes.get(3).getInventario().mostrarItemsVencidos());
						System.out.print("Inventario vencido eliminado");}
						
						
					}
					
					
					System.out.print(" Salir");
					System.out.print("Continuar");
					Scanner inputd =new Scanner(System.in);
					String  esc;
					esc=inputd.nextLine();
					if(esc.equals("salir")) {
						break;
						
						
					}
					if(esc.equals("continuar")) {
						System.out.print("1.Mostrar inventario");
						System.out.print("2. retirar item inventario");
						System.out.print("3.Revisar niveles de Stock");
						System.out.print("4.Registrar articulo en inventario");
						System.out.print("5.Renovar inventario");
						System.out.print("6.Valor del inventario total");
						System.out.print("7.Precio articulo del inventario ");
						System.out.print("Cambiar de sede");
						Scanner inputf=new Scanner(System.in);
						int opcionf;
						opcionf=inputf.nextInt();
						
						
						switch(opcionf) {
						case 1:
							Inventario.obtenerInventarios().get(opcion3).mostrarInventario(null);
							break;
						case 2:
							System.out.print("¿");
						case 3:
							System.out.print("Los articulos sin stock son:");
							System.out.print(Inventario.obtenerInventarios().get(opcion3).obtenerItemsSinStock());
							System.out.print("Los siguientes platos se encuentran agotados");// le metí muy sabroso :#
							for (Plato  g: Plato.getPlatos().keySet()) {// implementacion de la funcionalidad para cambiar la disponibilidad del plato si no hay stock
								
								g.disponibilidadPlato();
								if(g.getDisponibilidad()==false) {
									System.out.print(g);
									
							}}
							
							
							
							
							System.out.print("1. renovar inventario");
							System.out.print("2.Salir");
							Scanner inputg =new Scanner(System.in);
							int variable;
							variable= inputg.nextInt();
							if (variable==2) {
								break;
							}
							if(variable==1) {
								System.out.print("Cuantos items desea recargar");
								System.out.print("¿Cual(es) items desea recargar?");// se vienen cositas :)
								System.out.print("¿Cuanta cantidad?");
								
								Scanner inpuj3= new Scanner( System.in);
								int var0;
								var0=inpuj3.nextInt();
								List<Item> listadoItems= new ArrayList<>();
								List<Integer>ListadoNumeros= new ArrayList<>();
								
								
								
								int var;
								String var2;// revisar si va acá o dentro del bucle 
								for(int e=0;e<=var0;e++) {
								Scanner inputj= new Scanner(System.in);
								Scanner inpuj2= new Scanner(System.in);
								var=inputj.nextInt();
								var2=inpuj2.nextLine();
								
								for (Item c :Inventario.obtenerInventarios().get(opcion3).getDiccionarioItems().keySet()) {
									if (c.getNombre().equals(var2)){
										listadoItems.add(c);
										ListadoNumeros.add(var);
										
										
										
									}
									else {
										System.out.print(" No es un item válido");
									}
									}
									}
								
								for(int i: ListadoNumeros) {
									int e;
									int precioTotal;
									
									e++;
									precioTotal+=ListadoNumeros.get(e)*listadoItems.get(e).getPrecio();
									System.out.print(listadoItems.get(e).getNombre()+ "cuesta:"+ (ListadoNumeros.get(e)*listadoItems.get(e).getPrecio()));
									System.out.print("valor total ="+ precioTotal);
									
								}
								Scanner inputcomp= new Scanner(System.in);
								int num;
								num=inputcomp.nextInt(num);
								System.out.print("1.Confirmar compra");
								System.out.print("2.Salir");
								if (num==1) {
									int e;
									for( int i : ListadoNumeros) {
										System.out.print(Caja.getListadoCajas().get(opcion3).Compra(listadoItems.get(e), listadoItems.get(e).getPrecio(), i, restaurantes.get(opcion3)));
										e++;
										
										
								
									
									
									
								}
									if(num==2) {
										return ;
									}
									
								
								
								
								
							
								
								
								
								
								
							}
							
								
								
							}
								
				
							
							
							
						
							
							
							
						
						}
						
						
						
						
					}

						
						
					}
					 
					
					
				
				
				break;
			case 4:
				System.out.println("Atención al cliente\n¿Que desea realizar?");
				
				
				
				
				
				
				
				
				
				break;
				
			case 5:
				System.out.println("Reportes");
				Reportes.main(args);
				break;
			
			
			case 6:
				
           System.out.println("Reservaciones");
				
				System.out.println("1.Reservar");
				System.out.println("2.Cancelar o Modificar reservaciones ");
			
				Scanner input3=new Scanner(System.in);
				int opcion5;
				opcion5=input3.nextInt();
				switch(opcion5) {
				case 1:
					
				System.out.println("Elija la fecha de su reservación");
				System.out.println("1. 24 de Octubre, 16:00");
				System.out.println("2. 25 de Octubre, 14:00");
				System.out.println("3. 26 de Octubre, 12:00");
				System.out.println("4. 27 de Octubre, 20:00");
				
				Scanner inputc=new Scanner(System.in);
				String  Op;
				Op = inputc.nextLine();
					
				System.out.println("Elija la fecha de su reservación");
				
				
				
				case 2:
				System.out.println("1.Cancelar Reserva");
				System.out.println("2.Modificar Reserva");	
	
					

				
			case 7:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opción no válida");
				break;

				}




		}
	}
}

