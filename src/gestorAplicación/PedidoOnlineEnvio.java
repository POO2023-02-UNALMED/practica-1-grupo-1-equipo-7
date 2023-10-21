package gestorAplicación;

import java.util.ArrayList;
import java.util.List;

public class PedidoOnlineEnvio {
	private int numeroOrden;
	private int cantidadPlatos;
	private String direccionPedido;
	protected String tipoPedido = "envio";
	private List<Plato> carrito=new ArrayList<>(); 
	
	
	//Constructor
	public PedidoOnlineEnvio(int numeroOrden, int cantidadPlatos, String direccionPedido, String tipoPedido) {
		this.numeroOrden = numeroOrden;
		this.cantidadPlatos = cantidadPlatos;
		this.direccionPedido = direccionPedido;
		this.tipoPedido = tipoPedido;
	}
	
	
	
	
	
	
	
	
	
	public int getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public int getCantidadPlatos() {
		return cantidadPlatos;
	}
	public void setCantidadPlatos(int cantidadPlatos) {
		this.cantidadPlatos = cantidadPlatos;
	}
	public String getDireccionPedido() {
		return direccionPedido;
	}
	public void setDireccionPedido(String direccionPedido) {
		this.direccionPedido =direccionPedido;
	}
	public void agregarPedidoAlCarrito(Plato plato) {
		carrito.add(plato);
		
		
	}
	
	public void mostarConfirmacion() {
	    System.out.println("Número de Orden: " + numeroOrden);
	    System.out.println("Cantidad de Platos: " + cantidadPlatos);
	    System.out.println("Dirección de Envío: " + direccionPedido);
	    System.out.println("Tipo de Pedido: " + tipoPedido);
	    
	    System.out.println("Platos en el Carrito:");
	    for (Plato plato : carrito) {
	        System.out.println("Nombre: " + plato.getNombre());
	       
	        System.out.println("Precio: " + plato.getPrecio());
	        // Agrega otros detalles del plato si es necesario
	    }
	}
	
	
	
}
