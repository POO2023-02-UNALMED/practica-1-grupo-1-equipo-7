package gestorAplicación;

public class ServiciosClientes {
	
	protected Cliente cliente;
	protected String texto;
	protected int codigoReferencia;
	
	public ServiciosClientes(){
		
	}	
	
	public ServiciosClientes(Cliente cliente, String texto, int codigoReferencia) {
		this.cliente = cliente;
		this.texto = texto;
		this.codigoReferencia = codigoReferencia;
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
