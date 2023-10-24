package funcionalidades;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

import UIMain.main;
import gestorAplicación.*;

	public class Reportes {
	    public static void main(String[] args) {
			

	        System.out.println("------------¿Qué tipo de reporte desea generar?------------");
	        System.out.println("1.Reporte de Comisiones");
	        System.out.println("2.Recomendaciones");
	        
	        Scanner input1 = new Scanner(System.in);
	        int opcion;
	        opcion = input1.nextInt();

	switch(opcion){
	
	        case 1:
	        	
	            System.out.println("------------Reporte de Comisiones------------");
		        System.out.println("1.Comisiones por mesero");
		        System.out.println("2.Comisiones por sede");
	            opcion = input1.nextInt();
	            
	            switch(opcion){
	            
	            	case 1:
	            		System.out.println("------------Comisiones por mesero------------");
						System.out.println("Ingrese el codigo del mesero:");
						opcion = input1.nextInt();
	        
						if (Empleado.buscarEmpleado(opcion) == null){
							System.out.println("No existe ese codigo de empleado");
						}

						else{
							Empleado empleado = Empleado.buscarEmpleado(opcion);

							System.out.println("Reporte de Comisiones para el mesero: " + empleado.getNombre());
							System.out.println("------------Rango de fechas para el calculo de comisiones------------");
							System.out.println("Ingrese la fecha de inicio");
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

							ArrayList<Factura> facturas = Factura.buscarFacturasPorFecha(fechaInicio.plusDays(-1), fechaFin.plusDays(1));
							if(facturas.size() == 0){
								System.out.println("No hay facturas en ese rango de fechas");
							}

							else{
								System.out.println("El total de comisiones : " + empleado.calcularPropinas(opcion, fechaInicio, fechaFin));
							}
						}
						System.out.println("-----------------------------------");
	            	main.main(args);

					case 2:
	            		System.out.println("Comisiones por sede");
						System.out.println("Ingrese el codigo de la sede:");
						opcion = input1.nextInt();

							        
						if (Restaurante.buscarSede(opcion) == null){
							System.out.println("No existe ese codigo de Sede");
						}
						else{
							Restaurante sede = Restaurante.buscarSede(opcion);
							System.out.println("Reporte para la " + sede.getUbicacion());
							System.out.println("Reporte de Comisiones para el restaurante: " + sede.getNombre());

							ArrayList<Factura> facturas = Factura.buscarFacturasPorSede(opcion);
							if(facturas.size() == 0){
								System.out.println("No hay facturas en esta sede");
							}
							else{
								System.out.println("El total de comisiones : " + sede.calcularPropinasPorSede(opcion));
							}
						}
					}
					System.out.println("-----------------------------------");
					main.main(args);
	
	            
	        case 2:
	        	
	        	System.out.println("------------Recomendaciones------------");
		        System.out.println("1. Calcular plato preferido por cliente");
		        System.out.println("2. Platos recomendados");
	        	opcion = input1.nextInt();
	            
	        	switch(opcion){
	            
	        		case 1:
	        			System.out.println("------------Platos preferidos por cliente------------");
						System.out.println("Ingrese el codigo del cliente:");
						opcion = input1.nextInt();
						if (Cliente.buscarCliente(opcion) == null){
							System.out.println("No existe ese codigo de cliente");
						}
						else{
							Cliente cliente = Cliente.buscarCliente(opcion);
							System.out.println("El nombre del cliente es: " + cliente.getNombre());
						}
						ArrayList<Plato> preferido = Cliente.buscarPlatoPreferido(opcion);
						if(preferido == null){
							System.out.println("No hay plato preferido para ese cliente");
						}
						else{
							System.out.println("El plato preferido para el cliente es: ");
							for(Plato plato : preferido){
								System.out.println(plato.getNombre());
							}
						}
						System.out.println("-----------------------------------");
	        			main.main(args);
	        		case 2:
	        			System.out.println("------------Platos recomendados------------");
						System.out.println("Ingrese el codigo del cliente:");
						opcion = input1.nextInt();
						if (Cliente.buscarCliente(opcion) == null){
							System.out.println("No existe ese codigo de cliente");
						}
						else{
							Cliente cliente = Cliente.buscarCliente(opcion);
							System.out.println("El nombre del cliente es: " + cliente.getNombre());
						}
						Object[] recomendados = Cliente.buscarPlatoRecomendado(opcion);
						if(recomendados == null){
							System.out.println("No hay plato recomendado para ese cliente");
						}
						else{
							System.out.println("El plato recomendado para el cliente es: ");
							for(Plato plato : (ArrayList<Plato>)recomendados[0]){
								System.out.println(plato.getNombre());
							}
						}
					
						System.out.print("Estos platos se recomiendan en base a sus platos preferidos: " );
						for(Plato plato : Cliente.buscarPlatoPreferido(opcion)){
							System.out.print(plato.getNombre() + " ");
						}
						System.out.println();
						System.out.println("Los cuales tienen estos ingredientes: ");
						int i = 0;
						ArrayList<String> ingredientes = new ArrayList<>();
						ingredientes.addAll((ArrayList<String>)recomendados[1]);
						for(String ingrediente : ingredientes){
							i++;
							System.out.println(i + "." + ingrediente + " ");
						}
						System.out.println("Desea eliminar algun ingrediente, para recomendar los platos? (S/N)");
						String respuesta = input1.next();
						if(respuesta.equals("S")){
							System.out.println("Ingrese el numero del ingrediente que desea eliminar");
							int ingrediente = input1.nextInt();
							String eliminar = ingredientes.get(ingrediente - 1);
							String agregar;
							ingredientes.remove(ingrediente - 1);
							System.out.println("Desea agregar algun ingrediente, para recomendar los platos? (S/N)");
							respuesta = input1.next();
							i = 0;
							ArrayList<String> addingrediente = new ArrayList<>();
							if(respuesta.equals("S")){
								for(Item item : Item.getListadoItems()){
									String ingrediente1 = item.getNombre();
									if(!ingredientes.contains(ingrediente1)){
										i++;
										System.out.println(i + "." + ingrediente1 + " ");
										addingrediente.add(ingrediente1);
									}
								}
								System.out.println("Ingrese el ingrediente que desea agregar");
								ingrediente = input1.nextInt();
								agregar = addingrediente.get(ingrediente - 1);
								ingredientes.add(agregar);

							if(Cliente.buscarPlatoRecomendado(ingredientes , eliminar, addingrediente.get(ingrediente - 1)).size() == 0){
									System.out.println("Disculpa, actualmente no hay platos recomendados que contenga " + agregar + " y no contenga " + eliminar + " y que tenga los ingredientes de tus platos preferidos");
								}
								else{
									System.out.println("Los platos recomendados son: ");
									for(Plato plato : Cliente.buscarPlatoRecomendado(ingredientes , eliminar, addingrediente.get(ingrediente - 1))){
										System.out.println(plato.getNombre());
									}
								}
							}
							else{
								if(Cliente.buscarPlatoRecomendado(ingredientes , eliminar).size() == 0){
									System.out.println("Disculpa, actualmente no hay platos recomendados que no contenga " + eliminar + " y que tenga los ingredientes de tus platos preferidos");
								}
								else{
									System.out.println("Los platos recomendados son: ");
									for(Plato plato : Cliente.buscarPlatoRecomendado(ingredientes , eliminar)){
										System.out.println(plato.getNombre());
									}
								}
							}

							

						}
						

								
	        			
	        	}
				System.out.println("-----------------------------------");
	        	main.main(args);
	            		
	        default:
	            System.out.println("Opcion no valida");
				System.out.println("-----------------------------------");
	            main.main(args);

		}
	input1.close();
	}
}
