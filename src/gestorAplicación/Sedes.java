package gestorAplicación;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sedes extends Restaurante {
    private String ubicacion;
    private String direccion;
    private int capacidad;
    private List<Menu> menuList;
    private List<Empleado> listadoEmpleados= new ArrayList<>();
    private final LocalTime horaApertura=LocalTime.of(6,30,0 );
    private final LocalTime horaCierre=LocalTime.of(20,0,0 );
    private Caja caja;
    private static List<Sedes>sedes= new ArrayList<>();
    
    private Inventario inventario;


    public Sedes(String ubicacion, String direccion, int capacidad, Inventario inventario, Caja caja) {
    	this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this. inventario=inventario;
        this.caja=caja;
        sedes.add(this);
        
         
        
    }
    
    public Caja getCaja() {
    	return caja;
    }
    
    public void setCaja(Caja caja) {
    	this.caja = caja;
    }
    

    public String getUbicacion() {
        return ubicacion;
    }

 
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getCapacidad() {
        return capacidad;
    }


    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public List<Menu> getMenuList() {
        return menuList;
    }

    public List<Empleado> getEmpleados() {
        return listadoEmpleados;
    }


    public void agregarMenu(Menu menu) {
        menuList.add(menu);
    }


    public void eliminarMenu(Menu menu) {
        menuList.remove(menu);
    }

    public void agregarEmpleado(Empleado empleado) {
        listadoEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        listadoEmpleados.remove(empleado);
    }

    @Override
    public String toString() {
        return "Nombre de la Sede: " + ubicacion + "\nDirección: " + direccion + "\nCapacidad: " + capacidad
                + "\nMenús en la Sede: " + menuList.size() + "\nEmpleados en la Sede: " + listadoEmpleados.size();
    }
    


    public Inventario getInventario() {
    	return this.inventario;
    }
 
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
