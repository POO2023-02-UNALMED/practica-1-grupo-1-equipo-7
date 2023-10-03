package clases;

public class Empleado extends Persona {
    private int sueldo;
    private static float porcentajePropinas = 0.05f;
    private int propinasTotales = 0;
    public Empleado(String nombre, int edad, int sueldo){
        super(nombre, edad);
        this.sueldo = sueldo;
    }
    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public String toString(){
        return super.toString() + " Sueldo: " + sueldo;
    }

	

}
