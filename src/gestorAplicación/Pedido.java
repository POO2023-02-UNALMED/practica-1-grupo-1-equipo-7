package gestorAplicación;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;

public class Pedido {
	private Cliente cliente;
	private Empleado empleado;
	private int numeroOrden;
	private ArrayList<Plato> platos;
	private String estadoPedido;
	private String direccionPedido;
	private String tipoPedido;
	private static List<Pedido> Pedidos =new ArrayList<>();
	private Restaurante restaurante;
	private Factura factura;
	
	//Constructor
	

	public Pedido(ArrayList<Plato> platos, String direccionPedido, String tipoPedido, Restaurante restaurante, Cliente cliente, Empleado empleado) {
		this.platos = platos;
		this.direccionPedido = direccionPedido;
		this.tipoPedido = tipoPedido;
		this.restaurante = restaurante;
		Pedido.Pedidos.add(this);
		factura = new Factura(cliente.getCodigo(), empleado.getCodigo(), restaurante.getCodigoSede(), LocalDate.of(2020, 01, 01), 0, platos);
	}

	
	public double getPrecioTotal(ArrayList<Plato> platos) {
		double precioTotal = 0;
		for (Plato plato : platos) {
			precioTotal += plato.getPrecio();
		}
		return precioTotal;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setDireccionPedido(String direccionPedido) {
		this.direccionPedido = direccionPedido;
	}

	public String getDireccionPedido() {
		return direccionPedido;
	}

	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	 
	



}
