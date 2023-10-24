package funcionalidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestorAplicación.Caja;
import gestorAplicación.Cliente;
import gestorAplicación.Inventario;
import gestorAplicación.Mesa;
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
		
		
		new Mesa("Mesa uno", "Dos personas", "Sede: Las Americas");
		new Mesa("Mesa dos", "Tres personas", "Sede: Envigado");
		new Mesa("Mesa tres", "Cuatro o más personas", "Sede: Belen");
		new Mesa("Mesa cinco", "Dos personas", "Sede: Belen");
		new Mesa("Mesa siete", "Tres personas", "Sede: Las Americas");
		new Mesa("Mesa siete", "Cuatro o más personas", "Sede: Sandiego");
		new Mesa("Mesa tres", "Dos personas", "Sede: Envigado");


	}

	public static void main(String[] args) {
		
//		new Mesa("Mesa uno", "Dos personas", "Sede: Las Americas");
//		new Mesa("Mesa dos", "Tres personas", "Sede: Envigado");
//		new Mesa("Mesa tres", "Cuatro o más personas", "Sede: Belen");
//		new Mesa("Mesa cinco", "Dos personas", "Sede: Belen");
//		new Mesa("Mesa siete", "Tres personas", "Sede: Las Americas");
//		new Mesa("Mesa siete", "Cuatro o más personas", "Sede: Sandiego");
//		new Mesa("Mesa tres", "Dos personas", "Sede: Envigado");

		System.out.println("6. Reservaciones\n7. Salir");
		Cliente nuevoCliente = new Cliente(null, 0);
		Scanner input1 = new Scanner(System.in);
		int opcion;
		opcion = input1.nextInt();
		;

		switch (opcion) {

		case 6:

			Reserva.reservaciones(nuevoCliente);
			Cliente micliente = new Cliente("Null", 0);
			Reserva.reservaciones(micliente);

		case 7:

			System.out.println("Salir");
			System.exit(0);

		}

	}
}