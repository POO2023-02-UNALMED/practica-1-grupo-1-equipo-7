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
		
		if (tipo == Tipos.Menu) {
			this.plato = plato;
			Queja.QuejasMenu.add(this);
		}
		
		if (tipo == Tipos.Empleado) {
			this.empleado = empleado;
			Queja.QuejasEmpleados.add(this);
		}
		
		if (tipo == Tipos.Sede) {
			this.sede = sede;
			Queja.QuejasSedes.add(this);
		}
		
		if (tipo == Tipos.Otro || tipo == null) {
			Queja.QuejasOtros.add(this);
		}
		
	}
	
}
