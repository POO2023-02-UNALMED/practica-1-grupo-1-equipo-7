package funcionalidades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import basedatos.Deserializacion;
import basedatos.Serializacion;
import gestorAplicación.Caja;
import gestorAplicación.Cliente;
import gestorAplicación.Inventario;
import gestorAplicación.Mesa;
import gestorAplicación.Reserva;
import gestorAplicación.Restaurante;
import gestorAplicación.Sedes;

public class Reservaciones {

	static Scanner input1 = new Scanner(System.in);

	public static void reservaciones(Cliente nuevoCliente)throws FileNotFoundException , IOException, ClassNotFoundException {
		
		    while (true) {

			System.out.println(" -------Reservaciones---------");
			System.out.println("¿Qué le gustaría hacer?");
			System.out.println("1. Reservar");
			System.out.println("2. Cancelar o modificar la reserva");
			System.out.println("3. Salir");
			int opcion = input1.nextInt();

			switch (opcion) {

			case 1:

				generarReserva(nuevoCliente);
				break;

			case 2:

				cancelarModificarReserva(nuevoCliente);
				break;

			case 3:
				System.out.println("Salir");
				System.exit(0);
				
			default:

				System.out.println("Opción Inválida");

			}
			
		}
	}

	public static void generarReserva(Cliente nuevoCliente)throws FileNotFoundException , IOException, ClassNotFoundException {

		String miHorario = null;
		String miMesa = null;
		Restaurante sedeElegida = null;
		while (miHorario == null) {
			System.out.println("Fechas disponibles para realizar la reservación ");

			System.out.println("1. 2023-10-25 14:00 PM");
			System.out.println("2. 2023-10-25 18:00 PM");
			System.out.println("3. 2023-10-26 12:00 PM");
			System.out.println("4. 2023-10-30 11:00 AM");
			int opcion1 = input1.nextInt();

			switch (opcion1) {

			case 1:

				miHorario = "2023-10-25 14:00 PM";
				break;

			case 2:

				miHorario = "2023-10-25 18:00 PM";
				break;

			case 3:

				miHorario = "2023-10-26 12:00 PM";
				break;

			case 4:

				miHorario = "2023-10-30 11:00 AM";
				break;

			default:

				System.out.println("Opción Inválida");

			}
		}
		while (miMesa == null) {

			System.out.println("¿Qué tipo de mesa desea para su reservación? ");
			System.out.println("1. Dos personas");
			System.out.println("2. Tres Personas");
			System.out.println("3. Cuatro o más personas");
			int opcion = input1.nextInt();

			switch (opcion) {

			case 1:

				miMesa = "Dos personas";
				break;

			case 2:

				miMesa = "Tres Personas";
				break;

			case 3:

				miMesa = "Cuatro o más personas";
				break;

			default:

				System.out.println("Opción Inválida");

			}
		}

		// Sede Disponible
		ArrayList<Mesa> mesasEncontradas = Mesa.mesasDisponibles(miMesa);
		ArrayList<Restaurante> horarioEncontrados = Restaurante.horariosDisponibles(miHorario);
		ArrayList<Restaurante> sedesEncontradas = new ArrayList<Restaurante>();

		for (Restaurante restaurante : horarioEncontrados) {
			for (Mesa mesa : mesasEncontradas) {
				if (mesa.getUbicacion() == restaurante.getUbicacion()) {
					sedesEncontradas.add(restaurante);
				}
			}
		}

		if (sedesEncontradas.size() == 0) {
			System.out.println("No hay sedes disponibles para hacer su reserva");
		} else {
			System.out.println("Sedes disponibles para hacer su reserva");
			for (int i = 0; i < sedesEncontradas.size(); i++) {
				System.out.println((i + 1) + ". " + sedesEncontradas.get(i).getUbicacion());
			}

			System.out.println("Ingrese la opción de la sede [1-" + sedesEncontradas.size() + "]:");
			int opSede = input1.nextInt();

			if (opSede <= 0 || opSede > sedesEncontradas.size()) {
				System.out.println("Opción de Sede incorrecta");
			} else {
				sedeElegida = sedesEncontradas.get(opSede - 1);
				System.out.println("Sede seleccionada: " + sedeElegida.getUbicacion());
			}

			creando: while (true) {
				for (Reserva reserva : Reserva.listaReservas) {

					if (reserva.getFecha() == miHorario && reserva.getMiSede() == sedeElegida) {

						System.out.println("Ya está reservado");
						break creando;
					}
				}

				if (nuevoCliente.getId() == 0) {
					nuevoCliente = Cliente.registrarCliente();
				}

				Reserva miReserva = new Reserva(nuevoCliente, sedeElegida, miMesa, miHorario);
				System.out.println(miReserva.toString());
				
				Serializacion.serializarReserva(miReserva, "fichero.txt");
				
				
				break creando;
			}

		}

	}

	public static void cancelarModificarReserva(Cliente nuevoCliente) {
		System.out.println("1. ¿Desea cancelar su reservación?");
		System.out.println("2. ¿Desea modificar su reservación?");
		int opcion2 = input1.nextInt();
		int reOp;
		Reserva reservaElegida;
		ArrayList<Reserva> reservasCliente = null;

		switch (opcion2) {

		case 1:

			if (nuevoCliente.getId() == 0) {
				nuevoCliente = Cliente.registrarCliente();
			}

			reservasCliente = reservasCliente(nuevoCliente);

			System.out.println("Elija su reservación");
			for (int i = 0; i < reservasCliente.size(); i++) {
				System.out.println((i + 1) + ". " + reservasCliente.get(i).toString());
			}
			reOp = input1.nextInt();

			reservaElegida = reservasCliente.get(reOp - 1);
			eliminarReserva(reservaElegida);
			break;

		case 2:

			if (nuevoCliente.getId() == 0) {
				nuevoCliente = Cliente.registrarCliente();
			}

			reservasCliente = reservasCliente(nuevoCliente);

			System.out.println("Elija su reservación");
			for (int i = 0; i < reservasCliente.size(); i++) {
				System.out.println((i + 1) + ". " + reservasCliente.get(i).toString());
			}
			reOp = input1.nextInt();
			reservaElegida = reservasCliente.get(reOp - 1);
			modificarReserva(reservaElegida, nuevoCliente);
			break;
		}
	}

	public static ArrayList<Reserva> reservasCliente(Cliente nuevoCliente) {
		ArrayList<Reserva> reservasCliente = new ArrayList<Reserva>();

		for (Reserva reserva : Reserva.listaReservas) {
			if (reserva.getCliente().getId() == nuevoCliente.getId()) {
				reservasCliente.add(reserva);
			}
		}

		return reservasCliente;
	}

	public static void eliminarReserva(Reserva reservaElegida) {
		Reserva.listaReservas.remove(reservaElegida);
		System.out.println("Su reserva ha sido cancelada");
	}

	public static void modificarReserva(Reserva reservaElegida, Cliente nuevoCliente) {
		String miHorario = null;
		String miMesa = null;
		Restaurante sedeElegida = null;

		while (miHorario == null) {
			System.out.println("Elija la nueva fecha que desea para realizar la reservación ");

			System.out.println("1. 2023-10-25 14:00 PM");
			System.out.println("2. 2023-10-25 18:00 PM");
			System.out.println("3. 2023-10-26 12:00 PM");
			System.out.println("4. 2023-10-30 11:00 AM");
			int opcion1 = input1.nextInt();

			switch (opcion1) {

			case 1:

				miHorario = "2023-10-25 14:00 PM";
				break;

			case 2:

				miHorario = "2023-10-25 18:00 PM";
				break;

			case 3:

				miHorario = "2023-10-26 12:00 PM";
				break;

			case 4:

				miHorario = "2023-10-30 11:00 AM";
				break;

			default:

				System.out.println("Opción Inválida");

			}
		}
		while (miMesa == null) {

			System.out.println("Elija el nuevo tipo de mesa desea para su reservación ");
			System.out.println("1. Dos personas");
			System.out.println("2. Tres Personas");
			System.out.println("3. Cuatro o más personas");
			int opcion = input1.nextInt();

			switch (opcion) {

			case 1:

				miMesa = "Dos personas";
				break;

			case 2:

				miMesa = "Tres Personas";
				break;

			case 3:

				miMesa = "Cuatro o más personas";
				break;

			default:

				System.out.println("Opción Inválida");

			}
		}

		// Sede Disponible
		ArrayList<Mesa> mesasEncontradas = Mesa.mesasDisponibles(miMesa);
		ArrayList<Restaurante> horarioEncontrados = Restaurante.horariosDisponibles(miHorario);
		ArrayList<Restaurante> sedesEncontradas = new ArrayList<Restaurante>();

		for (Restaurante restaurante : horarioEncontrados) {
			for (Mesa mesa : mesasEncontradas) {
				if (mesa.getUbicacion() == restaurante.getUbicacion()) {
					sedesEncontradas.add(restaurante);
				}
			}
		}

		if (sedesEncontradas.size() == 0) {
			System.out.println("No hay sedes disponibles para hacer su reserva");
		} else {
			System.out.println("Sedes disponibles para hacer su reserva");
			for (int i = 0; i < sedesEncontradas.size(); i++) {
				System.out.println((i + 1) + ". " + sedesEncontradas.get(i).getUbicacion());
			}
			System.out.println("Ingrese la opción de la sede [1-" + sedesEncontradas.size() + "]:");
			int opSede = input1.nextInt();

			if (opSede <= 0 || opSede > sedesEncontradas.size()) {
				System.out.println("Opción de Sede incorrecta");
			} else {
				sedeElegida = sedesEncontradas.get(opSede - 1);
				System.out.println("Sede seleccionada: " + sedeElegida.getUbicacion());
			}

			creando: while (true) {
				for (Reserva reserva : Reserva.listaReservas) {

					if (reserva.getFecha() == miHorario && reserva.getMiSede() == sedeElegida) {

						System.out.println("Ya está reservado");
						break creando;
					}
				}

				reservaElegida.setFecha(miHorario);
				reservaElegida.setMiSede(sedeElegida);
				reservaElegida.setMiMesa(miMesa);
				System.out.println("Ya se actualizó su reserva: " + reservaElegida.toString());
				break creando;
			}
		}

	}
}