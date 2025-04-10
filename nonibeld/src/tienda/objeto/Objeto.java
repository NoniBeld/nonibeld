package tienda.objeto;

public class Objeto {

	String nombre,tipo, descripcion;
	int cantidad;
	double peso, precio;
	
	public Objeto(String nombre,String tipo, String descripcion, double peso, double precio, int cantidad ) {
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.peso = peso;
		this.precio = precio;
		this.cantidad = cantidad;
				
	}
	
	public String retornarNombre(String nombre) {
		return nombre;
	}
	
	public String retornaTipo(String tipo) {
		return tipo;
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
		return nombre + "tipo de objeto: " + tipo + "("+ peso +" kg ) " + "$ " + precio  + " Cantidad " + cantidad +"\n" + descripcion  ;
	}
}
