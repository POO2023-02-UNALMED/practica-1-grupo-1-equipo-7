package funcionalidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestorAplicación.Caja;
import gestorAplicación.Inventario;
import gestorAplicación.Reserva;
import gestorAplicación.Restaurante;
import gestorAplicación.Sedes;

public class Reservaciones {
	
	static ArrayList<Restaurante> restaurante = new ArrayList<Restaurante>();
    static List<Reserva> reservasDisponibles = new ArrayList<>();
	
    static {
    Inventario inventario1=new Inventario();
    Inventario inventario2 = new Inventario();
    Inventario inventario3 = new Inventario();
    Inventario inventario4 = new Inventario();  
    
	restaurante.add(new Sedes ("La America", "Carrera 80 #45-B", 300, inventario1, new Caja( 10000000, 21345 )) );
	restaurante.add(new Sedes ("Envigado", " Carrera 43 N° 38 sur 35", 350, inventario2, new Caja( 10000000, 21346 )) );
	restaurante.add(new Sedes ("Sandiego", " Carrera 33#27-105", 380, inventario3, new Caja( 10000000, 21347 )) );
	restaurante.add(new Sedes ("Belen", " Carrera 42#33-A", 380, inventario4, new Caja( 10000000, 21347 )));
	
	reservasDisponibles.add(new Reserva("2023-10-25", "14:00 PM"));
	reservasDisponibles.add(new Reserva("2023-10-25", "18:00 PM"));
	reservasDisponibles.add(new Reserva("2023-10-26", "12:00 PM"));
	reservasDisponibles.add(new Reserva("2023-10-30", "11:00 AM"));
    
    }
    
	

	
public static void main(String [] args) {

	System.out.println("1. Reservaciones\n2. Salir");
	Scanner input1 = new Scanner(System.in);
    int  opcion;
    opcion = input1.nextInt();;
	
    switch(opcion){
    
    case 1:
    	
    	System.out.println(" -------Reservaciones---------");
	    System.out.println("¿Qué le gustaría hacer?");
        System.out.println("1. Reservar");
        System.out.println("2. Cancelar o modificar la reserva");
    
        opcion = input1.nextInt();
    
        switch(opcion) {
        
        case 1:
        	
        	System.out.println("Fechas disponibles para realizar la reservación ");
        	
            for (int i = 0; i < reservasDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + reservasDisponibles.get(i));
            }
           
            
            System.out.println("Elija la opción de la fecha que le conviene ");
            int opcion2 = input1.nextInt();

            if (opcion >= 1 && opcion <= reservasDisponibles.size()) {
                Reserva Reserva = reservasDisponibles.get(opcion2 - 1);
                
            } else {
                System.out.println("Opción no válida.");
            }
        	
            System.out.println("¿Para cuántas personas son la reserva? ");
            System.out.println("1. Dos personas");
            System.out.println("2. Tres Personas");
            System.out.println("3. Cuatro o más personas");
            opcion = input1.nextInt();
        }
        
        
        
        
        
        
    case 2:
    	
    	System.out.println("Salir");
		break;
    
    }
    
    
    

	
      
}
	
}
