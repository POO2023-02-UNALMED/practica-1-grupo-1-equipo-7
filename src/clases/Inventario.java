package clases;
import java.util.List;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;


public class Inventario  {
	
	private static  int cantidadTotal;
	
	private Map <Item,Integer > listadoItems= new HashMap<>();
	
	

	
	
	
//	constructor 
	public Inventario(  Item item) {
       
        cantidadTotal++;
//   Añadir diccionario, con su valor y clave si la clave se repite, el valor aumenta en uno
        
        int valorActual = listadoItems.get(item);
        if (!listadoItems.containsKey(item)) {
            listadoItems.put(item, 0);
        } else {
            
            listadoItems.put(item, valorActual ++);}
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
    public void revisionNivelesStock(String fecha ) {
    	List <Item>listadoVencidos=new ArrayList<>();
    	for (Item objetos: listadoItems.keySet()) {
    		LocalDate fechaVencimiento=LocalDate.parse(objetos.getFechaVencimiento());
    		
    		LocalDate  fechaActual=LocalDate.parse(fecha);
    		if(fechaActual.compareTo(fechaActual)>0) {
    			listadoVencidos.add(objetos);
    			
    			
    		}
    		}
    	
    }
 
    }
    



	
	



