package gestorAplicación;
import java.util.*;



public class Reseña extends ServiciosClientes{

	protected int calificacion;
	
	private static int countCalificaciones;	
	private static int count;
	
	public Reseña(String nombre, String texto, int calificacion) {
		super(nombre,texto);
		this.calificacion = calificacion;
		count++;
		countCalificaciones = countCalificaciones + calificacion;
		funcionalidades.AtencionCliente.Recopilatorio.add(this);
		
		
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
		return funcionalidades.AtencionCliente.Recopilatorio;
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
	
	public static void main (String[] arg) {
		for(Reseña rsñ: funcionalidades.AtencionCliente.Recopilatorio) {
			System.out.println(rsñ);
			System.out.println("\n");
		}
		
		String r = "Juan Lopez";
		System.out.println(Empleado.existeEmpleado(r));
		
		Scanner rEQ=new Scanner(System.in);
		String reEQ;
		reEQ=rEQ.nextLine();
		
		r = reEQ;
		
		System.out.println(r);
		
		String s = "Tacos";
		String t = "Hamburguesa";
		
		System.out.println(Plato.existePlato(s) + "\n" + Plato.existePlato(t));
	}
	
	
}
