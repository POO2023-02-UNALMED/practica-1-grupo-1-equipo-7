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

}

	
	


