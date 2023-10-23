package gestorAplicación;
import java.util.List;



import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;



public class Inventario  {
	
	
	
	private Map <String ,Integer > diccionarioItems= new HashMap<>();
	private List<Item>listadoItems=new ArrayList<>();
	private static  int cantidadTotal;
	private static List<Inventario> inventarios=new ArrayList<>();
	
	

	
	
//	constructor creo que esto será cambiado 
	public Inventario(  ) {
       
     // Añadir diccionario, con su valor y clave si la clave se repite, el valor aumenta en uno
        
      //int valorActual = diccionarioItems.get(item);
       // if (!diccionarioItems.containsKey(item)) {
          //  diccionarioItems.put(item, 0);
       // } else {
            
         //   diccionarioItems.put(item, valorActual +=item.getCantidad());}
        cantidadTotal++;
       // listadoItems.add(item);
        inventarios.add(this);
        
        
        
        }
	
	
        


   

    // Getter para el atributo "cantidadTotal" (static)
    public static int getCantidadTotal() {
        return cantidadTotal;
    }

    // Setter para el atributo "cantidadTotal" (static)
    public static void setCantidadTotal(int cantidadTotal) {
        Inventario.cantidadTotal = cantidadTotal;
    }

  
   
    
    // metodo para agregar items al invetario.
    public void añadirItems(String  item, int cantidad) {
        if (!diccionarioItems.containsKey(item)) {
            // Si el item no existe en el diccionario, simplemente establece la cantidad especificada.
            diccionarioItems.put(item, cantidad);
        } else {
            // Si el item ya existe en el diccionario, suma la cantidad especificada a la cantidad actual.
            int cantidadActual = diccionarioItems.get(item);
            diccionarioItems.put(item, cantidadActual + cantidad);
        }
    }
    public void añadirAListadoItems(Item item ) {
    	this.listadoItems.add(item);
    }
    	
    	
    
    
    	
    // retirar items del inventario creo que voy a cambiar esto
    public void retirarItems(String item, int cantidad) {
        if (diccionarioItems.containsKey(item)) {
            int cantidadActual = diccionarioItems.get(item);
            if (cantidadActual >= cantidad) {
                diccionarioItems.put(item, cantidadActual - cantidad);
                cantidadTotal -= cantidad; // Actualizar la cantidad total en el inventario
                
            } else {
                // Manejar el caso en el que intentas retirar más de lo que hay disponible.
                System.out.println("No hay suficientes " + item + " en el inventario.");
            }
        }
    }
    // mostrar inventario 
    public static  void mostrarInventario(Restaurante restaurante) {
    	System.out.print("inventario de "+ restaurante.getDireccion());
    	
         for (Map.Entry<String, Integer> entry : restaurante.getInventario().diccionarioItems.entrySet()) {
             String  clave = entry.getKey();
             Integer valor = entry.getValue();
             System.out.println(clave + ": " + valor);
         }
     }
   
    
    
    
    // metodo para mostrar los items vencidos 
    public  List <Item> mostrarItemsVencidos() {
    	List <Item>listadoVencidos= new ArrayList<>();
    	for (Item i:listadoItems) {
    		
    		boolean valor=i.estaVencido();
    		if(valor){
    			listadoVencidos.add(i);
    			
    			
    			
    		}
    		
    		
    		
    	}
    	return listadoVencidos;
   
    	
    	
    	
    	
    }
    
    // eliminar items vencidos del inventario 
    public void eliminarVencidos() {
    	List<Item> elementosVencidos = new ArrayList<>();

    	// Iterar sobre los elementos y agregar los vencidos a la lista temporal
    	for (Item i : listadoItems) {
    	    if (i.estaVencido()) {
    	        elementosVencidos.add(i);
    	    }
    	}

    	// Eliminar los elementos vencidos de la lista principal
    	listadoItems.removeAll(elementosVencidos);

    	// Luego, puedes llamar a tu método retirarItems para actualizar las cantidades
    	for (Item i : elementosVencidos) {
    	    this.retirarItems(i.getNombre(), i.getCantidad());
    	}
    	





    }
    
    
    // metodo que verifica si hay suficiente stock
    public boolean haySuficienteStock(Item item, int cantidadDeseada) {
        if (diccionarioItems.containsKey(item)) {
        	if (diccionarioItems.get(item)>cantidadDeseada) {
        		return true;
            
            }
        } 
        return false;
    }
    
    
    // obtener items sin stock 
    public List<String> obtenerItemsSinStock() {
        List<String> itemsSinStock = new ArrayList<>();
        
        for (String i : this.getDiccionarioItems().keySet()) {
            if (this.diccionarioItems.get(i) == 0) {
                itemsSinStock.add(i);
            }
        }
        return itemsSinStock;
    }
    
    
    
    public static  List<Inventario> obtenerInventarios(){
    	return inventarios;
    }







	public Map<String, Integer> getDiccionarioItems() {
		return diccionarioItems;
	}







	public void setDiccionarioItems(Map<String, Integer> diccionarioItems) {
		this.diccionarioItems = diccionarioItems;
	}







	public List<Item> getListadoItems() {
		return listadoItems;
	}







	public void setListadoItems(List<Item> listadoItems) {
		this.listadoItems = listadoItems;
	}
    public void resetearInventario() {
    	this.diccionarioItems= new HashMap<>();// metodo para rsetear el dicionario.
    }
    	
    
   
    }
    
    // al final lo que no me sirva lo borro :)
    
    	
    	
    
 
    
    



	
	



