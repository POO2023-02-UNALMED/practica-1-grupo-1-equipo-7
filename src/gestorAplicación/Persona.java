package gestorAplicación;
// por que sería abstracta? , si tienes la respuesta vuelvelo a cambiar 
public  class Persona {
    private String nombre;
    private int id;
    
    public Persona() {
    	this(null, 0);
    }
   
    public Persona(String nombre) {
    	this(nombre, 0);
    }
	
	public Persona(String nombre, int id){
        this.nombre = nombre;
        this.id=id;
    }
	
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getId() {
  		return id;
  	}
    
  	public void setId(int id) {
  		this.id = id;
  	}
  	
    public String toString(){
        return "Nombre: " + nombre;
    }
    
    static {
        Persona persona1 = new Persona("Persona 1", 1);
        Persona persona2 = new Persona("Persona 2", 2);
        Persona persona3 = new Persona("Persona 3", 3);
        Persona persona4 = new Persona("Persona 4", 4);
        Persona persona5 = new Persona("Persona 5", 5);
        Persona persona6 = new Persona("Persona 6", 6);
        Persona persona7 = new Persona("Persona 7", 7);
        Persona persona8 = new Persona("Persona 8", 8);
        Persona persona9 = new Persona("Persona 9", 9);
        Persona persona10 = new Persona("Persona 10", 10);
        Persona persona11 = new Persona("Persona 11", 11);
        Persona persona12 = new Persona("Persona 12", 12);
        Persona persona13 = new Persona("Persona 13", 13);
        Persona persona14 = new Persona("Persona 14", 14);
        Persona persona15 = new Persona("Persona 15", 15);
    }
 
}


