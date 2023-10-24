package basedatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import gestorAplicación.Reserva;

public class Deserializacion {
	
	public static void deserealizar(Object objeto, String archivo ) {
	
	try {
	    FileInputStream archivoEntrada = new FileInputStream(archivo);
	    ObjectInputStream canalEntrada = new ObjectInputStream(archivoEntrada);
	    Object objetoDeserializado = (Object ) canalEntrada.readObject(); // Cambia MiClase al tipo apropiado
	    // Ahora puedes trabajar con objetoDeserializado
	    canalEntrada.close();
	} catch (IOException | ClassNotFoundException e) {
	    e.printStackTrace();
	}

}
	
	public static Reserva deserializarReserva(String fichero) {
        try {
            FileInputStream fileInputStream = new FileInputStream("fichero.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Reserva reserva = (Reserva) objectInputStream.readObject();
            objectInputStream.close();
            return reserva;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null; 
        }
	}


}
