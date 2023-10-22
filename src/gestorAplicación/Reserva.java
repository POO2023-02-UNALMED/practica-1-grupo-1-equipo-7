package gestorAplicación;
import java.util.ArrayList;
import java.util.List;


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


}	
	
	


