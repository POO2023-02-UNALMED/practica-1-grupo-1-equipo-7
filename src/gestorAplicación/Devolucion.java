package gestorAplicación;
import java.util.*;

public class Devolucion extends ServiciosClientes{
	protected Factura factura;
	protected String Estado;
	protected String t;
	protected static List<Devolucion> ListaDevoluciones = new ArrayList<>();
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
	
	@Override
	public String toString() {
		String a = null;
		if (this.getEstado() == "Pendiente") {
				
				a = "N° Solicitud: " + this.getCodigoReferencia() + "\n" + 
				"Cliente: " + this.cliente.getNombre() + " - CC. " + this.cliente.getId() + " - Email: " + this.cliente.getEmail() + "\n" + 
				"Codigo de Factura: " + this.factura.getCodigo() + "\n" +
				"Estado de la solicitud:  " + this.getEstado()+ "\n" +
				"Motivo de la solicitud: " + this.getTexto();}
		
		if(this.getEstado() == "Denegada") {
			
			a = "N° Solicitud: " + this.getCodigoReferencia() + "\n" + 
				"Cliente: " + this.cliente.getNombre() + " - CC. " + this.cliente.getId() + " - Email: " + this.cliente.getEmail() + "\n" + 
				"Estado de la solicitud:  " + this.getEstado()+ "\n" +
				"Motivo de rechazo: " + this.getT() + "\n" +
				"La solicitud fue negada, se enviara un correo al cliente con la decision tomada";
		}
		
		if(this.getEstado() == "Aprobada" ) {
			a =	"N° Solicitud: " + this.getCodigoReferencia() + "\n" + 
				"Cliente: " + this.cliente.getNombre() + " - CC. " + this.cliente.getId() + " - Email: " + this.cliente.getEmail() + "\n" + 
				"Estado de la solicitud:  " + this.getEstado()+ "\n" +
				"La solicitud fue aprobada, se enviara un correo al cliente con la decision tomada y los pasos a seguir para hacer efectiva su solicitud";
		}
		return a;		
	}
	
	public int getCantidadDevoluciones() {
		return count;
	}
	public String getT() {
		return t;
	}
	
	public void setT(String t) {
		this.t = t;
	}
	
	
	public String getEstado() {return Estado;}
	
	public void setEstado(String nuevo) {
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
	
	public static Devolucion buscarD2(List<Devolucion> lista, int codigo) {
		Devolucion a = null;
		
		for (Devolucion d: lista) {
			if(d.getCodigoReferencia() == codigo) {
				a = d;
				break;
			} break;
		}return a;
	}
	
	public static List<Devolucion> getDevoluciones(){
		return ListaDevoluciones;
	}
	
}