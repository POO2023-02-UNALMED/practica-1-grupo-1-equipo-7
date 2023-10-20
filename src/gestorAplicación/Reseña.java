package gestorAplicación;
import java.util.*;

public class Reseña {

	protected Cliente cliente;
	protected int calificacion;
	protected String reseña;
	protected static List<Reseña> Recopilatorio = new ArrayList<>();
	protected static int countCalificaciones;	
	private static int count;
	

	
	public Reseña(Cliente cliente, String reseña, int calificacion) {
		this.cliente = cliente;
		this.reseña = reseña;
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getCalificacion() {
		return calificacion;
	}
	
	public void setCalificiacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public String getReseña() {
		return reseña;
	}
	

	
	public List<Reseña> getRecopilatorio(){
		return Recopilatorio;
	}
	
	public String toString() {
		return "Nombre: " + this.cliente.getNombre() + "\n" + "Calificacion: " + 
				this.calificacion + " estrellas." + "\n" + 
				this.reseña;
	}
	
}
