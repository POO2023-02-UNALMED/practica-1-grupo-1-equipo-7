package gestorAplicación;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import gestorAplicación.Restaurante;

public class Reserva implements Serializable{

	private Cliente cliente;
	private Restaurante miSede;
	private String miMesa;
	private String fecha;
	static List<Cliente> clientes = new ArrayList<>();
	public static ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();

	public Reserva(Cliente cliente, Restaurante miSede, String miMesa, String fecha) {
		this.cliente = cliente;
		this.miSede = miSede;
		this.miMesa = miMesa;
		this.fecha = fecha;
		listaReservas.add(this);
	}

	public Reserva(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Restaurante getMiSede() {
		return this.miSede;
	}

	public void setMiSede(Restaurante miSede) {
		this.miSede = miSede;
	}

	public String getMiMesa() {
		return this.miMesa;
	}

	public void setMiMesa(String miMesa) {
		this.miMesa = miMesa;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {

		return ("El cliente " + this.getCliente().getId() + " tiene su reservación para la fecha " + this.getFecha()
				+ " en la " + this.getMiSede().getUbicacion() + " y, escogió la mesa " + this.getMiMesa());
	}

}
