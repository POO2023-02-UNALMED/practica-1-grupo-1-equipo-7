package funcionalidades;
import clases.*;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

	public class Reportes {
	    public static void main(String[] args) {

	        System.out.println("¿Qué tipo de reporte desea generar?");
	        System.out.println("1. Reporte de Comisiones");
	        System.out.println("2.Recomendaciones");
	        
	        Scanner input1 = new Scanner(System.in);
	        int opcion;
	        opcion = input1.nextInt();

	switch(opcion){
	
	        case 1:
	        	
	            System.out.println("Reporte de Comisiones");
		        System.out.println("1.Comisiones por mesero");
		        System.out.println("2.Comisiones por sede");
	            opcion = input1.nextInt();
	            
	            switch(opcion){
	            
	            	case 1:
	            		System.out.println("Comisiones por mesero");
						System.out.println("Ingrese el codigo del mesero:");
						opcion = input1.nextInt();
	        
						if (Empleado.buscarEmpleado(opcion) == null){
							System.out.println("No existe ese codigo de empleado");
						}

						else{
							Empleado empleado = Empleado.buscarEmpleado(opcion);

							System.out.println("Reporte de Comisiones para el mesero: " + empleado.getNombre());
							System.out.println("Rango de fechas para el calculo de comisiones");
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
	            	break;

					case 2:
	            		System.out.println("Comisiones por sede");
						System.out.println("Ingrese el codigo de la sede:");
						opcion = input1.nextInt();

							        
						if (Restaurante.buscarSede(opcion) == null){
							System.out.println("No existe ese codigo de Sede");
						}
						else{
							Restaurante sede = Restaurante.buscarSede(opcion);
							System.out.println("Reporte de Comisiones para la sede: " + sede.getNombre());

							ArrayList<Factura> facturas = Factura.buscarFacturasPorSede(opcion);
							if(facturas.size() == 0){
								System.out.println("No hay facturas en ese rango de fechas");
							}
							else{
								System.out.println("El total de comisiones : " + sede.calcularPropinasPorSede(opcion));
							}
						}
					}
					break;
	
	            //Aqui se puede detallar las ventas por sede, por ejemplo, ventas por dia, ventas por mes, ventas por año, etc.
	        case 2:
	        	
	        	System.out.println("Recomendaciones");
		        System.out.println("1. Calcular plato preferido por cliente");
		        System.out.println("2. Platos recomendados");
	        	opcion = input1.nextInt();
	            
	        	switch(opcion){
	            
	        		case 1:
	        			System.out.println("Platos preferidos por cliente");
						System.out.println("Ingrese el codigo del cliente:");
						opcion = input1.nextInt();
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

	        			break;
	        		case 2:
	        			System.out.println("Platos recomendados");
						System.out.println("Ingrese el codigo del cliente:");
						opcion = input1.nextInt();
						ArrayList<Plato> recomendados = Cliente.buscarPlatoRecomendado(opcion);
						if(recomendados == null){
							System.out.println("No hay plato recomendado para ese cliente");
						}
						else{
							System.out.println("El plato recomendado para el cliente es: ");
							for(Plato plato : recomendados){
								System.out.println(plato.getNombre());
							}
						}
	        			break;
	        	}
	        	break;
	            		
	        default:
	            System.out.println("Opcion no valida");
	            break;

		}
	input1.close();
	}
}
