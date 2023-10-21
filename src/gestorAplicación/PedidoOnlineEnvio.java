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
	
	
	
	
	public class SistemaDeNotificacion {

	    // Método para confirmar un pedido dentro de la aplicación
	    public void confirmarPedidoEnApp(Cliente cliente, Pedido pedido) {
	        // Realizar acciones de confirmación, como actualizar el estado del pedido
	        pedido.setEstado("Confirmado");

	        // Enviar una notificación dentro de la aplicación al cliente
	        String mensaje = "Su pedido con el número de orden " + getNumeroOrden() + " ha sido confirmado.";
	        System.out.print(mensaje);

	        System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
	    }
	}
}
