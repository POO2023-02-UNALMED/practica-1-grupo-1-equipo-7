package clases;
import java.util.ArrayList;

public class Cliente extends Persona {
    private String direccion;
    private String telefono;
    private String email;
    private String fechaRegistro;
    private String fechaUltimaCompra;
    private ArrayList<Factura> compras;

    public Cliente(String nombre, int edad, String direccion, String telefono, String email, String fechaRegistro, String fechaUltimaCompra){
        super(nombre, edad);
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.compras = new ArrayList<Factura>();
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

    public String getFechaUltimaCompra(){
        return this.fechaUltimaCompra;
    }

    public ArrayList<Factura> getCompras(){
        return this.compras;
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
}
