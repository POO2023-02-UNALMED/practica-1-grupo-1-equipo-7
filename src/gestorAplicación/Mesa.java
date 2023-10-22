package gestorAplicación;

import java.util.ArrayList;

import java.util.List;


public class Mesa {

	private int numero;
	private Cliente cliente;
	private boolean estado;
	private Mesa[]listadoObjetos=new Mesa[10];
	
	
	public Mesa(int numero, Cliente cliente, boolean estado) {
		this.numero = numero;
		this.cliente = cliente;
		this.estado = estado;
		
	}
	
	public void asignarCliente(Cliente cliente) {
		this.cliente = cliente;
		this.cliente.setMesa(this);
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public List<Mesa> mesaDisponible() {
		List<Mesa> mesas=new ArrayList<>();
		for(Mesa i :listadoObjetos ) {
			if (i.estado) {
				mesas.add(i);
				
			}
			
			
		}
		return mesas;
	}
	public void  tomarMesa() {
		this.estado=false;
		
		
	}
	public void abandonarMesa() {
		this.estado=true;
		
	}
	
	
	
	

}

	
	
	
	
	
	 

