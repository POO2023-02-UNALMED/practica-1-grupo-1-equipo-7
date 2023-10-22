package gestorAplicación;
import java.util.*;
import gestorAplicación.*;


public class Reseña extends ServiciosClientes{

	protected int calificacion;
	protected static List<Reseña> Recopilatorio = new ArrayList<>();
	protected static int countCalificaciones;	
	private static int count;
	
	static{
		
		new Reseña("Anonimo", "Gran lugar para pasar el tiempo en familia, muy buena la atención", 4);
		new Reseña("Julian Vargas", "Me gustaron las hamburguesas", 5);
		new Reseña("Marta Wayne", "La comida estaba fria y tardaron mucho en atendernos, mal ahí", 2);
		new Reseña("Barbara Gordon", "Muy buen servicio a domicilio, todo llego a tiempo y recien hecho", 5);
		new Reseña("Anonimo", "Que fea la sede de Bello, casi nos roban al salir", 1);
		new Reseña("Anonimo", "Mi mujer se enfermo despues de comer en una de sus sedes", 1);
		new Reseña("Carol Diaz", "Excelente atención", 5);
		new Reseña("Santiago Lopez", "Muy buenas porciones y de sabor delicioso", 5);
		new Reseña("Esteban Tabares", "La atención en el local de las Americas fue muy buena, hicimos un evento familiar y todo salio perfecto", 5);
		new Reseña("Elizabeth Bennet", "Las papas estaban duras pero lo demas muy rico", 3);
		
	}
	
	public Reseña(String nombre, String texto, int calificacion) {
		super(((String)nombre),texto);
	}
	
	public Reseña(Cliente cliente, String texto, int calificacion) {
		super(cliente,texto);
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
	
	public String toString(Reseña rsñ) {
		
		if (super.cliente.getNombre() == "Anonimo") {
			return "Anonimo." + "\n"  + 
					"Calificacion:" + this.getCalificacion() + "\n" + 
					"'" + this.getReseña() + "'";
		}
		
		return "Nombre: " + super.cliente.getNombre() + "\n" + 
				"Calificacion: " + this.getCalificacion() + " estrellas." + "\n" + 
				"'" + this.getReseña() + "'";
	}
	
	public String ImprimirRepositorio() {
		for (int i=0;i<Reseña.Recopilatorio.size();i++) {
			return toString(Recopilatorio.get(i));
		}
		return null;
	}
	
	
}
