package clases;



public class PedidoOnlinefisico {
	 int numeroOrden;
	 int cantidadPlatos;
	 String direccionPedido;
	 String tipoPedido = "fisico";
	
	public PedidoOnlinefisico(int numeroOrden, int cantidadPlatos, String direccionPedido, String tipoPedido) {
		this.numeroOrden = numeroOrden;
		this.cantidadPlatos = cantidadPlatos;
		this.direccionPedido = direccionPedido;
		this.tipoPedido= tipoPedido;
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
	
}

