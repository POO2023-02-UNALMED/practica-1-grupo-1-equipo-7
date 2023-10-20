package gestorAplicación;
import java.util.List;

import java.util.ArrayList;
// es posible que esta desaparezca 
	public class Tipo {
	    private String nombre;
	    private List<Tipo> listadoTipos = new ArrayList<>();

	    // Constructor
	    public Tipo(String nombre) {
	        this.nombre = nombre;
	    }

	    // Getter para el atributo "nombre"
	    public String getNombre() {
	        return nombre;
	    }

	    // Setter para el atributo "nombre"
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    // Getter para el atributo "listadoTipos"
	    public List<Tipo> getListadoTipos() {
	        return listadoTipos;
	    }

	    // Setter para el atributo "listadoTipos"
	    public void setListadoTipos(List<Tipo> listadoTipos) {
	        this.listadoTipos = listadoTipos;
	    }
	

	}

