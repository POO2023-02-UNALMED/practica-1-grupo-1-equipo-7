package gestorAplicación;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numeroOrden = count+1;
	private  int cantidadPlatos;
	private  String estadoPedido;
	public  String direccionPedido;
	private static int count;
	protected  String tipoPedido;
	private List<Plato> carrito=new ArrayList<>(); 
	private  static List<Pedido> PedidosOnline =new ArrayList<>(); 
	private  static List<Pedido> PedidosFisicos =new ArrayList<>(); 
	 Factura Factura;
	 
	 public Pedido() {
			this(0, null, null);
		}
		public Pedido( int cantidadPlatos,String tipoPedido, String Algo) {
			this.cantidadPlatos=cantidadPlatos;
			
			if(tipoPedido == "Pedido Fisico") {
				this.tipoPedido = "Pedido Fisico";
				Pedido.PedidosFisicos.add(this);
				this.direccionPedido = Algo;
	
			}
			
			if (tipoPedido == "Pedido a Domicilio") {
				this.tipoPedido = "Pedido a Domicilio";
				Pedido.PedidosOnline.add(this);
				this.direccionPedido = Algo;
				
			}			
		}
		
	public String toString() {
		return "Numero de orden: " + this.getNumeroOrden() + "\n" +
				"Tipo de Pedido: " + this.getTipoPedido() + "\n" +
				"Cantidad de Platos: " + this.getCantidadPlatos() +  "\n" +
				"Dirección de Envío: " + this.getDireccionPedido();
	}
		
	public class PedidoDeComida {
	protected String domiciliario;
		public void asignarDomiciliario(String domiciliario) {
	        this.domiciliario = domiciliario;
		}
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public  int getCantidadPlatos() {
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
	public  String getDireccionPedido() {
		return direccionPedido;
	}
	public  String getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	public void setDireccionPedido(String direccionPedido) {
		this.direccionPedido =direccionPedido;
	}
	public void agregarPedidoAlCarrito(Plato plato) {
		carrito.add(plato);	
	}
}
