package clases;

public class Provedor {
    private String nombre;

    public Provedor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para suministrar productos a una sede y registrar la transacción en una caja
    public void suministrarProductos(Sedes sede, Caja caja, Item item, int cantidad, int precio) {
        if (sede != null && caja != null) {
            // Verificar si la sede tiene suficiente dinero en la caja para realizar la compra
            if (caja.getDineroCaja() >= precio * cantidad) {
                // Suministrar los productos al inventario de la sede
                sede.getInventario().añadirItems(item, cantidad);

                // Registrar la transacción en la caja
                caja.Compra(item, precio, cantidad);
            } else {
                System.out.println("La sede no tiene suficiente dinero en la caja para realizar la compra.");
            }
        } else {
            System.out.println("La sede o la caja no están disponibles para realizar la transacción.");
        }
    }}
