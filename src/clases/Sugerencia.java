package clases;
import java.util.*;

public class Sugerencia {
	
	protected Cliente cliente;
	protected String sugerencia;
	private enum Tipos {Menu, Empleado, Sede, Otro};
	protected Tipos tipo;
	private static int count;
	protected static List<Sugerencia> SugerenciasMenu = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasEmpleados = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasSedes = new ArrayList<>();
	protected static List<Sugerencia> SugerenciasOtros = new ArrayList<>();
	
	public Sugerencia(Cliente cliente, Tipos tipe, String texto) {
		this.cliente = cliente;
		this.sugerencia = texto;
		count++;
		
		if (tipe == Tipos.Menu) {
			Sugerencia.SugerenciasMenu.add(this);
		}
		
		if (tipe == Tipos.Empleado) {
			Sugerencia.SugerenciasEmpleados.add(this);
		}
		
		if (tipe == Tipos.Sede) {
			Sugerencia.SugerenciasSedes.add(this);
		}
		
		if (tipe == Tipos.Otro) {
			Sugerencia.SugerenciasOtros.add(this);
		}
		
		
	}
	
	public String toString() {
		return this.cliente.getNombre() + " hizo la siguiente sugerencia: " + "\n" + this.sugerencia;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getSugerencia() {
		return sugerencia;
	}
	
	public void setSugerencia(String sugerencia) {
		this.sugerencia = sugerencia;
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
