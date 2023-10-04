package clases;
import java.util.List;
import java.util.ArrayList;


public class Inventario {
	private String tipo;
	
	
	
	private static  int cantidadTotal;
	private Sedes sede;
	public Inventario(String tipo, String numeroDeSerie, Sedes sede) {
        this.tipo = tipo;
        
        this.sede = sede;
    }

    // Getter para el atributo "tipo"
    public String getTipo() {
        return tipo;
    }

    // Setter para el atributo "tipo"
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    // Getter para el atributo "cantidadTotal" (static)
    public static int getCantidadTotal() {
        return cantidadTotal;
    }

    // Setter para el atributo "cantidadTotal" (static)
    public static void setCantidadTotal(int cantidadTotal) {
        Inventario.cantidadTotal = cantidadTotal;
    }

    // Getter para el atributo "sede"
    public Sedes getSede() {
        return sede;
    }

    // Setter para el atributo "sede"
    public void setSede(Sedes sede) {
        this.sede = sede;
    }
    public void añadirObjeto(Objeto, objeto) {
    
    	
    }
    public void RetirarDeInventario() {
    	
}

	
	



