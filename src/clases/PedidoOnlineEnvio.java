package clases;

public class PedidoOnlineEnvio {
	private int numeroOrden;
	private int cantidadPlatos;
	private String direccionPedido;
	protected String tipoPedido = "envio";
	
	
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
}
