package gestorAplicación;
import java.util.*;

public class Queja extends ServiciosClientes {
	
	protected Empleado empleado;
	protected Sedes sede;
	protected Plato plato;
	protected String tipo;
	protected static int count;
	protected static List<Queja> QuejasMenu = new ArrayList<>();
	protected static List<Queja> QuejasEmpleados = new ArrayList<>();
	protected static List<Queja> QuejasSedes = new ArrayList<>();
	protected static List<Queja> QuejasOtros = new ArrayList<>();
	
	public Queja() {
		this(null, null, null, null, null, null, 0);
	}
	
	public Queja(Cliente cliente, String tipo, Plato plato, String texto, int reference) {
		this(cliente, tipo, plato, null, null, texto, reference);
	}
	
	public Queja(Cliente cliente, String tipo, Empleado empleado, String texto, int reference) {
		this(cliente, tipo, null, empleado, null, texto, reference);
	}
	
	public Queja(Cliente cliente, String tipo, Sedes sede, String texto, int reference) {
		this(cliente, tipo, null, null, sede, texto, reference);
	}
	
	public Queja(Cliente cliente, String tipo, Plato plato, Empleado empleado, Sedes sede, String texto, int reference) {
		super(cliente, texto, reference);
		count++;
		
		this.tipo = tipo;
		this.plato = plato;
		this.empleado = empleado;
		this.sede = sede;
		
		if (tipo == "Menu") {
			Queja.QuejasMenu.add(this);
		}
		
		if (tipo == "Empleado") {
			Queja.QuejasEmpleados.add(this);
			this.nuevaAmonestacion();
		}
		
		if (tipo == "Sede") {
			Queja.QuejasSedes.add(this);
		}
		
		if (tipo == "Otro" || tipo == null) {
			Queja.QuejasOtros.add(this);
		}
		
	}
	
	public String MostrarQuejas() {
		if (this.tipo == "Menu") {
			return "Nombre: " + super.cliente.getNombre() + "\n" + "Realizo una queja sobre el platillo: " + this.plato.getNombre() +  "\n" + "'" + super.getTexto() + "'";
		}
		
		if (this.tipo == "Empleado") {
			return "Nombre: " + super.cliente.getNombre() + "\n" + "Realizo una queja sobre el empleado: " + this.empleado.getNombre() + " - " + this.empleado.getCargo() + "\n" +
					"'" + super.getTexto() + "'";
		}
		
		if (this.tipo == "Sede") {
			return "Nombre: " + super.cliente.getNombre() + "\n" + "Realizo una queja sobre la sede: " + this.sede.getUbicacion() + "\n"  + "'" + super.getTexto() + "'";
		}
		
		if (this.tipo == "Otro") {
			return "Nombre: " + super.cliente.getNombre() + "\n"  + "Realizo una queja: " + "'" + super.getTexto() + "'";
		}
		
		return null;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipe) {
		this.tipo = tipe;
	}
	
	 public int nuevaAmonestacion() {
	    	return this.empleado.countAmonestaciones + 1;
	    }
	
	public List<Queja> getQuejasMenu() {
		return QuejasMenu;
	}
	
	public List<Queja> getQuejasEmpleados(){
		return QuejasEmpleados;
	}
	
	public List<Queja> getQuejasSedes(){
		return QuejasSedes;
	}
	
	public List<Queja> getQuejasOtros(){
		return QuejasOtros;
	}
	
	public int cantidadQuejas() {
		return count;
	}
	
	public int cantidadQuejasMenu() {
		return QuejasMenu.size();
	}
	
	public int cantidadQuejasEmpleados() {
		return QuejasEmpleados.size();
	}
	
	public int cantidadQuejasSedes() {
		return QuejasSedes.size();
	}
	
	public int cantidadQuejasOtros() {
		return QuejasOtros.size();
	}
	
}
