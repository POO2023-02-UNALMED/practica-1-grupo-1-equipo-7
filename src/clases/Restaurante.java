package clases;
import java.util.ArrayList;
import java.util.Date;

public abstract class Restaurante {
	
    private  String nombre;
    private String direccion;
    private  int telefono;
    private Date horario;
    private ArrayList<Platos> menu;
    private ArrayList<Mesa> mesas;
    private ArrayList<Empleado> empleados;
    private ArrayList<Factura> facturas;

    public Restaurante(String nombre, String direccion, int telefono, Date horario, arrayList<Platos> menu, arrayList<Mesa> mesas, arrayList<Empleado> empleados){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.menu = menu;
        this.mesas = mesas;
        this.empleados = empleados;
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

    public arrayList<Platos> getMenu(){
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

    public void setMenu(arrayList<Platos> menu){
        this.menu = menu;
    }

    public void setMesas(arrayList<Mesa> mesas){
        this.mesas = mesas;
    }

    public void setEmpleados(arrayList<Empleado> empleados){
        this.empleados = empleados;
    }

    public void agregarPlato(Platos plato){
        this.menu.add(plato);
    }

    public void agregarMesa(Mesa mesa){
        this.mesas.add(mesa);
    }

    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void eliminarPlato(Platos plato){
        this.menu.remove(plato);
    }

    public void eliminarMesa(Mesa mesa){
        this.mesas.remove(mesa);
    }

    public void eliminarEmpleado(Empleado empleado){
        this.empleados.remove(empleado);
    }

    public void modificarPlato(Platos plato, String nombre, String descripcion, int precio){
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
