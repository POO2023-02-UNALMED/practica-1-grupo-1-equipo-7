package gestorAplicación;


public class ServiciosClientes {
	
	protected Cliente cliente;
	protected String texto;
	protected int codigoReferencia = count + 1;
	protected static int count;
	
	public ServiciosClientes(){
		
	}

	
	public ServiciosClientes(String texto) {
		this(((Cliente)null), texto);
		
	}
	
	public ServiciosClientes(Cliente cliente, String texto) {
		this.cliente = cliente;
		this.texto = texto;
		count++;
	}
	
	public ServiciosClientes(String nombre, int id, String texto) {
		this(((Cliente)null),texto);
		Cliente cl;
		Cliente a;
		cl = Cliente.buscarClienteXNombre(nombre);
		if (cl == null) {
			a = new Cliente(nombre, id);
			cl = a;
		}
		this.cliente = cl;
		
	}
	
	public ServiciosClientes(String nombre, String texto) {
		this(nombre, 0, texto);
	}
	
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public int getCodigoReferencia() {
		return this.codigoReferencia;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void setCodigoReferencia(int codigo) {
		this.codigoReferencia = codigo;
	}
	
}
