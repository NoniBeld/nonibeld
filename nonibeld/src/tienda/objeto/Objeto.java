package tienda.objeto;

public class Objeto {

	String nombre, descripcion;
	int cantidad;
	double peso, precio;
	
	public Objeto(String nombre, String descripcion, double peso, double precio, int cantidad) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.precio = precio;
		this.cantidad = cantidad;
				
	}
	
	public String retornarNombre(String nombre) {
		return nombre;
	}
	
	public String retornaDescripcion(String descripcion) {
		return descripcion;
	}
	
	public double retornaPeso(double peso) {
		return peso;
	}
	
	public double retornaPrecio(double precio) {
		return precio;
	}
	
	public String toString() {
		return nombre + "\n " + descripcion + "("+ peso +" kg ) " + "$ " + precio  + " Cantidad " + cantidad ;
	}
}
