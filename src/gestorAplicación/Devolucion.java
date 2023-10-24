package gestorAplicación;
import java.util.*;

public class Devolucion extends ServiciosClientes{
	protected Factura factura;
	protected String Estado;
	public static List<Devolucion> ListaDevoluciones = new ArrayList<>();
	private static int count;
	
	
	public Devolucion(String nombre, int id, String correo, int fac, String texto) {
		super(nombre, id, texto);
		this.cliente.setEmail(correo);
		
		Factura a = Factura.buscarFactura(fac);
		this.factura = a;
		this.Estado = "Pendiente";
		Devolucion.ListaDevoluciones.add(this);
		count++;
	}
	
	public String toString() {
		return "N° Solicitud: " + this.getCodigoReferencia() + "\n" + 
				"Cliente: " + this.cliente.getNombre() + " - CC. " + this.cliente.getId() + " - Email: " + this.cliente.getEmail() + "\n" + 
				"Codigo de Factura: " + this.factura.getCodigo() + "\n" +
				"Estado de la solicitud:  " + this.getEstado()+ "\n" +
				"Motivo de la solicitud: " + this.getTexto();
				
	}
	
	public int getCantidadDevoluciones() {
		return count;
	}
	
	public String getEstado() {return Estado;}
	
	public void cambiarEstado(String nuevo) {
		this.Estado = nuevo;	
	}
	
	public static boolean buscarD(List<Devolucion> lista, int codigo) {
		boolean a = false;
		
		for (Devolucion d: lista) {
			if(d.getCodigoReferencia() == codigo) {
				a = true;
				break;
			} break;
		}return a;
	}
	
	public static void removerDevolucion(int codigo) {
		for(Devolucion del: Devolucion.ListaDevoluciones) {
			if (del.getCodigoReferencia() == codigo) {
				Devolucion.ListaDevoluciones.remove(del);
			}
		}
	}
	
	public List<Devolucion> getDevoluciones(){
		return ListaDevoluciones;
	}
	
}