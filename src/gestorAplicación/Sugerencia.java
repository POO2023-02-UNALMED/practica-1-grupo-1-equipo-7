package gestorAplicación;
import java.util.*;

public class Sugerencia extends ServiciosClientes{

	protected String tipo;
	private static int count;
	protected static List<Sugerencia> Sugerencias = new ArrayList<>();
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
		Sugerencia.Sugerencias.add(this);
		
	}
	
	@Override
	public String toString() {
		return "N° referencia: " + this.getCodigoReferencia() + "\nSugerencia tipo: " + this.getTipo() + "\n" + "''" + super.getTexto() + "''";
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipe) {
		this.tipo = tipe;
	}
	
	public static List<Sugerencia> getSugerenciasMenu() {
		return SugerenciasMenu;
	}
	
	public static List<Sugerencia> getSugerenciasEmpleados(){
		return SugerenciasEmpleados;
	}
	
	public static List<Sugerencia> getSugerenciasSedes(){
		return SugerenciasSedes;
	}
	
	public static List<Sugerencia> getSugerenciasOtros(){
		return SugerenciasOtros;
	}
	
	public static List<Sugerencia> getSugerencias(){
		return SugerenciasOtros;
	}
	
	public static int cantidadSugerencias() {
		return count;
	}
	
	public static int cantidadSugerenciasMenu() {
		return SugerenciasMenu.size();
	}
	
	public static int cantidadSugerenciasEmpleados() {
		return SugerenciasEmpleados.size();
	}
	
	public static int cantidadSugerenciasSedes() {
		return SugerenciasSedes.size();
	}
	
	public static int cantidadSugerenciasOtros() {
		return SugerenciasOtros.size();
	}
	
	
}
