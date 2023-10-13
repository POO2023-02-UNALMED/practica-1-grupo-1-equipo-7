package clases;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;



public class Plato {
	private String nombre;
	private  final List<Item> ingredientes;
	
	//plato asociado a ingredientes 
	private  static Map <Plato, List<Item>> platos=new HashMap<>();
	
	//Constructor 
	public Plato(String nombre, List<Item> ingredientes) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		platos.put(this, ingredientes);
		
		
	}
    static{
        new Plato("Tacos", new ArrayList<Item>());
        new Plato("Tostadas", new ArrayList<Item>());
        new Plato("Quesadillas", new ArrayList<Item>());
        new Plato("Sopes", new ArrayList<Item>());
        new Plato("Tamales", new ArrayList<Item>());
        new Plato("Enchiladas", new ArrayList<Item>());
        new Plato("Pozol", new ArrayList<Item>());
    }
	 // Getter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo "nombre"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo "ingredientes"
    public List<Item> getIngredientes() {
        return ingredientes;
    }
    public void mostrarInformacionDetallada() {
        System.out.println("Nombre del Plato: " + nombre);
        System.out.println("Ingredientes:");
        for (Item ingrediente : ingredientes) {
            System.out.println("- " + ingrediente.getNombre());
        }
        System.out.println("Precio Total: " + calcularPrecioTotal());
        
    }
    

    // Getter para el atributo "platos"
    public static Map<Plato, List<Item>> getPlatos() {
        return platos;
    }

    public static Plato buscarPlato(String nombre){
        for(Plato plato : platos.keySet()){
            if(plato.getNombre().equals(nombre)){
                return plato;
            }
        }
        return null;
    }

    public static String getNombrePlato(Plato plato){
        return plato.getNombre();
    }

}

	
	


