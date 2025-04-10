package tienda.objeto;

public class Comida extends Objeto {
	
	boolean comidaChatarra;
	
	public Comida(String nombre, String tipo, String descripcion, double peso, double precio, int cantidad, boolean comidaChatarra ){
		super( nombre,tipo, descripcion,peso, precio, cantidad);
		this.comidaChatarra = comidaChatarra;
	}
	
	public boolean retornaComidaChatarra(boolean comidaChatarra) {
		return comidaChatarra;
	}
	
	public String retornaInformacion() {
		return "Nombre de la comida: " + nombre + "\nEs comida Chatarra: " + comidaChatarra; 
	}
}
