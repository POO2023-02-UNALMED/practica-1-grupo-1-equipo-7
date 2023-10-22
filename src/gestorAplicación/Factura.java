package gestorAplicación;
import java.util.ArrayList;
import java.time.LocalDate;

public class Factura {
    private int codigo;
    private int codigoCliente;
    private int codigoEmpleado;
    private int codigoSede;
    private int total;
    private ArrayList<Plato> platos;
    private LocalDate fecha;
    private static int contadorFacturas = 0;
    private static ArrayList<Factura> facturas = new ArrayList<>();
    
    public Factura(int codigoCliente, int codigoEmpleado, int codigoSede, LocalDate fecha, int total, ArrayList<Plato> platos){
        this.codigo = contadorFacturas + 1;
        this.codigoCliente = codigoCliente;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoSede = codigoSede;
        this.total = total;
        contadorFacturas++;
        this.fecha = fecha;
        facturas.add(this);
        this.platos = platos;

    }
    static{
        ArrayList<Plato> platos1 = new ArrayList<>();
        ArrayList<Plato> platos2 = new ArrayList<>();
        ArrayList<Plato> platos3 = new ArrayList<>();
        platos1.add(Plato.buscarPlato("Tacos"));
        platos1.add(Plato.buscarPlato("Tostadas"));
        platos2.add(Plato.buscarPlato("Sopes"));
        platos2.add(Plato.buscarPlato("Enchiladas"));
        platos3.add(Plato.buscarPlato("Tamales"));
        Factura factura1 = new Factura(1, 1, 1, LocalDate.parse("2020-01-01"), 1000, platos1);
        Factura factura2 = new Factura(1, 1, 1, LocalDate.parse("2020-01-02"), 2000, platos1);
        Factura factura3 = new Factura(1, 1, 1, LocalDate.parse("2020-01-03"), 3000, platos1);
        Factura factura4 = new Factura(1, 1, 1, LocalDate.parse("2020-01-04"), 4000, platos2);
        Factura factura5 = new Factura(1, 1, 1, LocalDate.parse("2020-01-05"), 5000, platos2);
        Factura factura6 = new Factura(1, 1, 1, LocalDate.parse("2020-01-06"), 6000, platos2);
        Factura factura7 = new Factura(1, 2, 1, LocalDate.parse("2020-01-07"), 7000, platos2);
        Factura factura8 = new Factura(1, 2, 1, LocalDate.parse("2020-01-08"), 8000, platos2);
        Factura factura9 = new Factura(1, 2, 1, LocalDate.parse("2020-01-09"), 9000, platos2);
        Factura factura10 = new Factura(1, 2, 1, LocalDate.parse("2020-01-10"), 10000, platos3);
        Factura factura11 = new Factura(1, 2, 1, LocalDate.parse("2020-01-11"), 11000, platos2);
        Factura factura12 = new Factura(1, 2, 1, LocalDate.parse("2020-01-12"), 12000, platos2);
        Factura factura13 = new Factura(1, 2, 1, LocalDate.parse("2020-01-13"), 13000, platos3);
        Factura factura14 = new Factura(1, 2, 1, LocalDate.parse("2020-01-14"), 14000, platos1);
        Factura factura15 = new Factura(1, 2, 1, LocalDate.parse("2020-01-15"), 15000, platos2);
        Factura factura16 = new Factura(1, 2, 1, LocalDate.parse("2020-01-16"), 16000, platos2);
        Factura factura17 = new Factura(1, 2, 1, LocalDate.parse("2020-01-17"), 17000, platos2);
        Factura factura18 = new Factura(1, 2, 1, LocalDate.parse("2020-01-18"), 18000, platos2);
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
    public ArrayList<Plato> getPlatos(){
        return platos;
    }

}
