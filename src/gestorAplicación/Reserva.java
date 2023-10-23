package gestorAplicación;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import gestorAplicación.Restaurante;

public class Reserva {

	private String fecha;
	private String hora;
	private int numPersonas;
	private Cliente cliente;
	static List<Cliente> clientes = new ArrayList<>();
	static Scanner input1 = new Scanner(System.in);
	static int opcion;

	public Reserva(String fecha, String hora) {

		this.fecha = fecha;
		this.hora = hora;
	}

	public Reserva(String fecha, String hora, int numPersonas, Cliente cliente) {

		this.fecha = fecha;
		this.hora = hora;
		this.numPersonas = numPersonas;
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static void reservaciones() {

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

				generarReserva();
				break;

			default:

				System.out.println("Opción Inválida");

			}

		}
	}

	public static void generarReserva() {
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

			System.out.println("¿Para cuántas personas son la reserva? ");
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

		ArrayList<Restaurante> sedesEncontradas = Restaurante.sedesDisponibles(miHorario, miMesa);

		if (sedesEncontradas.size() == 0) {
			System.out.println("No hay sedes disponibles para hacer su reserva");
		} else {
			System.out.println("Sedes disponibles para hacer su reserva");
			for (Restaurante restaurante : sedesEncontradas) {
				System.out.println(restaurante.getUbicacion());
			}

			System.out.println("Ingrese la opción de la sede [1." + sedesEncontradas.size() + "]:");
			int opSede = input1.nextInt();

			if (opSede <= 0 || opSede > sedesEncontradas.size()) {
				System.out.println("Opción de Sede incorrecta");
			}else {
				Restaurante sedeElegida = sedesEncontradas.get(opSede-1);
				System.out.println("Sede seleccionada: " + sedeElegida.getUbicacion());
			}

			// Tipo de mesa
			
			System.out.println("Estos son los tipos de mesa Disponibles en la Sede elegida");
			

		}

	}

}
