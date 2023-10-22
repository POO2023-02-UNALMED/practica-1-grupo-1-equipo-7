package gestorAplicación;
import java.util.*;


public class Reseña extends ServiciosClientes{

	protected int calificacion;
	protected static List<Reseña> Recopilatorio = new ArrayList<>();
	protected static int countCalificaciones;	
	private static int count;
	
	static{
		Cliente Anonimo = new Cliente("Anonimo", 0);
		Cliente Uno = new Cliente("Julian Vargas", 71628249);
		Cliente Dos = new Cliente("Martha Wayne", 48752698);
		Cliente Tres = new Cliente("Barbara Gordon", 1173149587);
		
		new Reseña(Anonimo, "Gran lugar para pasar el tiempo en familia, muy buena la atención", 4, 12345);
		new Reseña(Uno, "Me gustaron las hamburguesas", 5, 54321);
		new Reseña(Dos, "La comida estaba fria y tardaron mucho en atendernos, mal ahí", 2, 56789);
		new Reseña(Tres, "Muy buen servicio a domicilio, todo llego a tiempo y recien hecho", 5, 98765);
		new Reseña(Anonimo, "Que fea la sede de Bello, casi nos roban al salir", 1, 14785);
		new Reseña(Anonimo, "Mi mujer se enfermo despues de comer en una de sus sedes", 1, 85296);
		
		
	}
	
	public Reseña() {

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
		
		if (super.cliente.getNombre() == "Anonimo") {
			return "Anonimo." + "\n"  + 
					"Calificacion:" + this.getCalificacion() + "\n" + 
					"'" + this.getReseña() + "'";
		}
		
		return "Nombre: " + super.cliente.getNombre() + "\n" + 
				"Calificacion: " + this.getCalificacion() + " estrellas." + "\n" + 
				"'" + this.getReseña() + "'";
	}
	
	
	
}
