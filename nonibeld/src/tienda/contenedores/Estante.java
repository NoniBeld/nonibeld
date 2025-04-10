package tienda.contenedores;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tienda.objeto.Objeto;

public class Estante {
	
	private List<Objeto> EstantePosiones;
	private List<Objeto> EstanteArmas;
	private List<Objeto> EstanteLibros;
	private List<Objeto> EstanteComida;
	
	
	public Estante() {
		
		EstantePosiones = new ArrayList<>();
		EstanteArmas = new ArrayList<>();
		EstanteLibros = new ArrayList<>();
		EstanteComida = new ArrayList<>();
		
	}
	
	public void agregarObjeto(int ubicacion, Objeto objeto) {
		
		switch (ubicacion) {
		
		case 1 -> EstantePosiones.add(objeto);
		case 2 -> EstanteArmas.add(objeto); 	
		case 3 -> EstanteLibros.add(objeto);
		case 4 -> EstanteComida.add(objeto);
		default -> JOptionPane.showMessageDialog(null, "Ingresa un Objeto Valido");
		
		}
		
	
	}
	
	public void mostrarContenido() {
		System.out.println("Esteante de Posiones: ");
		EstantePosiones.forEach(System.out::println);
		
		System.out.println("Estante de Armas: ");
		EstanteArmas.forEach(System.out::println);	        
		
		System.out.println("Estante de Libros:  ");
		EstanteLibros.forEach(System.out::println);	
		
		System.out.println("Estante de Comida: ");
		EstanteComida.forEach(System.out::println);	
		;
		
	}
}
