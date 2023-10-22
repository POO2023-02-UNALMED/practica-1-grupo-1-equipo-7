package gestorAplicación;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

//Por si acaso agrege atributos que eran necesarios :D 

public class Empleado extends Persona {
    private int sueldo;
    private String cargo;
    private int codigo;
    private int codigoSede;
    private int countAmonestaciones;
    private static int contadorEmpleados = 0;
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    
    public Empleado(String nombre, String cargo, int sueldo, int codigoSede){
        super(nombre);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.codigo = contadorEmpleados + 1;
        this.codigoSede = codigoSede;
        contadorEmpleados++;
        empleados.add(this);
    }
    
    static{
        new Empleado("Juan Lopez", "Chef", 2000, 1);
        new Empleado("Pedro Sanchez", "Mesero", 1700, 1);
        new Empleado("Maria Ochoa", "Gerente", 3000, 2);
        new Empleado("Jose Correa", "Domiciliario", 1500, 2);
        new Empleado("Alejandra Diaz", "Servicios Varios", 1000, 2);
        new Empleado("Camilo Palacio", "Mesero", 1700, 1);
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    public static ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    
    public static ArrayList<Empleado> getEmpleados(int codigoSede){
        ArrayList<Empleado> empleadosSede = new ArrayList<>();
        for(Empleado empleado : empleados){
            if(empleado.getCodigoSede() == codigoSede){
                empleadosSede.add(empleado);
            }
        }
        return empleadosSede;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public String toString(){
        return super.toString() + "Cargo: " + cargo + " Sueldo: " + sueldo;
    }
    
    public String getCargo() {
    	return cargo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public int getCodigoSede(){
        return codigoSede;
    }
    
    public int getCountAmonestaciones() {
    	return countAmonestaciones;
    }
    public static Empleado buscarEmpleado(int codigo){
        for(Empleado empleado : empleados){
            if(empleado.getCodigo() == codigo){
                return empleado;
            }
        }
        return null;
    }

    public float calcularPropinas(int codigo){
        Empleado empleado = buscarEmpleado(codigo);
        if(empleado == null){
            return 0;
        }
        else{
            int totalPropinas = 0;
            int numeroFacturas = Factura.buscarFacturasPorEmpleado(codigo).size();
            HashMap <Integer, Float> incentivos = Restaurante.getIncentivos();
            ArrayList<Factura> facturas = Factura.buscarFacturasPorEmpleado(codigo);
            if(numeroFacturas <= 10){
                for (Factura factura : facturas){
                    totalPropinas += factura.getTotal() * incentivos.get(10);
                }
            }
            else if(numeroFacturas <= 15 && numeroFacturas > 10){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
            }
            else if(numeroFacturas <= 20 && numeroFacturas > 15){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < 15; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 15; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                }
            }
            else if(numeroFacturas <= 25 && numeroFacturas > 20){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < 15; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 15; i < 20; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                }
                for (int i = 20; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(20);
                }
            }
            else if(numeroFacturas < 30 && numeroFacturas > 25){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < 15; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 15; i < 20; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                }
                for (int i = 20; i < 25; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(20);
                }
                for (int i = 25; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(25);
                }
            }
                else if(numeroFacturas >= 30){
                    for (int i = 0; i < 10; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                    }
                    for (int i = 10; i < 15; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                    }
                    for (int i = 15; i < 20; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                    }
                    for (int i = 20; i < 25; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(20);
                    }
                    for (int i = 25; i < 30; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(25);
                    }
                    for (int i = 30; i < facturas.size(); i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(30);
                    }
                }
            return totalPropinas;
	

        }
    }
    public float calcularPropinas(int codigo, LocalDate fechaInicio, LocalDate fechaFin){
        Empleado empleado = buscarEmpleado(codigo);
        if(empleado == null){
            return 0;
        }
        else{
            int totalPropinas = 0;
            HashMap <Integer, Float> incentivos = Restaurante.getIncentivos();
            ArrayList<Factura> facturas = Factura.buscarFacturasPorFechaycodigo(codigo, fechaInicio.plusDays(-1), fechaFin.plusDays(1));
            int numeroFacturas = facturas.size();
            if(numeroFacturas <= 10){
                for (Factura factura : facturas){
                    totalPropinas += factura.getTotal() * incentivos.get(10);
                }
            }
            else if(numeroFacturas <= 15 && numeroFacturas > 10){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
            }
            else if(numeroFacturas <= 20 && numeroFacturas > 15){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < 15; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 15; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                }
            }
            else if(numeroFacturas <= 25 && numeroFacturas > 20){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < 15; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 15; i < 20; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                }
                for (int i = 20; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(20);
                }
            }
            else if(numeroFacturas < 30 && numeroFacturas > 25){
                for (int i = 0; i < 10; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 10; i < 15; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                }
                for (int i = 15; i < 20; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                }
                for (int i = 20; i < 25; i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(20);
                }
                for (int i = 25; i < facturas.size(); i++){
                    totalPropinas += facturas.get(i).getTotal() * incentivos.get(25);
                }
            }
                else if(numeroFacturas >= 30){
                    for (int i = 0; i < 10; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                    }
                    for (int i = 10; i < 15; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(10);
                    }
                    for (int i = 15; i < 20; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(15);
                    }
                    for (int i = 20; i < 25; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(20);
                    }
                    for (int i = 25; i < 30; i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(25);
                    }
                    for (int i = 30; i < facturas.size(); i++){
                        totalPropinas += facturas.get(i).getTotal() * incentivos.get(30);
                    }
                }
            return totalPropinas;
        }
        } 
}      




