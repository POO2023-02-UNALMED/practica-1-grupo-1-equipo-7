package clases;

import java.util.ArrayList;

public class Mesa {

	private int numero;
	private ArrayList<Cliente> cliente;
	private boolean estado;
	
	public Mesa(int numero, ArrayList<Cliente> cliente, boolean estado) {
		this.numero = numero;
		this.cliente = cliente;
		this.estado = estado;
		
	}
	
	 public ArrayList<Cliente> getCliente(){
		 
	        return this.cliente;
	    }
	 
	 public void setCliente(ArrayList<Cliente> Cliente){
		 
	        this.cliente = cliente;
	    }
}
