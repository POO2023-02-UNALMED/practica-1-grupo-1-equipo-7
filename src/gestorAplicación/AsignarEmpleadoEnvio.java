package gestorAplicación;

public class AsignarEmpleadoEnvio{
	 private String referenciaPedido;
	 PedidoOnlineEnvio numeroOrden;
	 PedidoOnlineEnvio estadoPedido;
	 PedidoOnlineEnvio direccionPedido;
	 Empleado empleado;
	 //constructor7
	 public AsignarEmpleadoEnvio() {
		 
	 }
	
	public AsignarEmpleadoEnvio(String referenciaPedido, PedidoOnlineEnvio numeroOrden, Empleado empleado, PedidoOnlineEnvio estadoPedido, PedidoOnlineEnvio direccionPedido) {
		 this.referenciaPedido = referenciaPedido;
		 this.direccionPedido = direccionPedido;
		 this.referenciaPedido = referenciaPedido;
		 this.numeroOrden = numeroOrden;
		 this.empleado = empleado;
		 this.asignarDomiciliario(empleado);
	 }
	 public void asignarDomiciliario(Empleado domiciliario) {
	        this.empleado = domiciliario;
	 }
	
	 //getters and setters
	 public String getReferenciaPedido() {
		 return referenciaPedido;
		 
	 }
	 public void setReferenciaPedido(String referenciaPedido) {
		 this.referenciaPedido = referenciaPedido;
	 }
	 
}
