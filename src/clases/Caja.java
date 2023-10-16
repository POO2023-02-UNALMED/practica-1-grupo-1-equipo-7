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
// esto debe modificar el dinero total de caja 
    public void setTotalEgresos(int totalEgresos) {
        this.totalEgresos = totalEgresos;
    }

    public int getTotalIngresos() {
        return totalIngresos;
    }
// lo mismo que arriba 
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
    public void agregarDineroCaja(int monto) {
        this.totalIngresos += monto;
        dineroCaja += monto;
    }
    public void obtenerResumenCaja() {
        System.out.println("Número de Serie: " + numeroDeSerie);
        System.out.println("Sede Asociada: " + sedeAsociada.getNombre()); // Asumiendo que Sedes tiene un atributo nombre
        System.out.println("Dinero en Caja: " + dineroCaja);
        System.out.println("Total de Ingresos: " + totalIngresos);
        System.out.println("Total de Egresos: " + totalEgresos);
        System.out.println("Saldo Actual: " + this.dineroCaja);
    }
    public void cerrarCaja() {
        totalIngresos = 0;
        totalEgresos = 0;
        dineroCaja = 0;
    }
    
    // enlazar este metodo con el de compra***
    public void registrarEgreso(int monto) {
        if (monto <= dineroCaja) {
            totalEgresos += monto;
            dineroCaja -= monto;
        } else {
            System.out.println("Fondos insuficientes en la caja para realizar el egreso.");
        }
    }
    
    
    
    public void transferirDineroACaja(Caja otraCaja, int monto) {
        if (dineroCaja >= monto) {
            registrarEgreso(monto);
            otraCaja.agregarDineroCaja(monto);
            System.out.println("Transferencia exitosa de $" + monto + " a la caja " + otraCaja.getNumeroDeSerie());
        } else {
            System.out.println("Fondos insuficientes para realizar la transferencia.");
        }
    }
    public void verRegistroTransacciones() {
        System.out.println("Registro de Transacciones de la Caja " + numeroDeSerie);
        System.out.println("Ingresos totales: " + totalIngresos);
        System.out.println("Egresos totales: " + totalEgresos);
    }
    public void generarInformeCierreDiario() {
        System.out.println("Informe de Cierre Diario de la Caja " + numeroDeSerie);
        System.out.println("Saldo Inicial: " + (dineroCaja + totalEgresos - totalIngresos));
        System.out.println("Ingresos del Día: " + totalIngresos);
        System.out.println("Egresos del Día: " + totalEgresos);
        System.out.println("Saldo Actual: " + this.dineroCaja);
    }
    public void registrarPropina(int monto) {
        if (monto > 0) {
            this.dineroCaja+=monto;
            System.out.println("Propina registrada exitosamente de $" + monto);
        } else {
            System.out.println("Sin propina .");
        }
    }
    










        }