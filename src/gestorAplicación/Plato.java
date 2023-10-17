package gestorAplicación;
import java.util.List;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;



public class Plato {
	private String nombre;
	private  final List<Item> ingredientes;
	private int precio;
	private boolean disponibilidad=true;// esto es importante para mi funcionalidad :)
	
	
	//plato asociado a ingredientes 
	private  static Map <Plato, List<Item>> platos=new HashMap<>();
	
	//Constructor 
	public Plato(String nombre, List<Item> ingredientes, int precio) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		platos.put(this, ingredientes);
		this.precio=precio;
		
		
	}
    static{
        ArrayList<Item> ingredientesTacos = new ArrayList<>();
        ingredientesTacos.add(Item.buscarItem("Tortilla"));
        ingredientesTacos.add(Item.buscarItem("Carne"));
        ingredientesTacos.add(Item.buscarItem("Cebolla"));
        ingredientesTacos.add(Item.buscarItem("Cilantro"));
        ArrayList<Item> ingredientesTostadas = new ArrayList<>();
        ingredientesTostadas.add(Item.buscarItem("Tostada"));
        ingredientesTostadas.add(Item.buscarItem("Carne"));
        ingredientesTostadas.add(Item.buscarItem("Cebolla"));
        ingredientesTostadas.add(Item.buscarItem("Cilantro"));
        ArrayList<Item> ingredientesQuesadillas = new ArrayList<>();
        ingredientesQuesadillas.add(Item.buscarItem("Tortilla"));
        ingredientesQuesadillas.add(Item.buscarItem("Queso"));
        ArrayList<Item> ingredientesSopes = new ArrayList<>();
        ingredientesSopes.add(Item.buscarItem("Tortilla"));
        ingredientesSopes.add(Item.buscarItem("Frijoles"));
        ingredientesSopes.add(Item.buscarItem("Carne"));
        ingredientesSopes.add(Item.buscarItem("Cebolla"));
        ingredientesSopes.add(Item.buscarItem("Cilantro"));
        ArrayList<Item> ingredientesTamales = new ArrayList<>();
        ingredientesTamales.add(Item.buscarItem("Masa"));
        ingredientesTamales.add(Item.buscarItem("Carne"));
        ArrayList<Item> ingredientesEnchiladas = new ArrayList<>();
        ingredientesEnchiladas.add(Item.buscarItem("Tortilla"));
        ingredientesEnchiladas.add(Item.buscarItem("Salsa"));
        ingredientesEnchiladas.add(Item.buscarItem("Queso"));
        ingredientesEnchiladas.add(Item.buscarItem("Crema"));
        ingredientesEnchiladas.add(Item.buscarItem("Cebolla"));
        ArrayList<Item> ingredientesPozol = new ArrayList<>();
        ingredientesPozol.add(Item.buscarItem("Maiz"));
        ingredientesPozol.add(Item.buscarItem("Carne"));
        ingredientesPozol.add(Item.buscarItem("Cebolla"));
        ingredientesPozol.add(Item.buscarItem("Cilantro"));
     // le agregué los precios a cada plato, se puede cambiar esto:)
        Plato tacos = new Plato("Tacos", ingredientesTacos,2000);
       Plato tostadas =new Plato("Tostadas", ingredientesTostadas,2000);
        Plato quesadilla=new Plato("Quesadillas", ingredientesQuesadillas,5000);
        Plato sopes= new Plato("Sopes", ingredientesSopes,6000);
        Plato tamales= new Plato("Tamales", ingredientesTamales,7000);
        Plato enchilada=new Plato("Enchiladas", ingredientesEnchiladas,8000);
        Plato pozol=new Plato("Pozol", ingredientesPozol,4000);
        
    }
	 // Getter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo "nombre"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
    

    public boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// Getter para el atributo "ingredientes" Arreglar
    public List<String> getIngredientes() {
        List<String> ingredientes = new ArrayList<>();
        for (Item ingrediente : this.ingredientes) {
            ingredientes.add(ingrediente.getNombre());
        }
        return ingredientes;
        
    }
    public void mostrarInformacionDetallada() {
        System.out.println("Nombre del Plato: " + nombre);
        System.out.println("Ingredientes:");
        for (Item ingrediente : ingredientes) {
            System.out.println("- " + ingrediente.getNombre());
        }
        System.out.println("Precio Total: " + this.precio);// acá hice un cambio del  metodo al this.precio :)
        
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

    public static int getIngredientesSimilares(Plato plato1, Plato plato2){
        int ingredientesSimilares = 0;
        for(String ingrediente1 : plato1.getIngredientes()){
            for(String ingrediente2 : plato2.getIngredientes()){
                if(ingrediente1.equals(ingrediente2)){
                    ingredientesSimilares++;
                }
            }
        }
        return ingredientesSimilares;
    }
    
    // con esto miramíamos la disponibilidad del plato, no sé si va acá o va en la funcionalidad, si algo lo paso al implementarla :)
    public void   disponibilidadPlato() {
    	for(Item i:ingredientes ) {
    		if (i.getInventario().haySuficienteStock(i, 1)==false) {
    			this.disponibilidad=false;
    			
    		}
    	}
    	
    	
    	
    }
    
    
  

}

	
	


