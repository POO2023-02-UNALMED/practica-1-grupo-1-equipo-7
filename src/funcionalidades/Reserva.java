package funcionalidades;
import java.util.ArrayList;
import java.util.Scanner;
import clases.Sedes;

public class Reserva {

	static Scanner sc = new Scanner(System.in);
	static ArrayList <Sedes> sedes = new ArrayList<Sedes>();
	static Scanner in = new Scanner(System.in);

	
	
public static void main(String[] args) {
	int opcion = 0;
	boolean Salir;
	
	do {
		System.out.println("\n\nMenú Principal");
		System.out.println("\n\3.Reservaciones");
		System.out.println("\n\nOpcion 1 - Reservar");
		System.out.println("\n\nOpcion 2 - Cancelar o Modificar Reservación");
		opcion = in.nextInt();
		
		switch(opcion) {
		case 1:
			ReservarMesa();
			break;
		case 2:
			
		}
		
		
	}
	

	
}

static void ReservarMesa() {
	
	System.out.println("¿Para cuántas personas es la reservación?");
	String cantidad = in.next();
	System.out.println("¿Para qué fecha desea hacer la reservaciónS?");
	
	
}


}
