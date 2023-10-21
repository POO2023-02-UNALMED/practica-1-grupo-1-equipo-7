package gestorAplicación;

import java.util.ArrayList;
import java.util.List;

public class PedidoOnlineEnvio {
	private int numeroOrden;
	private int cantidadPlatos;
	private String estadoPedido;
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
	public String getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public int getCantidadPlatos() {
		return cantidadPlatos;
	}
	public void setCantidadPlatos(int cantidadPlatos) {
		this.cantidadPlatos = cantidadPlatos;
	}
	public int getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
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
	
	
	public class SistemaDeNotificacion {

	    // Método para confirmar un pedido dentro de la aplicación
	    public void confirmarPedidoEnApp(Cliente cliente, int numeroOrden) {
	        // Realizar acciones de confirmación, como actualizar el estado del pedido
	    	setEstadoPedido("Confirmado");

	        // Enviar una notificación dentro de la aplicación al cliente
	        String mensaje = "Su pedido con el número de orden " + getNumeroOrden() + " ha sido confirmado.";
	        System.out.print(mensaje);

	        System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
	    }
	}
}
