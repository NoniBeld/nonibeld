package tienda.objeto;

public class Libro extends Objeto{

	String energia;
	
	public Libro(String nombre, String tipo, String descripcion, double peso, double precio, int cantidad, String energia){
		super( nombre,tipo, descripcion,peso, precio, cantidad);
		this.energia = energia;
	}
	
	
	public String retornaEnergia(String energia) {
		return energia;
	}
	
	public String retornaInformacion() {
		return "Nombre del Libro: " + nombre + "\nTipo de Energia: " + energia; 
	}

}
