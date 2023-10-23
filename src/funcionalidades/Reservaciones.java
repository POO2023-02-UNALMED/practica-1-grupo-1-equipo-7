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
		Inventario inventario1 = new Inventario();
		Inventario inventario2 = new Inventario();
		Inventario inventario3 = new Inventario();
		Inventario inventario4 = new Inventario();

		restaurante.add(new Sedes("La America", "Carrera 80 #45-B", 300, inventario1, new Caja(10000000, 21345)));
		restaurante.add(new Sedes("Envigado", " Carrera 43 N° 38 sur 35", 350, inventario2, new Caja(10000000, 21346)));
		restaurante.add(new Sedes("Sandiego", " Carrera 33#27-105", 380, inventario3, new Caja(10000000, 21347)));
		restaurante.add(new Sedes("Belen", " Carrera 42#33-A", 380, inventario4, new Caja(10000000, 21347)));

	}

	public static void main(String[] args) {

		System.out.println("1. Reservaciones\n2. Salir");
		Scanner input1 = new Scanner(System.in);
		int opcion;
		opcion = input1.nextInt();
		;

		switch (opcion) {

		case 1:

			System.out.println(" -------Reservaciones---------");
			System.out.println("¿Qué le gustaría hacer?");
			System.out.println("1. Reservar");
			System.out.println("2. Cancelar o modificar la reserva");
			System.out.println("3. Volver a Reservaciones");
			System.out.println("3. Volver al menú principal");
			opcion = input1.nextInt();

			switch (opcion) {

			case 1:
				
				Scanner input2 = new Scanner(System.in);
				
				//ArrayList<Restaurante> miRestaurante = Restaurante.sedes;
			    System.out.println("Fechas disponibles para realizar la reservación ");
				
			    System.out.println("2023-10-25 14:00 PM");
				System.out.println("2023-10-25 18:00 PM");
				System.out.println("2023-10-26 12:00 PM");
			    System.out.println("2023-10-30 11:00 AM");
			    int mihorario = input1.nextInt();
				
			    System.out.println("¿Para cuántas personas son la reserva? ");
			    System.out.println("1. Dos personas");
			    System.out.println("2. Tres Personas");
			    System.out.println("3. Cuatro o más personas");
			    int mimesa = input1.nextInt();
			    
			    Restaurante.sedesDisponibles(mihorario, mimesa);
			    
			
			case 2:

				System.out.println("Salir");
				System.exit(0);

			}

		}
	}
}