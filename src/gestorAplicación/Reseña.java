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
		Cliente Cuatro = new Cliente("Carol Diaz", 25789635);
		Cliente Cinco = new Cliente("Santiago Lopez", 78945625);
		Cliente Seis = new Cliente("Estaban Tabares", 12578963);
		Cliente Siete = new Cliente("Elizabeth Bennet", 68721493);
		
		new Reseña(Anonimo, "Gran lugar para pasar el tiempo en familia, muy buena la atención", 4, 12345);
		new Reseña(Uno, "Me gustaron las hamburguesas", 5, 54321);
		new Reseña(Dos, "La comida estaba fria y tardaron mucho en atendernos, mal ahí", 2, 56789);
		new Reseña(Tres, "Muy buen servicio a domicilio, todo llego a tiempo y recien hecho", 5, 98765);
		new Reseña(Anonimo, "Que fea la sede de Bello, casi nos roban al salir", 1, 14785);
		new Reseña(Anonimo, "Mi mujer se enfermo despues de comer en una de sus sedes", 1, 85296);
		new Reseña(Cuatro, "Excelente atención", 5, 69852);
		new Reseña(Cinco, "Muy buenas porciones y de sabor delicioso", 5, 96322);
		new Reseña(Seis, "La atención en el local de las Americas fue muy buena, hicimos un evento familiar y todo salio perfecto", 5, 75324);
		new Reseña(Siete, "Las papas estaban duras pero lo demas muy rico", 3, 85247);
		
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
	
	public void MostrarReseñas(Reseña reseña) {
		
		if (super.cliente.getNombre() == "Anonimo") {
			System.out.println ("Anonimo." + "\n"  + 
					"Calificacion:" + this.getCalificacion() + "\n" + 
					"'" + this.getReseña() + "'");
		}
		
		System.out.println("Nombre: " + super.cliente.getNombre() + "\n" + 
				"Calificacion: " + this.getCalificacion() + " estrellas." + "\n" + 
				"'" + this.getReseña() + "'");
	}
	
	public void ImprimirRepositorio() {
		for (int i=0;i<Reseña.Recopilatorio.size();i++) {
			MostrarReseñas(Recopilatorio.get(i));
		}
	}
	
}
