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
	private static ArrayList<Plato> listadoplatos = new ArrayList<>();
	
	//plato asociado a ingredientes 
	private  static Map <Plato, List<Item>> platos=new HashMap<>();
	
	//Constructor 
	public Plato(String nombre, List<Item> ingredientes, int precio) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		platos.put(this, ingredientes);
		this.precio=precio;
		listadoplatos.add(this);
		
		
	}
    /*static{
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
       
        ingredientesEnchiladas.add(Item.buscarItem("Carne"));
        List<Item> ingredientesPozol = new ArrayList<>();
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
        
        ingredientesEnchiladas.add(Item.buscarItem("Queso"));
        
        
    }*/
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
    public List<Item> getIngredientes() {
        return this.ingredientes;
        }
        
        
    
    public void mostrarInformacionDetallada() {
        System.out.println("Nombre del Plato: " + nombre);
        System.out.println("Ingredientes:");
        for (Item ingrediente : ingredientes) {
            System.out.println("- " + ingrediente.getNombre());
        }
        System.out.println("Precio Total: " + this.precio);// acá hice un cambio del  metodo al this.precio :)
        
    }
    

    private String calcularPrecioTotal() {
        double precioTotal = 0;
        for (Item ingrediente : ingredientes) {
            precioTotal += ingrediente.getPrecio();
        }
        return "$" + precioTotal;
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

   /* public static Object[] getIngredientesSimilares(Plato plato1, Plato plato2){
        int ingredientesSimilares = 0;
        ArrayList<String> ingredientes = new ArrayList<>();
        for(String ingrediente1 : plato1.getIngredientes()){
            for(String ingrediente2 : plato2.getIngredientes()){
                if(ingrediente1.equals(ingrediente2) && !ingredientes.contains(ingrediente1)){
                    ingredientes.add(ingrediente1);
                    ingredientesSimilares++;
                }
            }
        }
        return new Object[]{ingredientesSimilares, ingredientes};
    }*/
    
    // con esto miramíamos la disponibilidad del plato, no sé si va acá o va en la funcionalidad, si algo lo paso al implementarla :)+++++++++++++++++++++++++++++++++++++
    public void   disponibilidadPlato() {
    	for(Item i:ingredientes ) {
    		if (i==null){
    			continue;
    		}
    		if (i.getInventario().haySuficienteStock(i, 1)==false) {
    			this.disponibilidad=false;
    			
    		}
    	}
    	
    	
    	
    }
    	
    	
    	
    	
    	
    
    public List<String> IngredientesFaltantes() {
    	
    	List<String> listadoFaltantes = new ArrayList<>();
    	
    	for(Item i :this.ingredientes) {
		
				
				
			
			if (i==null) {
				
				continue;
			}
			
			
			 if(i.getInventario().haySuficienteStock(i, 1)==false) {


				 listadoFaltantes.add(i.getNombre());
			
			
		}
    }
			
			 return listadoFaltantes;	
		
	}
    
    	
    

	public static ArrayList<Plato> getListadoplatos() {
		return listadoplatos;
	}

	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", ingredientes=" + ingredientes + ", precio=" + precio + ", disponibilidad="
				+ disponibilidad + "]";
	}
	


    
    
    
  

}

	
	


