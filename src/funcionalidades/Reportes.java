package funcionalidades;
import clases.*;
import java.util.Scanner;

public class Reportes {
	public class Reporte{
		Scanner input1 = new Scanner(System.in);
		system.out.println("¿Que tipo de reporte desea generar?");
	    system.out.println("1. Reporte de ventas por sede");
	    system.out.println("2. Reporte de productos mas vendidos");
	    system.out.println("3. Reporte de clientes mas frecuentes");
	    system.out.println("4. Reporte de empleados por sede");
	    system.out.println("5. Reporte de Utilidades");

	    opcion = input1.nextInt();
	    switch(opcion){
	        case 1:
	            System.out.println("Reporte de ventas por sede: A continuacion se mostraran las ventas por sede");
	            //Aqui se puede detallar las ventas por sede, por ejemplo, ventas por dia, ventas por mes, ventas por año, etc.
	            //Se puede hacer un submenu para que el usuario elija que tipo de reporte desea ver
	            //Agregarle los costos de los productos para que se muestre la utilidad y compararla con reportes anteriores
	            break;
	        case 2:
	            System.out.println("Reporte de productos mas vendidos: A continuacion se mostraran los productos mas vendidos");
	            // Esta funcion se puede hacer con un contador, que cuente cuantas veces se ha vendido un producto y mostrarlo en orden de mayor a menor
	            // Al mismo tiempo reportar como esta cada sede de ingredientes de este producto para tomar desiciones
	            break;
	        case 3:
	            System.out.println("Reporte de clientes mas frecuentes: A continuacion se mostraran los clientes mas frecuentes");
	            // Esta funcion se puede hacer con un contador, que cuente cuantas veces un cliente ha comprado y mostrarlo en orden de mayor a menor
	            // para cada sede, de esta forma ofrecerles descuentos o promociones, y agregar que dia de la semana es el que mas compra
	            break;
	        case 4:
	            System.out.println("Reporte de empleados por sede: A continuacion se mostraran los empleados por sede");
	            // Esta funcion se puede hacer con un contador, que cuente cuantas veces un empleado ha vendido y mostrarlo en orden de mayor a menor
	            // ademas generar las propinas que se le deben dar a cada empleado
	            break;
	        case 5:
	            System.out.println("Reporte de Utilidades: A continuacion se mostraran las utilidades");
	            // Presentar las utilidades de cada sede, y compararlas con reportes anteriores
	            // mostrando las variaciones
	            //Mostar maximas utilidades y minimas utilidades y media.
	            break;
	        default:
	            System.out.println("Opcion no valida");
	            break;

}
