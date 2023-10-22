package gestorAplicación;

import java.util.ArrayList;

import java.util.List;


public class Mesa {

	private int numero;
	private ArrayList<Cliente> cliente;// esto para que se va a usar?
	private boolean estado;
	private Mesa[]listadoObjetos=new Mesa[10];// supongamos que tenemos 20 mesas
	
	
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
	//devuelve las mesas disponibles
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

	
	
	
	
	
	 

