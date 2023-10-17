package basedatos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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

}}
