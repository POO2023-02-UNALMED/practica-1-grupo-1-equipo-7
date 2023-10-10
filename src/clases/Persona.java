package clases;

public abstract class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String toString(){
        return "Nombre: " + nombre + " Edad: " + edad;
    }

}
