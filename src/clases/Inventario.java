package clases;
import java.util.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;



public class Inventario  {
	
	
	
	private Map <Item,Integer > listadoItems= new HashMap<>();
	private List<Item>listadoVencidos=new ArrayList<>();
	private static  int cantidadTotal;
	
	

	
	
	
//	constructor 
	public Inventario(  Item item) {
       
     // Añadir diccionario, con su valor y clave si la clave se repite, el valor aumenta en uno
        
        int valorActual = listadoItems.get(item);
        if (!listadoItems.containsKey(item)) {
            listadoItems.put(item, 0);
        } else {
            
            listadoItems.put(item, valorActual +=item.getCantidad());}
        cantidadTotal++;
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
        if (!listadoItems.containsKey(item)) {
            // Si el item no existe en el diccionario, simplemente establece la cantidad especificada.
            listadoItems.put(item, cantidad);
        } else {
            // Si el item ya existe en el diccionario, suma la cantidad especificada a la cantidad actual.
            int cantidadActual = listadoItems.get(item);
            listadoItems.put(item, cantidadActual + cantidad);
        }
    }
    	
    	
    
    
    	
    // retirar items del inventario 
    public void retirarItems(Item item, int cantidad) {
        if (listadoItems.containsKey(item)) {
            int cantidadActual = listadoItems.get(item);
            if (cantidadActual >= cantidad) {
                listadoItems.put(item, cantidadActual - cantidad);
                cantidadTotal -= cantidad; // Actualizar la cantidad total en el inventario
                
            } else {
                // Manejar el caso en el que intentas retirar más de lo que hay disponible.
                System.out.println("No hay suficientes " + item.getNombre() + " en el inventario.");
            }
        }
    }
    public void mostrarInventario(Sedes sede) {
    	System.out.print("inventario de "+ sede.getDireccion());
    	
         for (Map.Entry<Item, Integer> entry : sede.getInventario().listadoItems.entrySet()) {
             String  clave = entry.getKey().getNombre();
             Integer valor = entry.getValue();
             System.out.println(clave + ": " + valor);
         }
     }
    public void añadirProductosVencidos(Date fecha ) {
    	
    	
    	
    	for (Item i:Item.getListadoItems()) {
    		Date fechaVencimiento=i.getFechaVencimiento();
    		if (fechaVencimiento.compareTo(fecha)<0) {
    			listadoVencidos.add(i);
    			
    		}
    		
    		
    	}
    	}
    public  void imprimirProductosVencidos() {
        Map<String, Integer> productoCantidadMap = new HashMap<>();

        // Iterar sobre la lista de productos vencidos
        for (Item producto : this.listadoVencidos) {
            String nombre = producto.getNombre();
            Integer cantidad = producto.getCantidad();
            Integer cantidadActual=productoCantidadMap.get(nombre);

            // Si el producto ya existe en el mapa, sumar la cantidad
            if (productoCantidadMap.containsKey(nombre)) {
            	productoCantidadMap.put(nombre,cantidad+cantidadActual);
                
            }
            else {productoCantidadMap.put(nombre,cantidadActual);
            	
            }

            
        }

        // Imprimir los productos vencidos y la suma de cantidades
        for (Map.Entry<String, Integer> entry : productoCantidadMap.entrySet()) {
            String nombreProducto = entry.getKey();
            int cantidadTotal = entry.getValue();

            System.out.println(nombreProducto + ": " + cantidadTotal);
        }
    }
    public void retirarItemsVencidos() {
    	for (Item i:listadoVencidos) {
    		this.retirarItems(i, i.getCantidad());
    		
    	}
    }
    
    
    }
    	
    	
    
 
    
    



	
	



