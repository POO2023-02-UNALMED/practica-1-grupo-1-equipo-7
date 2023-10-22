package gestorAplicación;

public class ServiciosClientes {
	
	protected Cliente cliente;
	protected String texto;
	protected int codigoReferencia;
	
	public ServiciosClientes(){
		
	}
	
	static{
		;
		Cliente Uno = new Cliente("Julian Vargas", 71628249);
		Cliente Dos = new Cliente("Martha Wayne", 48752698);
		Cliente Tres = new Cliente("Barbara Gordon", 1173149587);
		Cliente Cuatro = new Cliente("Carol Diaz", 25789635);
		Cliente Cinco = new Cliente("Santiago Lopez", 78945625);
		Cliente Seis = new Cliente("Estaban Tabares", 12578963);
		Cliente Siete = new Cliente("Elizabeth Bennet", 68721493);
		
		}
	
	public ServiciosClientes(String texto, int codigoReferencia) {
		this(Cliente.Anonimo, texto,codigoReferencia);
		
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
