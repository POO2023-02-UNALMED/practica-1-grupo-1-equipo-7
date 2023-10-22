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
					System.out.println("1.envigado");
					System.out.println("2.sandiego");	
					System.out.println("3.belen");
					System.out.print("4.la america");
					Scanner inputc= new Scanner(System.in);
					int opcion3;
					opcion3=inputc.nextInt();
					
					
					// logica para  mostrar los items eliminados y eliminarlos, en caso que no, no se elimina nada
					if (opcion3==1) {
						if (Restaurante.restaurantes.get(0).getInventario().mostrarItemsVencidos()==null) {
							System.out.print("no hay items vencidos");						}
						else {
						System.out.print(Restaurante.restaurantes.get(0).getInventario().mostrarItemsVencidos());
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
						System.out.print(Restaurante.restaurantes.get(2).getInventario().mostrarItemsVencidos());
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
				System.out.println("1. Sugerencias");
				System.out.println("2. Qujeas");
				System.out.println("3. Reseñas");
				System.out.println("4. Solicitar Devolucion");
				System.out.println("5. Salir");
				
				Scanner input4=new Scanner(System.in);
				int opcion4;
				opcion4=input4.nextInt();
				
				switch(opcion4) {
				
				case 1:
					System.out.println("Ha seleccionado la opcion 1, Sugerencias, ¿Sobre que desea realizar su sugerecia?");
					
					System.out.println("1. Sobre el menu");
					System.out.println("2. Sobre un empleado");
					System.out.println("3. Sobre una de nuestras sedes");
					System.out.println("4. Algun otro");
					System.out.println("5. Salir");
					
					String type = null;			
					
					Scanner inputs=new Scanner(System.in);
					int opcions;
					opcions=inputs.nextInt();
					
					switch(opcions) {
					
					case 1:
						type = "Menu";
						
					case 2:
						type = "Empleado";
						
					case 3:
						type = "Sede";
					
					case 4:
						type = "otro";
					
					case 5:
							break;
					
					}
					
					System.out.println("Por favor, a continuacion escriba su sugerencia");
					
					Scanner inputTextoS=new Scanner(System.in);
					String TextoS;
					TextoS=inputTextoS.next();
					
					System.out.println("Todo listo");
					
					System.out.println("1. Editar Sugerencia");
					System.out.println("2. Enviar Sugerencia");
					
					Scanner inputOEditarS=new Scanner(System.in);
					int opcionES;
					opcionES=inputOEditarS.nextInt();
					
					if (opcionES == 1) {
						
						System.out.println("Ahora puede editar su sugerencia");
						Scanner inputEditarS=new Scanner(System.in);
						String EditarS;
						EditarS=inputEditarS.next();
						
						TextoS = EditarS;
					}
					
					if (opcionES == 2) {new Sugerencia(type, TextoS);}
					
					System.out.println("Su sugerencia se ha enviado con exito");
					System.out.println("1. Salir");
					
					Scanner inputSalirS = new Scanner(System.in);
					int SalirS;
					SalirS=inputSalirS.nextInt();
					
					
					break;
				
					
					
				case 2:
					System.out.println("Ha seleccionado la opcion 2, Quejas.\nPor favor, a continuacion ingrese su nombre completo:");
					
					Scanner inputNombreQ=new Scanner(System.in);
					String NombreQ;
					NombreQ=inputNombreQ.next();
					
					System.out.println("¿Sobre que desea realizar su queja?");
					
					System.out.println("1. Sobre el menu");
					System.out.println("2. Sobre un empleado");
					System.out.println("3. Sobre una de nuestras sedes");
					System.out.println("4. Algun otro");
					System.out.println("5. Salir");
					
					
					String typeQ = null;
					String OtroQ = null;
					
					Scanner inputQ=new Scanner(System.in);
					int opcionQ;
					opcionQ=inputQ.nextInt();
					
					switch(opcionQ) {
					
					case 1:
						typeQ = "Menu";
						
						System.out.println("¿Sobre que platillo desea quejarse?");
						
						Scanner inputplatoQ=new Scanner(System.in);
						String platoQ;
						Plato platoQueja;
						platoQ=inputplatoQ.next();
						
						platoQueja = Plato.buscarPlato(platoQ);
						
						while (platoQueja == null) {
							System.out.println("Este platillo no existe. Por favor ingrese un platillo que se encuentre en el menu");
							
							System.out.println("1. Ingresar un platillo diferente");
							System.out.println("2. Salir");
							
							Scanner inputPQ = new Scanner(System.in);
							int opcionPQ;
							opcionPQ = inputPQ.nextInt();
							
							if (opcionPQ == 1) {
								Scanner inputplatoEQ=new Scanner(System.in);
								String platoEQ;
								platoEQ=inputplatoEQ.next();
								
								platoEQ = platoQ;
								
							}
							
							if(opcionPQ == 2) {
								break;
							}
						OtroQ = platoQ;
							
						}
						
					case 2:
						typeQ = "Empleado";
						
						System.out.println("Por favor, para continuar ingrese el nombre del empleado");
						
						Scanner inputempleadoQ=new Scanner(System.in);
						String empleadoQ;
						Empleado empleadoQueja;
						empleadoQ=inputempleadoQ.next();
						
						empleadoQueja = Empleado.buscarEmpleadoXNombre(empleadoQ);
						
						while (empleadoQueja == null) {
							System.out.println("Esta persona no hace parte de nuestro equipo de trabjo. Por favor ingrese otro nombre");
							
							System.out.println("1. Ingresar un nombre diferente");
							System.out.println("2. Salir");
							
							Scanner inputEQ = new Scanner(System.in);
							int opcionEQ;
							opcionEQ = inputEQ.nextInt();
							
							if (opcionEQ == 1) {
								Scanner inputempleadoEQ=new Scanner(System.in);
								String empleadoEQ;
								empleadoEQ=inputempleadoEQ.next();
								
								empleadoEQ = empleadoQ;
								
							}
							
							if(opcionEQ == 2) {
								break;
							}
						OtroQ = empleadoQ;
							
						}
						
					case 3:
						typeQ = "Sede";
						
						System.out.println("Por favor, para continuar indique la sede de la cual quiere hacer su queja");

						Scanner inputsedeQ=new Scanner(System.in);
						String sedeQ;
						Restaurante sedeQueja;
						sedeQ=inputsedeQ.next();
						
						sedeQueja = Restaurante.buscarSedeXUbicacion(sedeQ);
						
						while (sedeQueja == null) {
							System.out.println("Esta Sede no existe. Por favor ingrese una sede valida");
							
							System.out.println("1. Ingresar una sede diferente");
							System.out.println("2. Salir");
							
							Scanner inputSQ = new Scanner(System.in);
							int opcionSQ;
							opcionSQ = inputSQ.nextInt();
							
							if (opcionSQ == 1) {
								Scanner inputsedeEQ=new Scanner(System.in);
								String sedeEQ;
								sedeEQ=inputsedeEQ.next();
								
								sedeEQ = sedeQ;
							}
							
							if(opcionSQ == 2) {
								break;
							}
							
						OtroQ = sedeQ;
						}
					
					case 4:
						typeQ = "Algun otro";
						
						
						OtroQ = null;
					
					case 5:
							break;
					}
				
				
					System.out.println("Por favor, a continuacion escriba su queja");
					
					Scanner inputTextoQ=new Scanner(System.in);
					String TextoQ;
					TextoQ=inputTextoQ.next();
					
					System.out.println("Todo listo");
					
					System.out.println("1. Editar Queja");
					System.out.println("2. Enviar Queja");
					
					Scanner inputOEditarQ=new Scanner(System.in);
					int opcionEQ;
					opcionEQ=inputOEditarQ.nextInt();
					
					if (opcionEQ == 1) {
						
						System.out.println("Ahora puede editar su sugerencia");
						Scanner inputEditarQ=new Scanner(System.in);
						String EditarQ;
						EditarQ=inputEditarQ.next();
						
						TextoQ = EditarQ;
					}
					
					if (opcionEQ == 2) {new Queja(NombreQ, typeQ, OtroQ, TextoQ);}
					
					System.out.println("Su sugerencia se ha enviado con exito");
					System.out.println("1. Salir");
					
					Scanner inputSalirQ = new Scanner(System.in);
					int SalirQ;
					SalirQ=inputSalirQ.nextInt();
					
					break;
					
					
				
				case 3:
					System.out.println("Ha seleccionado la opcion 3, Reseña.\n¿Que desea realizar?");
					
					System.out.println("1. Ver repositorio de reseñas");
					System.out.println("2. Realizar una nueva reseña");
					System.out.println("3. Salir");
					
					Scanner inputR=new Scanner(System.in);
					int opcionR;
					opcionR=inputR.nextInt();
					break;
					
					
				
				case 4:
					break;
					
					
				case 5:
					break;
				}
				
				
				
				
				
				
				
				
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

