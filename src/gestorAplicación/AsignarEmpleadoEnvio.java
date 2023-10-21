package gestorAplicación;

public class AsignarEmpleadoEnvio{
	 private String referenciaPedido;
	 private PedidoOnlineEnvio numeroOrden;
	 private Persona nombre;
	 private Persona id;
	 private PedidoOnlineEnvio estadoPedido;
	 private PedidoOnlineEnvio direccionPedido;
	 
	 public AsignarEmpleadoEnvio(String referenciaPedido, PedidoOnlineEnvio numeroOrden, Persona nombre,Persona id, PedidoOnlineEnvio estadoPedido, PedidoOnlineEnvio direccionPedido) {
		 this.direccionPedido = direccionPedido;
		 this.id = id;
		 this.referenciaPedido = referenciaPedido;
	 }
}
