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
	Map<Mesa ,List<ZonedDateTime>  > reservas = new HashMap<>();
	private static int cantidadReservas;
	private ZonedDateTime fechaActualBogota = ZonedDateTime.now(ZoneId.of("America/Bogota"));
	private ZonedDateTime fecha ;
	

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
	
	    List<ZonedDateTime> fechasReservadas = reservas.get(mesa);


	    if (fechasReservadas == null) {
	        fechasReservadas = new ArrayList<>();
	    }


	    fechasReservadas.add(date);


	    reservas.put(mesa, fechasReservadas);


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

	public boolean  verificarReservas(Mesa mesa ,ZonedDateTime time) {
		for(ZonedDateTime i :reservas.get(mesa)) {
			if (time.isEqual(i)) {
				return false;
			}
		}
		return true;
	}	
}
	
	
	


