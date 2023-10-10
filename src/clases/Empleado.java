package clases;
import java.util.ArrayList;

public class Empleado extends Persona {
    private int sueldo;
    private static float porcentajePropinas = 0.05f;
    private int codigo;
    private int codigoSede;
    private static int contadorEmpleados = 0;
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    public Empleado(String nombre, int sueldo, int codigoSede){
        super(nombre);
        this.sueldo = sueldo;
        this.codigo = contadorEmpleados + 1;
        this.codigoSede = codigoSede;
        contadorEmpleados++;
        empleados.add(this);
    }
    static{
        new Empleado("Juan", 1000, 1);
        new Empleado("Pedro", 1000, 1);
        new Empleado("Maria", 1000, 2);
        new Empleado("Jose", 1000, 2);
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
    public static float getPorcentajePropinas(){
        return porcentajePropinas;
    }
    public static void setPorcentajePropinas(float porcentajePropinas){
        Empleado.porcentajePropinas = porcentajePropinas;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getCodigoSede(){
        return codigoSede;
    }
    public static Empleado buscarEmpleado(int codigo){
        for(Empleado empleado : empleados){
            if(empleado.getCodigo() == codigo){
                return empleado;
            }
        }
        return null;
    }

	

}
