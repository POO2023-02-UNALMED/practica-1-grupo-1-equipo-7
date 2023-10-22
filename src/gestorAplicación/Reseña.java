package gestorAplicación;
import java.util.*;

public class Reseña extends ServiciosClientes{

	protected int calificacion;
	protected static List<Reseña> Recopilatorio = new ArrayList<>();
	protected static int countCalificaciones;	
	private static int count;
	
	public Reseña() {
		this(null,null,0,0);
	}
	
	public Reseña(Cliente cliente, String texto, int calificacion,int codigo) {
		super(cliente,texto,codigo);
		this.calificacion = calificacion;
		count++;
		countCalificaciones = countCalificaciones + calificacion;
		Reseña.Recopilatorio.add(this);
		
	}
	
	public int PromedioCalificitacion() {
		return countCalificaciones/count;
	}
	
	public int getCantidadReseñas() {
		return count;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setCalificiacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public String getReseña() {
		return super.getTexto();
	}
	
	public void setReseña(String texto) {
		super.setTexto(texto);
	}
	
	public List<Reseña> getRecopilatorio(){
		return Recopilatorio;
	}
	
	public String MostrarReseñas() {
		return "Nombre: " + super.cliente.getNombre() + "\n" + "Calificacion: " + 
				this.calificacion + " estrellas." + "\n" + 
				this.getReseña();
	}
	
	
	
}
