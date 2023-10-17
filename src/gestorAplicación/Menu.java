package gestorAplicación;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nombre;
    private double precio;
    private boolean disponible;
    private List<String> platos;

    // Constructor
    public Menu(String nombre, double precio, boolean disponible, List<String> platos) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
        this.platos = platos;
    }

    // Getter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo "nombre"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo "precio"
    public double getPrecio() {
        return precio;
    }

    // Setter para el atributo "precio"
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter para el atributo "disponible"
    public boolean isDisponible() {
        return disponible;
    }

    // Setter para el atributo "disponible"
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Getter para el atributo "platos"
    public List<String> getPlatos() {
        return platos;
    }

    // Setter para el atributo "platos"
    public void setPlatos(List<String> platos) {
        this.platos = platos;
    }

    // Agregar un plato al menú
    public void agregarPlato(String plato) {
        platos.add(plato);
    }

    // Eliminar un plato del menú
    public void eliminarPlato(String plato) {
        platos.remove(plato);
    }

    // Calcular el costo total del menú
    public double calcularCostoTotal() {
        return precio * platos.size();
    }

    @Override
    public String toString() {
        return "Nombre del Menú: " + nombre + "\nPrecio: " + precio + "\nDisponible: " + disponible
                + "\nPlatos en el Menú: " + platos;
    }
}
