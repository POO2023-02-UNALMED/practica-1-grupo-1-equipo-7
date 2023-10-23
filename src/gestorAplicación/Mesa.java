package gestorAplicación;

import java.util.ArrayList;

import java.util.List;


public class Mesa {

	private String numMesa;
	private static Cliente cliente;
	private String tipoMesa;
	private String ubicacion;
	private static ArrayList<Mesa> listaMesas = new ArrayList<Mesa>();
	
	public Mesa(String numMesa, String tipoMesa, String ubicacion) {
		this.numMesa = numMesa;
		this.tipoMesa = tipoMesa;
		this.ubicacion = ubicacion;
		listaMesas.add(this);
	}
	
	public void asignarCliente(Cliente cliente) {
		Mesa.cliente = cliente;
		Mesa.cliente.setMesa(this);
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

	public static Cliente getCliente() {
		return cliente;
	}
	 
	public void setCliente(Cliente cliente) {
		Mesa.cliente = cliente;
	}
	
	public String getNumMesa() {
		return numMesa;
	}

	public void setNumMesa(String numMesa) {
		this.numMesa = numMesa;
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

	
	
	
	
	
	 

