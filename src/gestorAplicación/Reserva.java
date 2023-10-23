package gestorAplicación;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import gestorAplicación.Restaurante;

public class Reserva {

	private Cliente cliente;
	private Restaurante miSede;
	private String miMesa;
	static List<Cliente> clientes = new ArrayList<>();
	static Scanner input1 = new Scanner(System.in);
	static int opcion;

	public Reserva(Cliente cliente, Restaurante miSede, String miMesa) {
		this.cliente = cliente;
		this.miSede = miSede;
		this.miMesa = miMesa;
	}

	public Reserva(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Restaurante getMiSede() {
		return miSede;
	}

	public void setMiSede(Restaurante miSede) {
		this.miSede = miSede;
	}

	public String getMiMesa() {
		return miMesa;
	}

	public static void reservaciones(Cliente nuevoCliente) {

		while (true) {

			System.out.println(" -------Reservaciones---------");
			System.out.println("¿Qué le gustaría hacer?");
			System.out.println("1. Reservar");
			System.out.println("2. Cancelar o modificar la reserva");
			System.out.println("3. Volver a Reservaciones");
			System.out.println("3. Volver al menú principal");
			opcion = input1.nextInt();

			switch (opcion) {

			case 1:

				generarReserva(nuevoCliente);
				break;

			default:

				System.out.println("Opción Inválida");

			}

		}
	}

	public static void generarReserva(Cliente nuevoCliente) {
		String miHorario = null;
		String miMesa = null;
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

		// ArrayList<Restaurante> sedesEncontradas = new ArrayList<Restaurante>();
		// sedesEncontradas = Restaurante.sedesDisponibles(miHorario, miMesa);
		// System.out.println(sedesEncontradas[0]);

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
			for (Restaurante restaurante : sedesEncontradas) {
				System.out.println(restaurante.getUbicacion());
			}

			System.out.println("Ingrese la opción de la sede [1-" + sedesEncontradas.size() + "]:");
			int opSede = input1.nextInt();

			if (opSede <= 0 || opSede > sedesEncontradas.size()) {
				System.out.println("Opción de Sede incorrecta");
			} else {
				Restaurante sedeElegida = sedesEncontradas.get(opSede - 1);
				System.out.println("Sede seleccionada: " + sedeElegida.getUbicacion());

				System.out.println("");

				if (nuevoCliente.getId() == 0) {
					nuevoCliente = Cliente.registrarCliente();
				}

				Reserva miReserva = new Reserva(nuevoCliente, sedeElegida, miMesa);
				System.out.println(miReserva.toString());
				

			}

		}

	}
	
	
@Override

public String toString() {
	
	return ("El cliente " + this.getCliente().getId() + " hizo su reservación en la sede " + this.getMiSede().getUbicacion() + " y, escogió la mesa " + this.getMiMesa());
}
	
}
