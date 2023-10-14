package clases;
import java.util.List;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Item {
	
	    private String nombre;
	    private int cantidad;
	    private double precio;
	    private  String numeroSerial;
	    private static int totalItems;
	    private Date fechaVencimiento;
	    private static List<Item>listadoItems= new ArrayList<>();
	    // será un listado de los productos vencidos 
	    
	    
	    private Tipo tipo;

	    // Constructor
	    public Item(String nombre, int cantidad, double precio,String fechaVencimiento) {
	        this.nombre = nombre;
	        this.cantidad = cantidad;
	        this.precio = precio;	        
	        
	        // esto es una prueba, posiblemente lo quitaré.
	        try {
	            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	            this.fechaVencimiento = formato.parse(fechaVencimiento);
	        } catch (ParseException e) {
	        System.err.println("Error al analizar la fecha de vencimiento: " + e.getMessage());
	        this.fechaVencimiento = null; // Opcional: asignar un valor predeterminado en caso de error
	        }
	        
	        
	       // agregar el objeto al listado
	        listadoItems.add(this);
	        
	      // actualizar la cantidad de items 
	        totalItems+=cantidad;
	        
	    }

		static{
			new Item("Tortilla", 100, 0.50,"01/01/2020");
	        new Item("Carne", 100, 1.00,"01/01/2020");
	        new Item("Cebolla", 100, 0.25,"01/01/2020");
	        new Item("Cilantro", 100, 0.25,"01/01/2020");
	        new Item("Tostada", 100, 0.50,"01/01/2020");
	        new Item("Queso", 100, 0.50,"01/01/2020");
	        new Item("Frijoles", 100, 0.50,"01/01/2020");
	        new Item("Masa", 100, 0.50,"01/01/2020");
	        new Item("Salsa", 100, 0.50,"01/01/2020");
	        new Item("Crema", 100, 0.50,"01/01/2020");
	        new Item("Maiz", 100, 0.50,"01/01/2020");
				        
		}

			
		

	

	    // Getter para el atributo "nombre"
	    public String getNombre() {
	        return nombre;
	    }

	    // Setter para el atributo "nombre"
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    // Getter para el atributo "cantidad"
	    public int getCantidad() {
	        return cantidad;
	    }

	    // Setter para el atributo "cantidad"
	    public void setCantidad(int cantidad) {
	        this.cantidad = cantidad;
	    }

	    // Getter para el atributo "precio"
	    public double getPrecio() {
	        return precio;
	    }

	    // Setter para el atributo "precio"
	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    

	    @Override
	    public String toString() {
	        return "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio;
	    }
	    public static int totalItems() {
	    	return totalItems;
	    	
	    }
	    public Date getFechaVencimiento() {
	    	return this.fechaVencimiento;
	    }
	    public void setFechaVencimiento(Date fecha) {
	    	this.fechaVencimiento=fecha;
	    	
	    }
	    // Método getter para listadoItems
	    public static List<Item> getListadoItems() {
	        return listadoItems;
	    }

	    // Método setter para listadoItems
	    public static void setListadoItems(List<Item> nuevoListadoItems) {
	        listadoItems = nuevoListadoItems;}
	   
	        
	    // Método para calcular el valor total del item
	    public double calcularValorTotal() {
	        return cantidad * precio;
	    }


		// Método para buscar un item por su nombre
		public static Item buscarItem(String nombre) {
			for (Item item : listadoItems) {
			    if (item.getNombre().equals(nombre)) {
			        return item;
			    }
			}
			        return null;
		}
		
}
	    
	
	    
	    
	

