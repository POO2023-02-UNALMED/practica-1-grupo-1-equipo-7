package clases;
import java.util.*;

public class Queja {
	
	protected Cliente cliente;
	protected Empleado empleado;
	protected Sedes sede;
	protected Plato plato;
	protected String queja;
	protected enum Tipos {Menu, Empleado, Sede, Otro};
	protected Tipos tipo;
	protected static int count;
	protected static List<Queja> QuejasMenu = new ArrayList<>();
	protected static List<Queja> QuejasEmpleados = new ArrayList<>();
	protected static List<Queja> QuejasSedes = new ArrayList<>();
	protected static List<Queja> QuejasOtros = new ArrayList<>();
	
	public Queja(Cliente cliente, Plato plato, Empleado empleado, Sedes sede, Tipos tipo, String texto) {
		this.cliente = cliente;
		this.queja = texto;
		count++;
		
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
		
		if (tipo == Tipos.Otro) {
			Queja.QuejasOtros.add(this);
		}
		
	}
	
}
