package funcionalidades;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {

	static Scanner sc = new Scanner(System.in);
	static ArrayList <Sedes> sedes = new ArrayList<Sedes>();
	static Scanner in = new Scanner(System.in);
	



static void reservarMesa() {
	
	System.out.println("Elija la fecha y hora oportuna");
	
	 
}
	
public static void main(String[] args) {
	boolean repetir;
	byte opcion;
	String Salir;
 	
	do {
		System.out.println("\n\nMenú Principal");
		System.out.println("\n\3.Reservaciones");
		System.out.println("\n\nOpcion 1 - Reservar");
		System.out.println("\n\nOpcion 2 - Cancelar o Modificar Reservación");
		
		opcion = readByte();
		//opcion = in.nextInt();
		
		switch(opcion) {
		case 1:
			reservarMesa();
			break;
		case 2:
			
		}
	}
}




