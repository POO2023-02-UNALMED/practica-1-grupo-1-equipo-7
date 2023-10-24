package gestorAplicación;

public class AsignarEmpleadoEnvio extends Empleado{
	 private String referenciaPedido;
	 int numeroOrden;
	 String estadoPedido;
	String direccionPedido;
	 Empleado empleado;
	 //constructor7
	 
	public AsignarEmpleadoEnvio(String nombre, String cargo, int sueldo, int codigoSede, String referenciaPedido, int numeroOrden, String estadoPedido, String direccionPedido) {
		super(nombre, cargo, sueldo, codigoSede); 
		this.referenciaPedido = referenciaPedido;
		 this.direccionPedido = direccionPedido;
		 this.referenciaPedido = referenciaPedido;
		 this.numeroOrden = numeroOrden;
		
	
	 }
	public void asignarEmpleado(Empleado empleado) {
		Empleado Domiciliario = asignarDomiciliario("Juan David", "Domiciliario", 20000, 123, 161223, "ACDC", 1612, "True", "Calle 16");
	}
	
	public Empleado asignarDomiciliario(String string, String string2, int i, int j, int k, String string3, int l,
			String string4, String string5) {
		// TODO Auto-generated method stub
		return null;
	}
	//getters and setters
	 public String getReferenciaPedido() {
		 return referenciaPedido;
		 
	 }
	 public void setReferenciaPedido(String referenciaPedido) {
		 this.referenciaPedido = referenciaPedido;
	 }
	 
}
