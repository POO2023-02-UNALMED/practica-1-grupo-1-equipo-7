package clases;
import java.util.List;


import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;



public class Inventario  {
	
	
	
	private Map <Item,Integer > diccionarioItems= new HashMap<>();
	private List<Item>listadoItems=new ArrayList<>();
	private static  int cantidadTotal;
	
	

	public Inventario() {
        
    }
	
	
//	constructor 
	public Inventario(  Item item) {
       
     // Añadir diccionario, con su valor y clave si la clave se repite, el valor aumenta en uno
        
        int valorActual = diccionarioItems.get(item);
        if (!diccionarioItems.containsKey(item)) {
            diccionarioItems.put(item, 0);
        } else {
            
            diccionarioItems.put(item, valorActual +=item.getCantidad());}
        cantidadTotal++;
        listadoItems.add(item);
        
        
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
    public void añadirItems(Item item, int cantidad) {
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
    	
    	
    
    
    	
    // retirar items del inventario 
    public void retirarItems(Item item, int cantidad) {
        if (diccionarioItems.containsKey(item)) {
            int cantidadActual = diccionarioItems.get(item);
            if (cantidadActual >= cantidad) {
                diccionarioItems.put(item, cantidadActual - cantidad);
                cantidadTotal -= cantidad; // Actualizar la cantidad total en el inventario
                
            } else {
                // Manejar el caso en el que intentas retirar más de lo que hay disponible.
                System.out.println("No hay suficientes " + item.getNombre() + " en el inventario.");
            }
        }
    }
    // mostrar inventario 
    public void mostrarInventario(Sedes sede) {
    	System.out.print("inventario de "+ sede.getDireccion());
    	
         for (Map.Entry<Item, Integer> entry : sede.getInventario().diccionarioItems.entrySet()) {
             String  clave = entry.getKey().getNombre();
             Integer valor = entry.getValue();
             System.out.println(clave + ": " + valor);
         }
     }
   
    
    
    
    // metodo para mostrar los items vencidos 
    public  void mostrarItemsVencidos() {
    	List <Item>listadoVencidos= new ArrayList<>();
    	for (Item i:listadoItems) {
    		
    		boolean valor=i.estaVencido();
    		if(valor){
    			listadoVencidos.add(i);
    			
    			
    			
    		}
    		
    		
    		
    	}
    	for (Item p : listadoVencidos) {
    		System.out.print(p.getNombre()+":"+p.getCantidad());
    	}
    	
    	
    	
    	
    }
    
    // eliminar items vencidos del inventario 
    public void eliminarVencidos() {
    	for (Item i: listadoItems) {
    		if (i.estaVencido()) {
    			listadoItems.remove(i);
    			this.retirarItems(i, i.getCantidad());
    		}
    	}
    }
    
    
    // metodo que verifica si hay suficiente stock
    public boolean haySuficienteStock(Item item, int cantidadDeseada) {
        if (diccionarioItems.containsKey(item)) {
            int cantidadDisponible = diccionarioItems.get(item);
            return cantidadDisponible >= cantidadDeseada;
        } else {
            return false; // El artículo no está en el inventario, por lo que no hay suficiente stock.
        }
    }
    
    
    // obtener items sin stock 
    public List<Item> obtenerItemsSinStock() {
        List<Item> itemsSinStock = new ArrayList<>();
        for (Map.Entry<Item, Integer> entry : diccionarioItems.entrySet()) {
            if (entry.getValue() == 0) {
                itemsSinStock.add(entry.getKey());
            }
        }
        return itemsSinStock;
    }
    	
    
   
    }
    
    
    
    	
    	
    
 
    
    



	
	



