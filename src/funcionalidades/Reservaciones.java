package funcionalidades;
import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicación.Caja;
import gestorAplicación.Inventario;
import gestorAplicación.Sedes;

public class Reservaciones {
	
	static ArrayList<Sedes> sedes = new ArrayList<Sedes>();
	
	
    static {
    Inventario inventario1=new Inventario();
    Inventario inventario2 = new Inventario();
    Inventario inventario3 = new Inventario();
    Inventario inventario4 = new Inventario();  
    
	sedes.add(new Sedes ("La America", "Carrera 80 #45-B", 300, inventario1, new Caja( 10000000, 21345 )) );
	sedes.add(new Sedes ("Envigado", " Carrera 43 N° 38 sur 35", 350, inventario2, new Caja( 10000000, 21346 )) );
	sedes.add(new Sedes ("Sandiego", " Carrera 33#27-105", 380, inventario3, new Caja( 10000000, 21347 )) );
	sedes.add(new Sedes ("Belen", " Carrera 42#33-A", 380, inventario4, new Caja( 10000000, 21347 )));
}
	

	
public static void main(String [] args) {

	System.out.println("1. Reservaciones\n2. Salir");
	Scanner input1 = new Scanner(System.in);
    int  opcion;
    opcion = input1.nextInt();;
	
    switch(opcion){
    
    case 1:
    	
    	System.out.println(" -------Reservaciones---------");
	    System.out.println(" ¿Qué le gustaría hacer?");
        System.out.println("1. Reservar");
        System.out.println("2. Cancelar o modificar la reserva");
    
        opcion = input1.nextInt();
    
        switch(opcion) {
        
        case 1:
        	
        	System.out.println(" Elija la opción de la fecha que le conviene");
        	
        	
        }
        
        
        
        
        
        
    case 2:
    	
    	System.out.println("Salir");
		break;
    
    }
    
    
    

	
      
}
	
}
