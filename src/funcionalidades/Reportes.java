package funcionalidades;
import clases.*;
import java.util.Scanner;

	public class Reportes {
	    public static void main(String[] args) {

	        System.out.println("¿Qué tipo de reporte desea generar?");
	        System.out.println("1. Reporte de ventas");
	        System.out.println("2. Reporte de Clientes");
	        System.out.println("3. Reporte de Productos");
	        
	        Scanner input1 = new Scanner(System.in);
	        int opcion;
	        opcion = input1.nextInt();

	switch(opcion){
	
	        case 1:
	        	
	            System.out.println("Reporte de ventas");
		        System.out.println("1.Ventas por sede");
		        System.out.println("2. Ventas totales");
	            opcion = input1.nextInt();
	            
	            switch(opcion){
	            
	            	case 1:
	            		System.out.println("Reporte de ventas por sede");
	            		
	            		
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
