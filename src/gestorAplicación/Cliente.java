package gestorAplicación;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente extends Persona {
	private String direccion;
	private String telefono;
	private String email;
	private String fechaRegistro;
	private Mesa mesa;
	private int codigoCliente;
	private static int contadorClientes = 0;
	private static ArrayList<Cliente> clientes = new ArrayList<>();

	public Cliente(String nombre, int id) {
		this(nombre, id, null, null, null, null);

	}

	public Cliente(String nombre, int id, String direccion, String telefono, String email, String fechaRegistro) {
		super(nombre, id);
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaRegistro = fechaRegistro;
		this.codigoCliente = contadorClientes + 1;
		contadorClientes++;
		clientes.add(this);
	}

	static {
		new Cliente("Anonimo", 0);
		new Cliente("Juan Perez", 5236, "Calle 1", "1234567", "juan@gmail.com", "2020-01-01");
		new Cliente("Maria Lopez", 7423, "Calle 2", "8765432", "1234", "2020-01-01");
		new Cliente("Julian Vargas", 7162, "Carrera 65", "4630245", "nose@gmail.com", "2020-01-02");
		new Cliente("Martha Wayne", 4875, "Carrera 64", "4526315", "nose2@gmail.com", "2020-01-03");
		new Cliente("Barbara Gordon", 1173, "Carrera 63", "7526941", "amveceshayquesufrir@gmail.com", "2020-01-04");
		new Cliente("Carol Diaz", 2578, "Carrera 62", "1453278", "nose.3@gmail.com", "2020-01-04");
		new Cliente("Santiago Lopez", 7894, "Carrera 61", "2358714", "slopez@gmail.com", "2020-01-04");
		new Cliente("Estaban Tabares", 1257, "Carrera 60", "2352348", "estebantab@gmail.com", "2020-01-05");
		new Cliente("Elizabeth Bennet", 6872, "Carrera 59", "5896314", "Elib@gmail.com", "2020-01-05");
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public String getFechaRegistro() {
		return this.fechaRegistro;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static ArrayList<Plato> buscarPlatoPreferido(int codigoCliente) {
		ArrayList<Plato> platoPreferido = new ArrayList<>();
		ArrayList<Factura> facturas = Factura.buscarFacturasPorCliente(codigoCliente);
		if (facturas.size() < 2) {
			return null;
		}
		HashMap<Plato, Integer> platos = new HashMap<>();
		for (Factura factura : facturas) {
			for (Plato plato : factura.getPlatos()) {
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

	public static Object[] buscarPlatoRecomendado(int codigoCliente) {
		ArrayList<Plato> platoPreferido = buscarPlatoPreferido(codigoCliente);
		if (platoPreferido == null) {
			return null;
		}
		ArrayList<String> ingredientes = new ArrayList<>();
		ArrayList<Plato> platosRecomendados = new ArrayList<>();
		Object[] ingredientesSimilares = new Object[2];
		for (Plato plato : Plato.getPlatos().keySet()) {
			for (Plato preferido : platoPreferido) {
				ingredientesSimilares = Plato.getIngredientesSimilares(plato, preferido);
				if ((int) ingredientesSimilares[0] >= 3 && !platoPreferido.contains(plato)
						&& !platosRecomendados.contains(plato)) {
					platosRecomendados.add(plato);
					for (String ingrediente : (ArrayList<String>) ingredientesSimilares[1]) {
						if (!ingredientes.contains(ingrediente)) {
							ingredientes.add(ingrediente);
						}
					}
				}
			}

		}
		return new Object[] { platosRecomendados, ingredientes };
	}

	public static Cliente buscarCliente(int codigoCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.codigoCliente == codigoCliente) {
				return cliente;
			}
		}
		return null;
	}

	public static Cliente buscarClienteXNombre(String nombre) {
		for (Cliente cliente : clientes) {
			if (cliente.getNombre() == nombre) {
				return cliente;
			}
		}
		return null;
	}

	public static ArrayList<Plato> buscarPlatoRecomendado(ArrayList<String> ingredientes, String item) {
		ArrayList<Plato> platosRecomendados = new ArrayList<>();
		for (Plato plato : Plato.getPlatos().keySet()) {
			int ingredientesSimilares = 0;
			for (String ingrediente : ingredientes) {
				if (plato.getIngredientes().contains(ingrediente) && !platosRecomendados.contains(plato)) {
					ingredientesSimilares++;
					if (ingredientesSimilares >= 3 && !plato.getIngredientes().contains(item)) {
						platosRecomendados.add(plato);
					}
				}
			}
		}
		return platosRecomendados;
	}

	public static ArrayList<Plato> buscarPlatoRecomendado(ArrayList<String> ingredientes, String item,
			String itemAgregar) {
		ArrayList<Plato> platosRecomendados = new ArrayList<>();
		for (Plato plato : Plato.getPlatos().keySet()) {
			int ingredientesSimilares = 0;
			for (String ingrediente : ingredientes) {
				if (plato.getIngredientes().contains(ingrediente) && !platosRecomendados.contains(plato)) {
					ingredientesSimilares++;
					if (ingredientesSimilares >= 3 && !plato.getIngredientes().contains(item)
							&& plato.getIngredientes().contains(itemAgregar)) {
						platosRecomendados.add(plato);
					}
				}
			}
		}
		return platosRecomendados;

	}
}