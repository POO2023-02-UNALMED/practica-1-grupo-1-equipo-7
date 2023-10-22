package gestorAplicación;
import java.util.*;

public class Sugerencia extends ServiciosClientes{

	private enum Tipos {Menu, Empleado, Sede, Otro};
	protected Tipos tipo;
	private static int count;
	protected static List<Sugerencia> SugerenciasMenu = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasEmpleados = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasSedes = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasOtros = new ArrayList<>();
	
	public Sugerencia() {
		this(null, null, null, 0);
	}
	
	public Sugerencia(Cliente cliente, Tipos tipe, String texto,  int reference) {
		super(cliente, texto, reference);
		count++;
		
		this.tipo = tipe;
		
		if (tipe == Tipos.Menu) {
			Sugerencia.SugerenciasMenu.add(this);
		}
		
		if (tipe == Tipos.Empleado) {
			Sugerencia.SugerenciasEmpleados.add(this);
		}
		
		if (tipe == Tipos.Sede) {
			Sugerencia.SugerenciasSedes.add(this);
		}
		
		if (tipe == Tipos.Otro || tipe == null) {
			Sugerencia.SugerenciasOtros.add(this);
		}
		
	}
	
	public String MostrarSugerencias() {
		return super.cliente.getNombre() + " hizo la siguiente sugerencia: " + "\n" + super.getTexto();
	}
	
	public Tipos getTipo() {
		return this.tipo;
	}
	
	public void setTipo(Tipos tipe) {
		this.tipo = tipe;
	}
	
	public List<Sugerencia> getSugerenciasMenu() {
		return SugerenciasMenu;
	}
	
	public List<Sugerencia> getSugerenciasEmpleados(){
		return SugerenciasEmpleados;
	}
	
	public List<Sugerencia> getSugerenciasSedes(){
		return SugerenciasSedes;
	}
	
	public List<Sugerencia> getSugerenciasOtros(){
		return SugerenciasOtros;
	}
	
	public int cantidadSugerencias() {
		return count;
	}
	
	public int cantidadSugerenciasMenu() {
		return SugerenciasMenu.size();
	}
	
	public int cantidadSugerenciasEmpleados() {
		return SugerenciasEmpleados.size();
	}
	
	public int cantidadSugerenciasSedes() {
		return SugerenciasSedes.size();
	}
	
	public int cantidadSugerenciasOtros() {
		return SugerenciasOtros.size();
	}
	
	
}
