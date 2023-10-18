package gestorAplicación;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class Reserva {
	private int numeroReserva;
	private List<Reserva>reservas=new ArrayList();
	private static int cantidadReservas;
	
	public Reserva(int numeroReserva, List<Reserva> reservas) {
		
		this.numeroReserva = numeroReserva;
		this.reservas.add(this);
		cantidadReservas ++;
		
	}
	public int getNumeroReserva() {
		return numeroReserva;
	}
	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}
	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	public static int getCantidadReservas() {
		return cantidadReservas;
	}
	public static void setCantidadReservas(int cantidadReservas) {
		Reserva.cantidadReservas = cantidadReservas;
	}
	
	public void generarReserva(Mesa mesa) {
		reservas.add(this);
		mesa.tomarMesa();
		
	}// voy adelantando esta, si algo cambia lo que necesite
	
	
	

}
