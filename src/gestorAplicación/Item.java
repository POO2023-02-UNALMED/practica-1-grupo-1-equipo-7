package gestorAplicación;
import java.util.List;




import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.Serializable;
import java.text.ParseException;



public class Item implements Serializable {
	
	    private String nombre;
	    private int cantidad;
	    private double precio;
	    private  String numeroSerial;
	    private static int totalItems;
	    private Date fechaVencimiento;
	    private static ArrayList<Item>listadoItems= new ArrayList<>();
	    private Inventario inventario;
	    
	     //será un listado de los productos vencidos 
	    
	     //pendiente usar el tipo y el numero de serial en el constructor ***************************
	    private Tipo tipo;

	     
	    public Item(String nombre, int cantidad, double precio,String fechaVencimiento, Inventario inventario ) {
	        this.nombre = nombre;
	        this.cantidad = cantidad;
	        this.precio = precio;
	        this.inventario=inventario;
	    
	         //esto es una prueba, posiblemente lo quitaré.
	        try {
	            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	            this.fechaVencimiento = formato.parse(fechaVencimiento);
	        } catch (ParseException e) {
	        System.err.println("Error al analizar la fecha de vencimiento: " + e.getMessage());
	        this.fechaVencimiento = null;  //Opcional: asignar un valor predeterminado en caso de error
	        }

			

		
	        
	        
	        //agregar el objeto al listado
	        listadoItems.add(this);
	        
	       //actualizar la cantidad de items 
	        totalItems+=cantidad;
	        
	         //añadir estos items a inventario
	        inventario.añadirItems(this, cantidad);
	        inventario.añadirAListadoItems(this);
	        
	    }
	    


	     //Getter para el atributo "nombre"
	    public String getNombre() {
	        return nombre;
	    }

	     //Setter para el atributo "nombre"
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    

	    public Inventario getInventario() {
			return inventario;
		}

		public void setInventario(Inventario inventario) {
			this.inventario = inventario;
		}

		 //Getter para el atributo "cantidad"
	    public int getCantidad() {
	        return cantidad;
	    }

	     //Setter para el atributo "cantidad"
	    public void setCantidad(int cantidad) {
	        this.cantidad = cantidad;
	    }

	     //Getter para el atributo "precio"
	    public double getPrecio() {
	        return precio;
	    }

	     //Setter para el atributo "precio"
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
	     //Método getter para listadoItems
	    public static List<Item> getListadoItems() {
	        return listadoItems;
	    }

	     //Método setter para listadoItems
	    //public static void setListadoItems(List<Item> nuevoListadoItems) {
	       // listadoItems = nuevoListadoItems;}
	   
	        
	     //Método para calcular el valor total del item
	    public double calcularValorTotal() {
	        return cantidad * precio;
	    }


		 //Método para buscar un item por su nombre
		public static Item buscarItem(String nombre) {
			for (Item item : listadoItems) {
			    if (item.getNombre().equals(nombre)) {
			        return item;
			    }
			}
			        return null;
		}
		
		
		 //Definir si un producto está vencido o no.
		public boolean estaVencido() {
	        Date fechaActual = new Date();  //Obtener la fecha actual

	        if (this.fechaVencimiento != null && this.fechaVencimiento.before(fechaActual)) {
	            return true;  //El producto está vencido
	        } else {
	            
	        	
	        	return false;  //El producto no está vencido o no tiene fecha de vencimiento
	        }
	    }
		
		
}
	    
	
	    
	    
	

