package clases;
import java.util.ArrayList;
import java.time.LocalDate;

public class Factura {
    private int codigo;
    private int codigoCliente;
    private int codigoEmpleado;
    private int codigoSede;
    private int total;
    private LocalDate fecha;
    private static int contadorFacturas = 0;
    private static ArrayList<Factura> facturas = new ArrayList<>();
    public Factura(int codigoCliente, int codigoEmpleado, int codigoSede, LocalDate fecha, int total){
        this.codigo = contadorFacturas + 1;
        this.codigoCliente = codigoCliente;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoSede = codigoSede;
        this.total = total;
        contadorFacturas++;
        this.fecha = fecha;
        facturas.add(this);

    }
    static{
        new Factura(1, 1, 1, LocalDate.parse("2020-01-01"), 1000);
        new Factura(1, 1, 1, LocalDate.parse("2020-01-02"), 2000);
        new Factura(1, 1, 1, LocalDate.parse("2020-01-03"), 3000);
        new Factura(1, 1, 1, LocalDate.parse("2020-01-04"), 4000);
        new Factura(1, 1, 1, LocalDate.parse("2020-01-05"), 5000);
        new Factura(1, 1, 1, LocalDate.parse("2020-01-06"), 6000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-07"), 7000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-08"), 8000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-09"), 9000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-10"), 10000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-11"), 11000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-12"), 12000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-13"), 13000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-14"), 14000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-15"), 15000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-16"), 16000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-17"), 17000);
        new Factura(1, 2, 1, LocalDate.parse("2020-01-18"), 18000);
    }
    public int getCodigo(){
        return codigo;
    }
    public int getCodigoCliente(){
        return codigoCliente;
    }
    public int getCodigoEmpleado(){
        return codigoEmpleado;
    }
    public int getCodigoSede(){
        return codigoSede;
    }
    public int getTotal(){
        return total;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public static Factura buscarFactura(int codigo){
        for(Factura factura : facturas){
            if(factura.getCodigo() == codigo){
                return factura;
            }
        }
        return null;
    }
    public static ArrayList<Factura> buscarFacturasPorCliente(int codigoCliente){
        ArrayList<Factura> facturasCliente = new ArrayList<>();
        for(Factura factura : facturas){
            if(factura.getCodigoCliente() == codigoCliente){
                facturasCliente.add(factura);
            }
        }
        return facturasCliente;
    }
    public static ArrayList<Factura> buscarFacturasPorEmpleado(int codigoEmpleado){
        ArrayList<Factura> facturasEmpleado = new ArrayList<>();
        for(Factura factura : facturas){
            if(factura.getCodigoEmpleado() == codigoEmpleado){
                facturasEmpleado.add(factura);
            }
        }
        return facturasEmpleado;
    }
    public static ArrayList<Factura> buscarFacturasPorSede(int codigoSede){
        ArrayList<Factura> facturasSede = new ArrayList<>();
        for(Factura factura : facturas){
            if(factura.getCodigoSede() == codigoSede){
                facturasSede.add(factura);
            }
        }
        return facturasSede;
    }
    public static ArrayList<Factura> buscarFacturasPorFecha(LocalDate fechaInicio, LocalDate fechaFin){
        ArrayList<Factura> facturasFecha = new ArrayList<>();
        for(Factura factura : facturas){
            if(factura.getFecha().isAfter(fechaInicio) && factura.getFecha().isBefore(fechaFin)){
                facturasFecha.add(factura);
            }
        }
        return facturasFecha;
    }

    public static ArrayList<Factura> buscarFacturasPorFechaycodigo(int codigoEmpleado,LocalDate fechaInicio, LocalDate fechaFin){
        ArrayList<Factura> facturasFecha = new ArrayList<>();
        for(Factura factura : facturas){
            if(factura.getCodigoEmpleado() == codigoEmpleado && factura.getFecha().isAfter(fechaInicio) && factura.getFecha().isBefore(fechaFin)){
                facturasFecha.add(factura);
            }
        }
        return facturasFecha;

        
    }

}
