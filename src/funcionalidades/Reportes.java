package funcionalidades;
import clases.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
import java.text.ParseException;

	public class Reportes {
	    public static void main(String[] args) {

	        System.out.println("¿Qué tipo de reporte desea generar?");
	        System.out.println("1. Reporte de Comisiones");
	        System.out.println("2. Reporte de Clientes");
	        System.out.println("3. Reporte de Productos");
	        
	        Scanner input1 = new Scanner(System.in);
	        int opcion;
	        opcion = input1.nextInt();

	switch(opcion){
	
	        case 1:
	        	
	            System.out.println("Reporte de Comisiones");
		        System.out.println("1.Comisiones por mesero");
		        System.out.println("2.Comisiones por sede");
				System.out.println("3.Comisiones totales");
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
							fecha = input1.next();
							LocalDate fechaFin = LocalDate.parse(fecha);

							ArrayList<Factura> facturas = Factura.buscarFacturasPorFecha(fechaInicio, fechaFin);
							if(facturas.size() == 0){
								System.out.println("No hay facturas en ese rango de fechas");
							}
							else{
								int totalComisiones = 0;
								for(Factura factura : facturas){
									if(factura.getCodigoEmpleado() == empleado.getCodigo()){
										totalComisiones += factura.getTotal() * Empleado.getPorcentajePropinas();
									}
								}
								System.out.println("El total de comisiones es: " + totalComisiones);
							}
							


						}
	            	break;

	            		
	            	case 2:
	            		System.out.println("Reporte de ventas total");
	            		
	            		
	            }
	            break;
	            //Aqui se puede detallar las ventas por sede, por ejemplo, ventas por dia, ventas por mes, ventas por año, etc.
	        case 2:
	        	
	        	System.out.println("Reporte de Clientes");
		        System.out.println("1. Frecuentes");
		        System.out.println("2. Por fidelizar");
	        	opcion = input1.nextInt();
	            
	        	switch(opcion){
	            
	        		case 1:
	        			System.out.println("Clientes Frecuentes");
	        			break;
	        		case 2:
	        			System.out.println("Clientes por fidelizar");
	        			break;
	        	}
	        	break;
	        case 3:
	        	
	        	System.out.println("Reporte de Proovedores");
		        System.out.println("1. Facturas");
		        System.out.println("2. Productos");
	        	opcion = input1.nextInt();
	            
	        	switch(opcion){
	            
	        		case 1:
	        			System.out.println("Facturas");
	        			break;
	        		case 2:
	        			System.out.println("Productos");
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
