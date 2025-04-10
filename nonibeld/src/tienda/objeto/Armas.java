package tienda.objeto;

public class Armas extends Objeto {

	int daño;
	
	public Armas(String nombre, String tipo, String descripcion, double peso, double precio, int cantidad, int daño){
		super( nombre,tipo, descripcion,peso, precio, cantidad);
		this.daño = daño;
			
	}
	
	
	
	public int retornaDañO(int daño) {
		return daño ;
	}
	
	public String toString() {
		return"Nombre del Arma: " + nombre + "tipo de objeto: " + tipo + "("+ peso +" kg ) " + "$ " + precio  + " Cantidad " + cantidad +"\n" + descripcion + "el daño del arma es " + daño ;
	}
	
	
	public String retornaInformacion() {
		return "Nombre del Arma: " + nombre + "\nTipo de Objeto: " + tipo ;
	}
}
