package gestorAplicación;
import java.util.*;

public class Devolucion extends ServiciosClientes{
	protected Cliente cliente;
	protected int referencia;
	protected Factura factura;
	protected String razonDevolucion;
	protected static List<Devolucion> ListaDevoluciones = new ArrayList<>();
	private static int count;
	
	
	public Devolucion(String nombre, int id, Factura factura, String texto) {
		super(nombre, id, texto);
		this.factura = factura;
		Devolucion.ListaDevoluciones.add(this);
		count++;
	}
	
	public int getCantidadDevoluciones() {
		return count;
	}
	
	public List<Devolucion> getDevoluciones(){
		return ListaDevoluciones;
	}
	
}