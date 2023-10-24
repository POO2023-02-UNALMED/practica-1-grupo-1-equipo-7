package basedatos;

import java.io.*;
import java.util.List;

import gestorAplicación.Item;
import gestorAplicación.Reserva;

public class Serializacion {
    
    // proceso de serialización
    public static void serializar(Object item) {
        try {
            FileOutputStream archivoSalida = new FileOutputStream("archivo-objt.txt");
            ObjectOutputStream canalSalida = new ObjectOutputStream(archivoSalida);
            canalSalida.writeObject(item);
            archivoSalida.close();
            canalSalida.close();
            System.out.println("Objeto serializado correctamente.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // serializador para listas
    public static void serializarListas(Object lista) {
        try {
            FileOutputStream archivoSalida = new FileOutputStream("archivo-listas");
            ObjectOutputStream canalSalida = new ObjectOutputStream(archivoSalida);
            canalSalida.writeObject(lista);
            archivoSalida.close();
            canalSalida.close();
            System.out.println("Lista de objetos serializada correctamente.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void serializarReserva(Reserva miReserva, String fichero) throws IOException {
    	try {
            FileOutputStream fileOutputStream = new FileOutputStream("fichero.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(miReserva);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    
// esto es para hecr una prueba 
    public static void main(String[] args) {
        // Crear un objeto que deseas serializar
        Item n = new Item();
        
        // Llamar al método para serializar
        Serializacion.serializar(n);
    }
    
}










