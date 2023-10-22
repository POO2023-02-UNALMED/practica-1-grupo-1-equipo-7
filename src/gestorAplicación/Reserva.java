package gestorAplicación;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reserva {

	private String fecha;
	private String hora;
	private int numPersonas;
	private Cliente cliente;
    static List<Cliente> clientes = new ArrayList<>();
	
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


public static void generarReserva() {
	Scanner input1 = new Scanner(System.in);
    int  opcion;
    opcion = input1.nextInt();
	
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


@Override
public String toString() {
    return "Fecha: " + fecha + ", Hora: " + hora;
}

}	
	
	


