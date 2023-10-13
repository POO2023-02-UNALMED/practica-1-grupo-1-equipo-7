package clases;

import java.util.Map;
import java.util.HashMap;




public class Provedor {
    private String nombre;
    private Map<Item, Double> catalogo; // Mapa que almacena los productos y sus precios

    public Provedor(String nombre) {
        this.nombre = nombre;
        this.catalogo = new HashMap<>();
    }
    
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    	
    }

    // Agregar un producto al catálogo del proveedor
    public void agregarProductoAlCatalogo(Item producto, double precio) {
        catalogo.put(producto, precio);
    }

    // Mostrar el catálogo de productos con precios
    public void mostrarCatalogo() {
        System.out.println("Catálogo de productos del proveedor " + nombre + ":");
        for (Map.Entry<Item, Double> entry : catalogo.entrySet()) {
            Item producto = entry.getKey();
            double precio = entry.getValue();
            System.out.println(producto.getNombre() + " - Precio: $" + precio);
        }
    }
    
    public void eliminarProductoDelCatalogo(Item producto) {
        if (catalogo.containsKey(producto)) {
            catalogo.remove(producto);
            System.out.println("Producto " + producto.getNombre() + " eliminado del catálogo.");
        } else {
            System.out.println("El producto no existe en el catálogo del proveedor.");
        }
    }
    public void actualizarPrecioEnCatalogo(Item producto, double nuevoPrecio) {
        if (catalogo.containsKey(producto)) {
            catalogo.put(producto, nuevoPrecio);
            System.out.println("Precio del producto " + producto.getNombre() + " actualizado a $" + nuevoPrecio);
        } else {
            System.out.println("El producto no existe en el catálogo del proveedor.");
        }
    }
    public double buscarPrecioPorNombreEnCatalogo(String nombreProducto) {
        for (Map.Entry<Item, Double> entry : catalogo.entrySet()) {
            Item producto = entry.getKey();
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return entry.getValue();
            }
        }
        return -1; // Retorna -1 si el producto no se encuentra en el catálogo
    }
    public void generarReciboTransaccion(Sedes sede, Item item, int cantidad, int precio) {
        // Lógica para generar un recibo detallado de la transacción
        // Esto podría incluir detalles como la fecha y hora de la transacción, información de contacto del proveedor, etc.
        System.out.println("Recibo de la transacción:");
        System.out.println("Proveedor: " + getNombre());
        System.out.println("Sede: " + sede.getNombre());
        System.out.println("Producto: " + item.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por unidad: $" + precio);
        System.out.println("Total: $" + (precio * cantidad));
        // Agregar más detalles según sea necesario.
    }
   
    
    
    
    //Puede irse a otra clase, si no sirve lo terminaos borrando  Igual para el metodo de arriba 
    public void obtenerResumenTransaccion(Sedes sede, Item item, int cantidad, int precio) {
        System.out.println("Resumen de la transacción:");
        System.out.println("Proveedor: " + getNombre());
        System.out.println("Sede: " + sede.getNombre());
        System.out.println("Producto: " + item.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por unidad: $" + precio);
        System.out.println("Total: $" + (precio * cantidad));
    }
}
