package gestorAplicación;
import Factura.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoOnlinefisico {
	 private int numeroOrden;
	 private int cantidadPlatos;
	 private String estadoPedido;
	 protected String direccionPedido2;
	 protected String tipoPedido = "Pedido Fisico";
	 private List<Plato> carrito=new ArrayList<>(); 
	
	 //Constructor_de_la_clase

	public PedidoOnlinefisico(int numeroOrden, int cantidadPlatos, String direccionPedido, String tipoPedido) {
		this.numeroOrden = numeroOrden;
		this.cantidadPlatos = cantidadPlatos;
		this.direccionPedido2 = direccionPedido;
		this.tipoPedido= tipoPedido;
		
	}
	public void mostarConfirmacion() {
	    System.out.println("Número de Orden: " + numeroOrden);
	    System.out.println("Cantidad de Platos: " + cantidadPlatos);
	    System.out.println("Dirección de Envío: " + direccionPedido2);
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
	String mensaje = "Su pedido con el número de orden " + getNumeroOrden() + " ha sido confirmado. Pedido en espera para ser recogido.";
	System.out.print(mensaje);

	System.out.println("Pedido confirmado en la aplicación y notificación enviada al cliente.");
	
		}
	}
	
	public class PedidoDeComida {
	    protected String domiciliario;
	    
	    public void asignarDomiciliario(String domiciliario) {
	        this.domiciliario = domiciliario;
	    }
	}
	
	public void generarFactura(Factura Factura) {
		public Factura();
			
		}
}
	
	//getters and setters
	public int getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public int getCantidadPlatos() {
		return cantidadPlatos;
	}
	public void agregarPedidoAlCarrito(Plato plato) {
		carrito.add(plato);	
	}
	public String getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
}


