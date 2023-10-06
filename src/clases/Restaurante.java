package clases;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public abstract class Restaurante {
	
    private static String nombre;
    private String direccion;
    private  int telefono;
    private Date horario;
    private ArrayList<Plato>menu;   
    private ArrayList<Mesa> mesas;
    private static ArrayList<Empleado> empleados;
    private static HashMap<Integer, String> facturas;

    public Restaurante(String nombre, String direccion, int telefono, Date horario, ArrayList<Plato> menu, ArrayList<Mesa> mesas, ArrayList<Empleado> empleados){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.menu = menu;
        this.mesas = mesas;
        this.empleados = empleados;
    }
    public Restaurante() {
    	
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public Date getHorario(){
        return this.horario;
    }

    public arrayList<Plato> getMenu(){
        return this.menu;
    }

    public arrayList<Mesa> getMesas(){
        return this.mesas;
    }

    public arrayList<Empleado> getEmpleados(){
        return this.empleados;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public void setHorario(Date horario){
        this.horario = horario;
    }

    public void setMenu(arrayList<Plato> menu){
        this.menu = menu;
    }

    public void setMesas(arrayList<Mesa> mesas){
        this.mesas = mesas;
    }

    public void setEmpleados(arrayList<Empleado> empleados){
        this.empleados = empleados;
    }

    public void agregarPlato(Plato plato){
        this.menu.add(plato);
    }

    public void agregarMesa(Mesa mesa){
        this.mesas.add(mesa);
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void eliminarPlato(Plato plato){
        this.menu.remove(plato);
    }

    public void eliminarMesa(Mesa mesa){
        this.mesas.remove(mesa);
    }

    public void eliminarEmpleado(Empleado empleado){
        this.empleados.remove(empleado);
    }

    public void modificarPlato(Plato plato, String nombre, String descripcion, int precio){
        plato.setNombre(nombre);
        plato.setDescripcion(descripcion);
        plato.setPrecio(precio);
    }

    public void modificarMesa(Mesa mesa, int capacidad, boolean estado){
        mesa.setCapacidad(capacidad);
        mesa.setEstado(estado);
    }
    
    public ArrayList getFacturas(){
        return this.facturas;       
    }
    
    public void agregarFactura(Factura factura){
        this.facturas.add(factura);
    }

}
