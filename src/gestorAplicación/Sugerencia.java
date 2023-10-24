package gestorAplicación;
import java.util.*;

public class Sugerencia extends ServiciosClientes{

	protected String tipo;
	private static int count;
	protected static List<Sugerencia> SugerenciasMenu = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasEmpleados = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasSedes = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasOtros = new ArrayList<>();
	
	
	
	public Sugerencia() {
		this(null, null);
	}
	
	public Sugerencia(String tipe, String texto) {
		super(texto);
		count++;
		
		this.tipo = tipe;
		
		if (tipe == "Menu") {
			Sugerencia.SugerenciasMenu.add(this);
		}
		
		if (tipe == "Empleado") {
			Sugerencia.SugerenciasEmpleados.add(this);
		}
		
		if (tipe == "Sede") {
			Sugerencia.SugerenciasSedes.add(this);
		}
		
		if (tipe == "Otro" || tipe == null) {
			Sugerencia.SugerenciasOtros.add(this);
		}
		
	}
	
	@Override
	public String toString() {
		return super.cliente.getNombre() + " hizo la siguiente sugerencia: " + "\n" + super.getTexto();
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipe) {
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
