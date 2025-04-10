package creadorDePersonajes;

public class Sujeto {

	protected String nombre;
	
	public Sujeto(String nombre) {
		
		this.nombre = nombre;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "Me Llamo " + nombre;
	}
	
}
