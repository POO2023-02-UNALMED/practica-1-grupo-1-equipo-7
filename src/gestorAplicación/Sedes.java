package gestorAplicación;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sedes extends Restaurante {
    private String nombre;
    private String direccion;
    private int capacidad;
    private List<Menu> menuList;
    private List<Empleado> listadoEmpleados= new ArrayList<>();
    private final LocalTime horaCierre=LocalTime.of(6,30,0 );
    private final LocalTime horaApertura=LocalTime.of(20,0,0 );
    private Caja caja;
    private static List<Sedes>sedes= new ArrayList<>();
    
    private Inventario inventario;

    // Constructor
    public Sedes(String nombre, String direccion, int capacidad, Inventario inventario, Caja caja) {
    	this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this. inventario=inventario;
        this.caja=caja;
        sedes.add(this);
        
         
        
    }
    
    // Getter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo "nombre"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo "direccion"
    public String getDireccion() {
        return direccion;
    }

    // Setter para el atributo "direccion"
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter para el atributo "capacidad"
    public int getCapacidad() {
        return capacidad;
    }

    // Setter para el atributo "capacidad"
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Getter para el atributo "menuList"
    public List<Menu> getMenuList() {
        return menuList;
    }

    // Getter para el atributo "empleados"
    public List<Empleado> getEmpleados() {
        return listadoEmpleados;
    }

    // Agregar un menú a la sede
    public void agregarMenu(Menu menu) {
        menuList.add(menu);
    }

    // Eliminar un menú de la sede
    public void eliminarMenu(Menu menu) {
        menuList.remove(menu);
    }

    // Agregar un empleado a la sede
    public void agregarEmpleado(Empleado empleado) {
        listadoEmpleados.add(empleado);
    }

    // Eliminar un empleado de la sede
    public void eliminarEmpleado(Empleado empleado) {
        listadoEmpleados.remove(empleado);
    }

    @Override
    public String toString() {
        return "Nombre de la Sede: " + nombre + "\nDirección: " + direccion + "\nCapacidad: " + capacidad
                + "\nMenús en la Sede: " + menuList.size() + "\nEmpleados en la Sede: " + listadoEmpleados.size();
    }
    

    // Setter para el atributo "horario"
   
    //get inventario 
    public Inventario getInventario() {
    	return this.inventario;
    }
    // Sett Inventario 
    public void  setInventario(Inventario inventario ) {
    	this.inventario=inventario;
    }

	public LocalTime getHoraCierre() {
		return horaCierre;
	}

	public LocalTime getHoraApertura() {
		return horaApertura;
	}
    public static List<Sedes> getLista(){
    	return sedes;
    }
}
