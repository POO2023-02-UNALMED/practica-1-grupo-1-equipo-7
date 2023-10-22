package gestorAplicación;

import java.util.ArrayList;

import java.util.List;


public class Mesa {

	private int numero;
	private Cliente cliente;
	private String tipoMesa;
	private static Mesa[]listaMesas = new Mesa[15];
	
	
	public Mesa(int numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public void asignarCliente(Cliente cliente) {
		this.cliente = cliente;
		this.cliente.setMesa(this);
	}
	
	public String getTipoMesa() {
		return this.tipoMesa;
	}
	
	public void setTipoMesa(String tipoMesa) {
		this.tipoMesa = tipoMesa;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	 
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static ArrayList<Mesa> mesasDisponibles(String mesaDeseada) {
		
		ArrayList<Mesa> mesasQuePueden = null;

		for (Mesa mesa: listaMesas)
		{
			if(mesa.tipoMesa == mesaDeseada) {
				mesasQuePueden.add(mesa);
			}
		}
		return mesasQuePueden;
		
	}
		

}

	
	
	
	
	
	 

