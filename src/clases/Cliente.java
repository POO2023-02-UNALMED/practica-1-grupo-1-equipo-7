package clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente extends Persona {
    private String direccion;
    private String telefono;
    private String email;
    private String fechaRegistro;
    private int codigoCliente;
    private static int contadorClientes = 0;
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    public Cliente(String nombre, String direccion, String telefono, String email, String fechaRegistro){
        super(nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.codigoCliente = contadorClientes + 1;
        contadorClientes++;
        clientes.add(this);
    }

    static{
        new Cliente("Juan Perez", "Calle 1", "12345678", "juan@gmail.com", "2020-01-01");
        new Cliente("Maria Lopez", "Calle 2", "87654321", "1234", "2020-01-01");
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getEmail(){
        return this.email;
    }

    public String getFechaRegistro(){
        return this.fechaRegistro;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public static ArrayList<Plato> buscarPlatoPreferido(int codigoCliente){
        ArrayList<Plato> platoPreferido = new ArrayList<>();
        ArrayList<Factura> facturas = Factura.buscarFacturasPorCliente(codigoCliente);
        if(facturas.size() < 2){
            return null;
        }
        HashMap<Plato, Integer> platos = new HashMap<>();
        for(Factura factura : facturas){
            for(Plato plato : factura.getPlatos()){
                if (platos.containsKey(plato)) {
                    // El plato ya está en el mapa, aumentamos su contador en 1
                    platos.put(plato, platos.get(plato) + 1);
                } else {
                    // El plato no está en el mapa, lo agregamos con un valor de 1
                    platos.put(plato, 1);
                }
            }
        }
        int mayorValor = 0;
        for (Plato clave : platos.keySet()) {
            int valor = platos.get(clave);
            if (valor > mayorValor) {
                mayorValor = valor;
            }
        }
        for (Plato clave : platos.keySet()) {
            if (platos.get(clave) == mayorValor) {
                platoPreferido.add(clave);
            }
        }
        return platoPreferido;
    }

    public static ArrayList<Plato> buscarPlatoRecomendado(int codigoCliente){
        ArrayList<Plato> platoPreferido = buscarPlatoPreferido(codigoCliente);
        if(platoPreferido == null){
            return null;
        }
        ArrayList<Plato> platosRecomendados = new ArrayList<>();
        System.out.println(Plato.buscarPlato("Tacos").getIngredientes());
        for(Plato plato : Plato.getPlatos().keySet()){
            for(Plato preferido : platoPreferido){
                if(Plato.getIngredientesSimilares(plato, preferido) >= 3 && !platoPreferido.contains(plato) && !platosRecomendados.contains(plato)){
                    platosRecomendados.add(plato);
                }
            }
    
        }
        return platosRecomendados;
    }
}