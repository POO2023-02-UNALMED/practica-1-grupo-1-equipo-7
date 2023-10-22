package gestorAplicación;

public class AsignarEmpleadoEnvio{
	 private String referenciaPedido;
	 protected PedidoOnlineEnvio numeroOrden;
	 protected Persona nombre;
	 protected Persona id;
	 protected PedidoOnlineEnvio estadoPedido;
	 protected PedidoOnlineEnvio direccionPedido;
	 private Empleado empleado;
	 //constructor
	 public AsignarEmpleadoEnvio(String referenciaPedido, PedidoOnlineEnvio numeroOrden, Persona nombre,Persona id, PedidoOnlineEnvio estadoPedido, PedidoOnlineEnvio direccionPedido) {
		 this.referenciaPedido = referenciaPedido;
		 this.direccionPedido = direccionPedido;
		 this.id = id;
		 this.referenciaPedido = referenciaPedido;
		 this.numeroOrden = numeroOrden;
		 this.nombre = nombre;
	 }
	
	 //getters and setters
	 public String getReferenciaPedido() {
		 return referenciaPedido;
	 }
	 public void setReferenciaPedido(String referenciaPedido) {
		 this.referenciaPedido = referenciaPedido;
	 }
}
