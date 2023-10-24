package gestorAplicación;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class Restaurante {

	private String nombre;
	static HashMap<Integer, Float> incentivos = new HashMap<Integer, Float>() {
		{
			put(10, 0.05f);
			put(15, 0.06f);
			put(20, 0.065f);
			put(25, 0.07f);
			put(30, 0.072f);
		}
	};
	private String ubicacion;
	private String direccion;
	private int telefono;
	private Date horario;
	private Inventario inventario;
	private Caja caja;
	private ArrayList<Plato> menu;
	private ArrayList<Mesa> mesas;
	private Mesa[] mesa;
	private static ArrayList<Restaurante> sedes = new ArrayList<Restaurante>();
	private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private static HashMap<Integer, String> facturas;
	private int codigoSede;
	private ArrayList<String> disponibilidad;
	private static int contadorSedes = 0;

	//No quitar
	static {
		ArrayList<Plato> menu1 = new ArrayList<Plato>();
		for (Plato platos : Plato.getPlatos().keySet()) {
            menu1.add(platos);
		}
        ArrayList<Plato> menu2 = new ArrayList<Plato>();
    	for (Plato platosmenu2 : Plato.getPlatos().keySet()) {
            menu2.add(platosmenu2);
    	}
    	ArrayList<Plato> menu3 = new ArrayList<Plato>();
    	for (Plato platosmenu3 : Plato.getPlatos().keySet()) {
            menu3.add(platosmenu3);
    	}
    	ArrayList<Plato> menu4 = new ArrayList<Plato>();
    	for (Plato platosmenu4 : Plato.getPlatos().keySet()) {
            menu4.add(platosmenu4);
    	}
	
		
		new Restaurante("La Casa de Toño", "Sede: Las Americas", "Calle 1", new Inventario(), new Caja(), 1234567,
				new Date(),  menu4, new ArrayList<Mesa>());
		new Restaurante("La Casa de Toño", "Sede: Envigado", "Calle 2", new Inventario(), new Caja(), 1234567,
				new Date(), menu3, new ArrayList<Mesa>());
		new Restaurante("La Casa de Toño", "Sede: Sandiego", "Calle 3", new Inventario(), new Caja(), 1234567,
				new Date(), menu2, new ArrayList<Mesa>());
		new Restaurante("La Casa de Toño", "Sede: Belen", "Calle 4", new Inventario(), new Caja(), 1234567, new Date(), menu1, new ArrayList<Mesa>());
		

	}

	public Restaurante(String nombre, String ubicacion, String direccion, Inventario inventario, Caja caja,
			int telefono, Date horario, ArrayList<Plato> menu, ArrayList<Mesa> mesas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.horario = horario;
		this.menu = menu;
		this.mesas = mesas;
		this.inventario = inventario;
		this.caja = caja;
		this.codigoSede = contadorSedes++;
		sedes.add(this);
		this.disponibilidad = new ArrayList<>(Arrays.asList("2023-10-25 14:00 PM", "2023-10-25 18:00 PM",
				"2023-10-26 12:00 PM", "2023-10-30 11:00 AM"));
	}

	public Restaurante() {

	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicaicion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public Date getHorario() {
		return this.horario;
	}

	public ArrayList<Plato> getMenu() {
		return this.menu;
	}

	public static ArrayList<Plato> getMenu(String sede){
		for(Restaurante restaurante : getSedes()) {
			if(restaurante.getUbicacion() == sede) {
				return restaurante.getMenu();
			}
		}
		return null;
	
	}

	public ArrayList<Mesa> getMesas() {
		return this.mesas;
	}

	public static ArrayList<Restaurante> getSedes() {
		return sedes;
	}

	public void setSedes(ArrayList<Restaurante> sedes) {
		this.sedes = sedes;
	}

	public ArrayList<String> getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(ArrayList<String> disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public void setMenu(ArrayList<Plato> menu) {
		this.menu = menu;
	}

	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void agregarPlato(Plato plato) {
		this.menu.add(plato);
	}

	public void agregarMesa(Mesa mesa) {
		this.mesas.add(mesa);
	}

	public void eliminarPlato(Plato plato) {
		this.menu.remove(plato);
	}

	public void eliminarMesa(Mesa mesa) {
		this.mesas.remove(mesa);
	}

	public void eliminarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}
// El de la clase plato revisar esto
	// public void modificarPlato(Plato plato, String nombre, String descripcion,
	// int precio){
	// plato.setNombre(nombre);
	// plato.setDescripcion(descripcion);
	// plato.setPrecio(precio);
	// }

	public HashMap<Integer, String> getFacturas() {
		return facturas;
	}

	public void agregarFactura(Factura factura) {
		facturas.put(factura.getCodigo(), this.nombre);
	}

	public static HashMap<Integer, Float> getIncentivos() {
		return incentivos;
	}

	public static void setIncentivos(HashMap<Integer, Float> incentivos) {
		Restaurante.incentivos = incentivos;
	}

	public int getCodigoSede() {
		return codigoSede;
	}

	public static Restaurante buscarSede(int codigoSede) {
		for (Restaurante sede : sedes) {
			if (sede.getCodigoSede() == codigoSede) {
				return sede;
			}
		}
		return null;
	}

	public static Restaurante buscarSedeXUbicacion(String ubicacion) {
		for (Restaurante sede : sedes) {
			if (sede.getUbicacion() == ubicacion) {
				return sede;
			}
		}
		return null;
	}

	public float calcularPropinasPorSede(int codigoSede) {
		Restaurante sede = buscarSede(codigoSede);
		if (sede == null) {
			return 0;
		} else {
			int totalPropinas = 0;
			ArrayList<Empleado> empleados = Empleado.getEmpleados(codigoSede);
			for (Empleado empleado : empleados) {
				totalPropinas += empleado.calcularPropinas(empleado.getCodigo());
			}
			return totalPropinas;
		}

	}

	public static ArrayList<Restaurante> horariosDisponibles(String fechaDeseada) {

		ArrayList<Restaurante> restaurantesDisponible = new ArrayList<Restaurante>();

		for (Restaurante sede : sedes) {
			for (String disponibilidad : sede.disponibilidad) {
				if (disponibilidad == fechaDeseada) {
					restaurantesDisponible.add(sede);
				}
			}
		}
		return restaurantesDisponible;
	}

	public static ArrayList<Restaurante> sedesDisponibles(String miHorario, String miMesa) {

		ArrayList<Mesa> mesasEncontradas = Mesa.mesasDisponibles(miMesa);
		ArrayList<Restaurante> horarioEncontrados = Restaurante.horariosDisponibles(miHorario);
		ArrayList<Restaurante> sedesDisponibles = new ArrayList<Restaurante>();

		for (Restaurante restaurante : horarioEncontrados) {
			for (Mesa mesa : mesasEncontradas) {
				if (mesa.getUbicacion() == restaurante.ubicacion) {
					sedesDisponibles.add(restaurante);
				}
			}
		}
		return sedesDisponibles;

	}

	public Inventario getInventario() {
		return this.inventario;
		
	}


}