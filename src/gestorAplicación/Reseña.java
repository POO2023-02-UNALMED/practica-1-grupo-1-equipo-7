package gestorAplicación;
import java.util.*;



public class Reseña extends ServiciosClientes{

	protected int calificacion;
	protected static List<Reseña> Recopilatorio = new ArrayList<>();
	private static int countCalificaciones;	
	private static int count;
	
	public Reseña(String nombre, String texto, int calificacion) {
		super(nombre,texto);
		this.calificacion = calificacion;
		count++;
		countCalificaciones = countCalificaciones + calificacion;
		Reseña.Recopilatorio.add(this);
		
		
	}
	
	public int PromedioCalificitacion() {
		return countCalificaciones/count;
	}
	
	public static int getCantidadReseñas() {
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
	
	public static List<Reseña> getRecopilatorio(){
		return Reseña.Recopilatorio;
	}
	
	@Override
	public String toString() {
		
		if (super.cliente.getNombre() == "Anonimo") {
			return "Reseña Numero: " + super.getCodigoReferencia() + "\n" +
					"Anonimo." + "\n"  + 
					"Calificacion:" + this.getCalificacion() + "\n" + 
					"'" + this.getReseña() + "'";
		}
		
		return 	"Reseña Numero: " + super.getCodigoReferencia() + "\n" +
				"Nombre: " + super.cliente.getNombre() + "\n" + 
				"Calificacion: " + this.getCalificacion() + " estrellas." + "\n" + 
				"'" + this.getReseña() + "'";
	}
	
	
	
	
}
