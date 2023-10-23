package gestorAplicación;

import java.util.ArrayList;

import java.util.List;


public class Mesa {

	private int numero;
	private Cliente cliente;
	private String tipoMesa;
	private String ubicacion;
	private static ArrayList<Mesa> listaMesas = new ArrayList<Mesa>();
	
	public Mesa(int numero, String tipoMesa, String ubicacion) {
		this.numero = numero;
		this.tipoMesa = tipoMesa;
		this.ubicacion = ubicacion;
		listaMesas.add(this);
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
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
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
		
		ArrayList<Mesa> mesasQuePueden = new ArrayList<Mesa>();

		for (Mesa mesa: listaMesas)
		{
			if(mesa.getTipoMesa() == mesaDeseada) {
				mesasQuePueden.add(mesa);
			}
		}
		return mesasQuePueden;
		
	}
		

}

	
	
	
	
	
	 

