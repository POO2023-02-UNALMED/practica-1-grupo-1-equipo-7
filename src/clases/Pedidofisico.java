package clases;

import java.util.List;

public class Pedidofisico {
	 int numeroOrden;
	 int cantidadPlatos;
	 
	private Cliente cliente;
	private Caja caja;
	private Factura factura;
	private Menu menu;
	private Plato plato;
	private List<Menu> menuList;
	private Item item;
	private Sedes sedes;
	
	public Pedidofisico(int numeroOrden, int cantidadPlatos) {
		this.numeroOrden = numeroOrden;
		this.cantidadPlatos = cantidadPlatos;
}
}
