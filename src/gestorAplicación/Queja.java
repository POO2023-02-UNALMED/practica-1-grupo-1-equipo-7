package gestorAplicación;
import java.util.*;

public class Queja extends ServiciosClientes {
	
	protected Empleado empleado;
	protected Restaurante sede;
	protected Plato plato;
	protected String tipo;
	protected static int count;
	protected static List<Queja> Quejas = new ArrayList<>();
	protected static List<Queja> QuejasMenu = new ArrayList<>();
	protected static List<Queja> QuejasEmpleados = new ArrayList<>();
	protected static List<Queja> QuejasSedes = new ArrayList<>();
	protected static List<Queja> QuejasOtros = new ArrayList<>();
	
	public Queja() {
		this(null, "Otro", null, null);
	}
	
	public Queja(String nombre, String tipo, String nombreAlgo,String texto) {
		super(nombre, texto);
		count++;
		
		this.tipo = tipo;
		
		if (tipo == "Menu") {
			
			Plato plato;
			plato = Plato.buscarPlato(nombreAlgo);
			this.plato = plato;
			
			Queja.QuejasMenu.add(this);
			
		}
		
		if (tipo == "Empleado") {
			
			boolean e;
			e = Empleado.existeEmpleado(nombreAlgo);
			if (e == true) {
				Empleado emp;
				emp = Empleado.busquedaXNombre(nombreAlgo);
				this.empleado = emp;
				Queja.nuevaAmonestacion(emp);
			}
			
			Queja.QuejasEmpleados.add(this);
			
		}
		
		if (tipo == "Sede") {
			
			Restaurante sede;
			sede = Restaurante.buscarSedeXUbicacion(nombreAlgo);
			this.sede = sede;
			
			Queja.QuejasSedes.add(this);
		}
		
		if (tipo == "Otro" || tipo == null) {
			Queja.QuejasOtros.add(this);
		}
		
		Queja.Quejas.add(this);
		
	}
	
	@Override
	public String toString() {
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
	
	 public static void nuevaAmonestacion(Empleado e) {
	    	 e.setCountAmonestaciones();
	    }
	 
	 public static String cantidadAmonestaciones(Empleado empleado) {
			 return "Nombre empleado: " + empleado.getNombre() + " tiene (" + empleado.getCountAmonestaciones() + ")";
	 }
	 
	 public static List<Queja> getQuejas() {
			return Quejas;
		}
	 
	public static List<Queja> getQuejasMenu() {
		return QuejasMenu;
	}
	
	public static List<Queja> getQuejasEmpleados(){
		return QuejasEmpleados;
	}
	
	public static List<Queja> getQuejasSedes(){
		return QuejasSedes;
	}
	
	public static List<Queja> getQuejasOtros(){
		return QuejasOtros;
	}
	
	public static int cantidadQuejas() {
		return count;
	}
	
	public static int cantidadQuejasMenu() {
		return QuejasMenu.size();
	}
	
	public static int cantidadQuejasEmpleados() {
		return QuejasEmpleados.size();
	}
	
	public static int cantidadQuejasSedes() {
		return QuejasSedes.size();
	}
	
	public static int cantidadQuejasOtros() {
		return QuejasOtros.size();
	}
	
}
