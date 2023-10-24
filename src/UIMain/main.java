package UIMain;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import funcionalidades.*;
import gestorAplicación.*;

public class main {

	static ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

	static {// las sedes que tenemos si algo sugerencias o las cambias, no problema :)

		Inventario inventario1 = new Inventario();
		Inventario inventario2 = new Inventario();
		Inventario inventario3 = new Inventario();
		Inventario inventario4 = new Inventario();

		restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Envigado", "Calle 1", inventario1,
				new Caja(1000000, 1234), 1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));
		restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Sandiego", "Calle 2", inventario2,
				new Caja(10000000, 1235), 1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));
		restaurantes.add(new Restaurante("La Casa de Toño", "Sede: Belen", "Calle 3", inventario3,
				new Caja(10000000, 1236), 1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));
		restaurantes.add(new Restaurante("La Casa de Toño", "Sede: La America", "Calle 4", inventario4, new Caja(),
				1234567, new Date(), Plato.getListadoplatos(), new ArrayList<Mesa>()));

		new Mesa("Mesa uno", "Dos personas", "Sede: Las Americas");
		new Mesa("Mesa dos", "Tres personas", "Sede: Envigado");
		new Mesa("Mesa tres", "Cuatro o más personas", "Sede: Belen");
		new Mesa("Mesa cinco", "Dos personas", "Sede: Belen");
		new Mesa("Mesa siete", "Tres personas", "Sede: Las Americas");
		new Mesa("Mesa siete", "Cuatro o más personas", "Sede: Sandiego");
		new Mesa("Mesa tres", "Dos personas", "Sede: Envigado");

		// por ahora lo trabajaré así, es posible que use un enumerado, si tienen alguna
		// recomendación lo agradecería :)
		new Item("Tortilla", 0, 0.50, "01/01/2024", Inventario.obtenerInventarios().get(0));
		new Item("Tostadas", 0, 0.50, "01/01/2024", Inventario.obtenerInventarios().get(0));
		new Item("Maiz", 0, 0.50, "01/01/2024", Inventario.obtenerInventarios().get(0));
		new Item("Carne", 0, 1.00, "01/01/2024", Inventario.obtenerInventarios().get(0));
		new Item("Cebolla", 100, 0.25, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("Cilantro", 100, 0.25, "01/01/2024", Inventario.obtenerInventarios().get(0));
		new Item("Tostada", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(3));
		new Item("Queso", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("Frijoles", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("Masa de Pizza", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("Salsa de Tomate", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(1));
		new Item(" Champiñones verdes", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("Maíz en Lata", 100, 0.50, "01/01/2020", Inventario.obtenerInventarios().get(2));
		new Item(" Champiñones", 100, 0.80, "01/01/2020", Inventario.obtenerInventarios().get(3));
		new Item("Pollo", 100, 1.50, "01/01/2020", Inventario.obtenerInventarios().get(1));
		new Item("Brócoli", 100, 1.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
		new Item("pan", 100, 1.20, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("carne desmechada Pollo", 100, 1.50, "01/01/2020", Inventario.obtenerInventarios().get(3));
		new Item(" Pepperoni", 100, 1.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
		new Item("Pasta ", 100, 1.20, "01/01/2020", Inventario.obtenerInventarios().get(1));
		new Item("Sashimi de Salmón", 100, 2.50, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("Salsa roja", 100, 1.25, "01/01/2020", Inventario.obtenerInventarios().get(3));
		new Item("Agua Mineral", 100, 2.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
		new Item("Vino Blanco", 100, 3.00, "01/01/2020", Inventario.obtenerInventarios().get(1));
		new Item("Café ", 100, 0.90, "01/01/2020", Inventario.obtenerInventarios().get(0));
		new Item("Té de Manzanilla", 100, 0.80, "01/01/2020", Inventario.obtenerInventarios().get(3));
		new Item("Refresco de Naranja", 100, 1.00, "01/01/2020", Inventario.obtenerInventarios().get(2));
		new Item("Helado de Fresa", 100, 1.20, "01/01/2020", Inventario.obtenerInventarios().get(1));
		new Item("aqrequipe", 100, 1.50, "01/01/2020", Inventario.obtenerInventarios().get(0));

		/*
		 * new Item("Masa", 100, 0.50,"01/01/2020");// los relleno ahora sino que voy a
		 * probar el probar el programa new Item("Salsa", 100, 0.50,"01/01/2020"); new
		 * Item("Crema", 100, 0.50,"01/01/2020"); new Item("Maiz", 100,
		 * 0.50,"01/01/2020"); new Item("Sopa de Tomate", 100, 0.80, "01/01/2020"); new
		 * Item("Lasagna", 100, 1.50, "01/01/2020"); new Item("Espárragos", 100, 1.00,
		 * "01/01/2020"); new Item("Sándwich de Pavo", 100, 1.20, "01/01/2020"); new
		 * Item("Hamburguesa", 100, 1.50, "01/01/2020"); new Item("Pizza Margarita",
		 * 100, 1.00, "01/01/2020"); new Item("Pasta Alfredo", 100, 1.20, "01/01/2020");
		 * new Item("Sushi", 100, 2.50, "01/01/2020"); new Item("Tacos de Pescado", 100,
		 * 1.25, "01/01/2020"); new Item("Cerveza", 100, 2.00, "01/01/2020"); new
		 * Item("Vino Tinto", 100, 3.00, "01/01/2020"); new Item("Café", 100, 0.90,
		 * "01/01/2020"); new Item("Té Verde", 100, 0.80, "01/01/2020"); new
		 * Item("Refresco de Cola", 100, 1.00, "01/01/2020"); new
		 * Item("Helado de Vainilla", 100, 1.20, "01/01/2020"); new
		 * Item("Pastel de Chocolate", 100, 1.50, "01/01/2020");
		 */

		ArrayList<Item> ingredientesTacos = new ArrayList<>();
		ingredientesTacos.add(Item.buscarItem("Tortilla"));
		ingredientesTacos.add(Item.buscarItem("Carne"));
		ingredientesTacos.add(Item.buscarItem("Cebolla"));
		ingredientesTacos.add(Item.buscarItem("Cilantro"));

		ArrayList<Item> ingredientesTostadas = new ArrayList<>();
		ingredientesTostadas.add(Item.buscarItem("Tostada"));
		ingredientesTostadas.add(Item.buscarItem("Carne"));
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
		// le agregué los precios a cada plato, se puede cambiar esto:)
		Plato tacos = new Plato("Tacos", ingredientesTacos, 2000);
		

		Plato tostadas = new Plato("Tostadas", ingredientesTostadas, 2000);
		
		Plato quesadilla = new Plato("Quesadillas", ingredientesQuesadillas, 5000);
		Plato sopes = new Plato("Sopes", ingredientesSopes, 6000);
		Plato tamales = new Plato("Tamales", ingredientesTamales, 7000);
		Plato enchilada = new Plato("Enchiladas", ingredientesEnchiladas, 8000);
		Plato pozol = new Plato("Pozol", ingredientesPozol, 9000);
		

	}

	// esto se puede cambiar y meter a una lista en sedes, e iterar y si la opcion
	// elegida es igual elegirlo:)

	public static void main(String[] args) throws FileNotFoundException , IOException, ClassNotFoundException{
		System.out.println(
				"1. Ver menú\n2. Registro del restaurante\n3. Inventario\n4. Atención al cliente\n5. Reportes\n6. Reservaciones\n7. Salir");
		Cliente nuevoCliente = new Cliente(null, 0);
		Scanner input1 = new Scanner(System.in);
		int opcion;
		opcion = input1.nextInt();

		switch (opcion) {
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
			Scanner inputb = new Scanner(System.in);
			int opcion2;
			opcion2 = inputb.nextInt();
			switch (opcion2) {
			case 1:
				break;
			case 2:
				System.out.println("1. Envigado");
				System.out.println("2. Sandiego");
				System.out.println("3. Belen");
				System.out.print("4. La America");
				Scanner inputc = new Scanner(System.in);
				int opcion3;
				opcion3 = inputc.nextInt();

				// logica para mostrar los items eliminados y eliminarlos, en caso que no, no se
				// elimina nada
				if (opcion3 == 1) {
					if (Restaurante.getSedes().get(0).getInventario().mostrarItemsVencidos().size() == 0) {
						System.out.println("no hay items vencidos");
					} else {
						System.out.println(Restaurante.getSedes().get(0).getInventario().mostrarItemsVencidos());

						Restaurante.getSedes().get(0).getInventario().eliminarVencidos();

						System.out.println("Inventario vencido, eliminado");
					}

				}
				if (opcion3 == 2) {
					if (Restaurante.getSedes().get(1).getInventario().mostrarItemsVencidos().size() == 0) {
						System.out.println("no hay items vencidos");
					} else {
						System.out.print(Restaurante.getSedes().get(1).getInventario().mostrarItemsVencidos());
						Restaurante.getSedes().get(1).getInventario().eliminarVencidos();

						System.out.println("Inventario vencido eliminado");
					}
				}
				if (opcion3 == 3) {
					if (Restaurante.getSedes().get(2).getInventario().mostrarItemsVencidos().size() == 0) {
						System.out.println("no hay items vencidos");
					} else {
						System.out.print(Restaurante.getSedes().get(2).getInventario().mostrarItemsVencidos());
						Restaurante.getSedes().get(2).getInventario().eliminarVencidos();

						System.out.println("Inventario vencido eliminado");
					}
				}
				if (opcion3 == 4) {

					if (Restaurante.getSedes().get(3).getInventario().mostrarItemsVencidos().size() == 0) {
						System.out.println("no hay items vencidos");
					} else {
						System.out.print(Restaurante.getSedes().get(3).getInventario().mostrarItemsVencidos());
						Restaurante.getSedes().get(3).getInventario().eliminarVencidos();

						System.out.println("Inventario vencido eliminado");
					}

				}

				System.out.println(" Salir");

				System.out.println("continuar");
				Scanner inputd = new Scanner(System.in);
				String esc;
				esc = inputd.nextLine();
				if (esc.equals("salir")) {
					break;

				}
				if (esc.equals("continuar")) {
					System.out.println("1. Mostrar inventario");
					System.out.println("2. Precio articulo inventario");
					System.out.println("3. Revisar niveles de Stock");
					System.out.println("4. Registrar artículo en inventario");
					System.out.println("5. Renovar inventario");
					System.out.println("6. Valor del inventario total");
					System.out.println("7. Cambiar de sede");
					Scanner inputf = new Scanner(System.in);
					int opcionf;
					opcionf = inputf.nextInt();

					switch (opcionf) {
					case 1:
						Inventario.obtenerInventarios().get(opcion3 - 1)
								.mostrarInventario(Restaurante.getSedes().get(opcion3 - 1));
						break;
					case 2:
						
						System.out.print("¿Cual articulo desea mirar?");
						Scanner inputlk= new Scanner(System.in);
						String art;
						art= inputlk.nextLine();
						List <String >listt= Arrays.asList(art.split(" "));
						for (String i : listt) {
						if (Item.buscarItem(i)!=null) {
							System.out.println(  "El precio de "+Item.buscarItem(i).getNombre()+" "+Item.buscarItem(i).getPrecio());
						}
						if (Item.buscarItem(i)==null) {
							System.out.println("El nombre de "+i +" no ha sido encontrado");
							
						}
						
						}
						break;
							
						
					case 3:
						System.out.println("Los articulos sin stock son:");
						System.out.println(Inventario.obtenerInventarios().get(opcion3 - 1).obtenerItemsSinStock());
						System.out.println("Los siguientes platos se encuentran agotados: ");// le metí muy sabroso :#

						
						for (Plato g : Restaurante.getSedes().get(opcion3 - 1).getMenu()) {// implementacion de la
																							// funcionalidad para
																							// cambiar la disponibilidad
																							// del plato si no hay stock

							g.disponibilidadPlato();
							if (g.getDisponibilidad() == false) {

								System.out.println("Para los " + g.getNombre() + " ,los ingredintes que faltan son: "+ g.IngredientesFaltantes());

							}
						}

						boolean Comparador = true;

						while (Comparador) {
							System.out.println("1. renovar inventario");
							System.out.println("2.Salir");
							Scanner inputg = new Scanner(System.in);
							int variable;
							variable = inputg.nextInt();
							if (variable == 2) {
								break;
							}

							if (variable == 1) {
								System.out.println("Cuantos items desea recargar");
								System.out.println("¿Cual(es) items desea recargar?");// se vienen cositas :)
								System.out.println("¿Cuanta cantidad?");

								Scanner inpuj3 = new Scanner(System.in);
								int var0;
								var0 = inpuj3.nextInt();
								List<Item> listadoItems = new ArrayList<>();
								List<Integer> ListadoNumeros = new ArrayList<>();

								int var;
								String var2;// revisar si va acá o dentro del bucle
								for (int e = 0; e < var0; e++) {
									Scanner inputj = new Scanner(System.in);
									Scanner inpuj2 = new Scanner(System.in);
									var2 = inputj.nextLine();
									var = inputj.nextInt();

									if (Item.buscarItem(var2) != null) {
										listadoItems.add(Item.buscarItem(var2));
										ListadoNumeros.add(var);
									} else {
										System.out.println("Nombre no valido");

									}

								}
								int e = 0;
								float precioTotal = 0;
								for (int i : ListadoNumeros) {

									precioTotal += i * listadoItems.get(e).getPrecio();
									System.out.println(listadoItems.get(e).getNombre() + " cuesta: "
											+ listadoItems.get(e).getPrecio() + " x  " + i + " = "
											+ (i * listadoItems.get(e).getPrecio()));

									e++;

								}

								System.out.println("valor total = " + precioTotal);
								System.out.println("1.Confirmar compra");
								System.out.println("2.Salir");
								Scanner inputcomp = new Scanner(System.in);
								int num23;
								num23 = inputcomp.nextInt();

								if (num23 == 1) {
									int p = 0;
									ArrayList<String> guardaResultado = new ArrayList<>();
									for (int i : ListadoNumeros) {
										guardaResultado.add(Caja.getListadoCajas().get(opcion3 - 1).Compra(
												listadoItems.get(p), listadoItems.get(p).getPrecio(), i,
												restaurantes.get(opcion3 - 1)));
										p++;

									}

									boolean todosCumplen = guardaResultado.contains(
											"No hay suficiente dinero en la caja para realizar la compra. Debe ingresar dinero en caja  para hacer posible la compra");
									if (todosCumplen) {
										System.out.println(
												"No hay suficiente dinero en la caja para realizar la compra. Debe ingresar dinero en caja  para hacer posible la compra");
									} else {
										System.out.println("El stock ha sido  actualizado:");
										Inventario.obtenerInventarios().get(opcion3 - 1)
												.mostrarInventario(Restaurante.getSedes().get(opcion3 - 1));
										System.out.println("1.Volver");
										System.out.println("2.Salir ");
										Scanner inpuj8 = new Scanner(System.in);
										int num231;
										num231 = inpuj8.nextInt();
										if (num231 == 2) {
											Comparador = false;
										}
										if (num231 == 1) {

										}

									}
								}

								if (num23 == 2) {
									Comparador = false;
								}

							}

						}
						
						
						
					case 4 : 
						System.out.println("--------¿Desea registrar el articulo?---------");
						System.out.println(" Si/No");
						Scanner inputñ= new Scanner( System.in);
						String YesorNot;
						YesorNot=inputñ.nextLine();
						if (YesorNot.equals("Si") || YesorNot.equals("si")) {
							System.out.println("Nombre:");
							System.out.println("Cantidad:");
							System.out.println("Precio:");
							System.out.println("Fecha de vencimiento:");
							
							
							// Nombre 
							Scanner input4= new Scanner(System.in);
							String var4 = input4.nextLine();
							// Cantidad 
							Scanner input41= new Scanner(System.in);
							int var41 = input41.nextInt();
							
							// Precio
							Scanner input42= new Scanner(System.in);
							int var42 = input42.nextInt();
							
							//Fecha de vencimiento
							Scanner input43= new Scanner(System.in);
							String var43 = input43.nextLine();
							
							
							
							if (Item.buscarItem(var4)!=null) {
								Inventario.obtenerInventarios().get(opcion3-1).añadirItems(var4,var41 );
								System.out.println("**Se ha añdido el item con exito**");
								
								
								
									
								
							}
							else {
								new Item(var4, var41, var42, var43, Inventario.obtenerInventarios().get(opcion3-1));// Aca estoy ************************************
							}
							break;
							
						}
					case 5:
						System.out.print("------¿Desea renovar inventario?------");
						System.out.print("S/N");
						Scanner inputk40=new Scanner(System.in);
						String vark40;
						vark40=inputk40.nextLine();
						if (vark40=="S") {
							Inventario.obtenerInventarios().get(opcion3-1).resetearInventario();
							Inventario.mostrarInventario(Restaurante.getSedes().get(opcion3-1));
						}
						else {}
						break;
						
						
						
						
						
						
						
							
					case 6 :
						System.out.print("----¿Desea ver el valor de los articulos?----");
						System.out.print("S/N");
						Scanner inpujtñ45 = new Scanner (System.in);
						String var450k= inpujtñ45.nextLine();
						if (var450k.equals("S")) {
							float precioTotal=0;
							for (String  k: Restaurante.getSedes().get(opcion3-1).getInventario().getDiccionarioItems().keySet() ) {
								if ( Item.buscarItem(k)!=null) {
									precioTotal+=Item.buscarItem(k).getPrecio();
									System.out.println(k+" tiene un precio de "+Item.buscarItem(k).getPrecio());
									
								}
									
								
							}
							System.out.println("Precio total = "+ precioTotal);
						}
						else {
							
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
			
			Reservaciones.reservaciones(nuevoCliente);
			Cliente micliente = new Cliente("Null", 0);
			Reservaciones.reservaciones(micliente);

		case 7:

			System.out.println("Salir");
			System.exit(0);
			default:
				System.out.println("Opción no válida");
				break;

			}

		}
	}

