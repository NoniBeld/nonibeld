package tienda.objeto;

public class Pocion extends Objeto {
	
	String efecto;
	public Pocion(String nombre, String tipo, String descripcion, double peso, double precio, int cantidad, String efecto){
		super( nombre,tipo, descripcion,peso, precio, cantidad);
		this.efecto = efecto;		
	}
	
	public String retornarEfecto(String efecto) {
		return efecto;
	}
	
	public String retornaInformacion() {
		return "Nombre de la Pocion: " + nombre + "\nTipo de Efecto: " + efecto; 
	}

}
