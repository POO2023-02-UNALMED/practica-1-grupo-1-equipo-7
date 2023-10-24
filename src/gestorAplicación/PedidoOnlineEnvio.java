package gestorAplicación;

import java.util.ArrayList;
import java.util.List;

public class PedidoOnlineEnvio {
	private int numeroOrden;
	private int cantidadPlatos;
	private String estadoPedido;
	public String direccionPedido;
	protected String tipoPedido = "Pedido de envío";
	private static List<Plato> carrito=new ArrayList<>(); 
	private static List<Pedido> Pedidos =new ArrayList<>(); 
	 Factura Factura;
	
	//Constructor
	
	public PedidoOnlineEnvio() {
		this(0, 0, null, null);
	}
	public PedidoOnlineEnvio(int numeroOrden, int cantidadPlatos, String direccionPedido, String tipoPedido) {
		this.numeroOrden = numeroOrden;
		this.cantidadPlatos = cantidadPlatos;
		this.direccionPedido = direccionPedido;
		this.tipoPedido = tipoPedido;
		
	}
	
	public static List<Pedido> getPedidos(){
		return Pedidos;
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
	        // Agrega_otros_detalles_del_plato_si_es_necesario
	    }
	}
	
	
	public class SistemaDeNotificacion {

	    // Método_para_confirmar_un_pedido_dentro_de_la_aplicación
	    public void confirmarPedidoEnApp(Cliente cliente, int numeroOrden) {
	        // Realizar_acciones_de_confirmación,_como_actualizar_el_estado_del_pedido
	    	setEstadoPedido("Confirmado");

	        // Enviar_una_notificación_dentro_de_la_aplicación_al_cliente
	        String mensaje = "Su pedido con el número de orden " + getNumeroOrden() + " ha sido confirmado y va a en camino a su hogar.";
	        System.out.print(mensaje);

	        System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
	    }
	}
}
