package gestorAplicación;
import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalTime;

public class Reserva {
	private int numeroReserva;
	Map<Mesa ,List<ZonedDateTime>  > reservas = new HashMap<>();// para tener el registro de las fehcas reservasa, cambiar si algo 
	private static int cantidadReservas;
	private ZonedDateTime fechaActualBogota = ZonedDateTime.now(ZoneId.of("America/Bogota"));
	private ZonedDateTime fecha ;
	
	// hay que hacer un metodo para verificar si hay disponibilidad 
	public Reserva(int numeroReserva, ZonedDateTime fecha, Mesa mesa  ) {
		
		this.numeroReserva = numeroReserva;
		
		cantidadReservas ++;
		this.fecha=fecha;
		generarReserva(mesa, fecha);
		
		
	}
	public int getNumeroReserva() {
		return numeroReserva;
	}
	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}
	public Map<Mesa, List<ZonedDateTime>> getReservas() {
		return reservas;
	}
	
	public static int getCantidadReservas() {
		return cantidadReservas;
	}
	public static void setCantidadReservas(int cantidadReservas) {
		Reserva.cantidadReservas = cantidadReservas;
	}
	
	public void generarReserva(Mesa mesa, ZonedDateTime date) {
	    // Obtener la lista de fechas reservadas para la mesa (si existe)
	    List<ZonedDateTime> fechasReservadas = reservas.get(mesa);

	    // Verificar si la lista no existe para esta mesa
	    if (fechasReservadas == null) {
	        fechasReservadas = new ArrayList<>();
	    }

	    // Agregar la nueva fecha a la lista de fechas reservadas
	    fechasReservadas.add(date);

	    // Actualizar la asociación de la mesa con la lista de fechas reservadas
	    reservas.put(mesa, fechasReservadas);

	    // mirar como podemos asociar la fecha a la disponibilidad de la mesa 
	} 
	
	public void VencimientoReserva() {
	    for (Mesa i : reservas.keySet()) {
	        for (ZonedDateTime e:reservas.get(i)) {
	        	if (e.isAfter(fechaActualBogota)) {
	        		reservas.get(i).remove(e);
	        	}    
	        }
	    }	
	}
	// metodo para verificar si ya la reserva está ocupada 
	public boolean  verificarReservas(Mesa mesa ,ZonedDateTime time) {
		for(ZonedDateTime i :reservas.get(mesa)) {
			if (time.isEqual(i)) {
				return false;// si retorna false indica que la reserva no está disponible para esa fecha 
			}
		}
		return true;// esto significa que no está agotada 
	}	
}
	
	
	


