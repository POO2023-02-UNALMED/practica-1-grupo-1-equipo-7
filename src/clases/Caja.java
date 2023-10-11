package clases;
import java.util.List;
import java.util.ArrayList;

public class Caja {
    private Sedes sedeAsociada;
    private int dineroCaja;
    private int numeroDeSerie;
    private int totalEgresos;
    private int totalIngresos;
    
    private static List<Caja> listadoCajas= new ArrayList<Caja>();

    public Caja() {
    }
    
    
    public Caja(Sedes sedeAsociada, int dineroCaja, int numeroDeSerie, int totalEgresos, int totalIngresos) {
        this.sedeAsociada = sedeAsociada;
        this.dineroCaja = dineroCaja;
        this.numeroDeSerie = numeroDeSerie;
        this.totalEgresos = totalEgresos;
        this.totalIngresos = totalIngresos;
        
    }

    




       


    public void setSedeAsociada(Sedes sedeAsociada) {
        this.sedeAsociada = sedeAsociada;
    }

    public int getDineroCaja() {
        return dineroCaja;
    }

    public void setDineroCaja(int dineroCaja) {
        this.dineroCaja = dineroCaja;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getTotalEgresos() {
        return totalEgresos;
    }

    public void setTotalEgresos(int totalEgresos) {
        this.totalEgresos = totalEgresos;
    }

    public int getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(int totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public static List<Caja> getListadoCajas() {
        return listadoCajas;
    }

    public static void setListadoCajas(List<Caja> listadoCajas) {
        Caja.listadoCajas = listadoCajas;
    }
   
    



    
    public void Compra(Item objeto, int precio, int cantidad) {
        int costoTotal = precio * cantidad;

        // Verificar si hay suficiente dinero en la caja para realizar la compra
        if (dineroCaja >= costoTotal) {
            // Restar el costo total del dinero en la caja
            dineroCaja -= costoTotal;

            // Registrar los egresos totales
            totalEgresos += costoTotal;

            // Actualizar el inventario de la sede asociada
            sedeAsociada.getInventario().añadirItems(objeto, cantidad);
        } else {
            System.out.println("No hay suficiente dinero en la caja para realizar la compra.");
        }
    }











        }