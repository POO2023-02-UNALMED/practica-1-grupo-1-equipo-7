package clases;
import java.util.List;
import java.util.ArrayList;
public class Item {
	
	    private String nombre;
	    private int cantidad;
	    private double precio;
	    private  String numeroSerial;
	    private static List <Item>listadoItems=new ArrayList<>();
	    private Tipo tipo;

	    // Constructor
	    public Item(String nombre, int cantidad, double precio,Tipo tipo) {
	        this.nombre = nombre;
	        this.cantidad = cantidad;
	        this.precio = precio;
	        listadoItems.add(this);
	        this.tipo=tipo;
	        
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

	    // Método para calcular el valor total del item
	    public double calcularValorTotal() {
	        return cantidad * precio;
	    }

	    @Override
	    public String toString() {
	        return "Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio;
	    }
	    public static int totalItems() {
	    	return listadoItems.size();
	    }
	    
	}

