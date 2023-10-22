package gestorAplicación;
import java.util.*;

public class Queja extends ServiciosClientes {
	
	protected Empleado empleado;
	protected Sedes sede;
	protected Plato plato;
	protected enum Tipos {Menu, Empleado, Sede, Otro};
	protected Tipos tipo;
	protected static int count;
	protected static List<Queja> QuejasMenu = new ArrayList<>();
	protected static List<Queja> QuejasEmpleados = new ArrayList<>();
	protected static List<Queja> QuejasSedes = new ArrayList<>();
	protected static List<Queja> QuejasOtros = new ArrayList<>();
	
	public Queja() {
		this(null, null, null, null, null, null, 0);
	}
	
	public Queja(Cliente cliente, Tipos tipo, Plato plato, String texto, int reference) {
		this(cliente, tipo, plato, null, null, texto, reference);
	}
	
	public Queja(Cliente cliente, Tipos tipo, Empleado empleado, String texto, int reference) {
		this(cliente, tipo, null, empleado, null, texto, reference);
	}
	
	public Queja(Cliente cliente, Tipos tipo, Sedes sede, String texto, int reference) {
		this(cliente, tipo, null, null, sede, texto, reference);
	}
	
	public Queja(Cliente cliente, Tipos tipo, Plato plato, Empleado empleado, Sedes sede, String texto, int reference) {
		super(cliente, texto, reference);
		count++;
		
		this.tipo = tipo;
		this.plato = plato;
		this.empleado = empleado;
		this.sede = sede;
		
		if (tipo == Tipos.Menu) {
			Queja.QuejasMenu.add(this);
		}
		
		if (tipo == Tipos.Empleado) {
			Queja.QuejasEmpleados.add(this);
		}
		
		if (tipo == Tipos.Sede) {
			Queja.QuejasSedes.add(this);
		}
		
		if (tipo == Tipos.Otro || tipo == null) {
			Queja.QuejasOtros.add(this);
		}
		
	}
	
	public String MostrarQuejas() {
		if (this.tipo == Tipos.Menu) {
			return "Nombre: " + super.cliente.getNombre() + "\n" + "Realizo una queja sobre el platillo: " this.plato.getNombre() +  super.getTexto();
		}
	}
	
	public Tipos getTipo() {
		return this.tipo;
	}
	
	public void setTipo(Tipos tipe) {
		this.tipo = tipe;
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
