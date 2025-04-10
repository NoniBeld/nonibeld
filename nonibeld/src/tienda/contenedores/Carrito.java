package tienda.contenedores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tienda.objeto.Objeto;

public class Carrito {
	
	private List<Objeto> carrito;
	private List<Objeto> carritoAbajo;
	private List<Objeto> carritoSilla;
	

	public Carrito() {
		carrito = new ArrayList<>();
		carritoAbajo = new ArrayList<>();
		carritoSilla = new ArrayList<>();
	}
	
	public void agregarObjeto(int ubicacion, Objeto objeto) {
		
		switch(ubicacion) {
		case 1 -> carrito.add(objeto);
		case 2 -> carritoAbajo.add(objeto);
		case 3 -> carritoSilla.add(objeto);
		default -> JOptionPane.showMessageDialog(null, "Ingresa un Objeto Valido");
		}
	}
	
	public void retirarObjeto(int retirar, Objeto objeto) {
		switch (retirar){
			case 1 -> carrito.remove(objeto);
			case 2 -> carritoAbajo.remove(objeto);
			case 3 -> carritoSilla.remove(objeto);
			default -> JOptionPane.showMessageDialog(null, "eso no es el Carrito");
		}
		
	}
	
	public void verCarrito() {
		System.out.println("Veamos que hay dentro del Carrito: ");
		carrito.forEach(System.out::println);
		
		System.out.println("Veamos que hay en la silla del Carrito: ");
		carritoSilla.forEach(System.out::println);
		
		System.out.println("Veamos que hay Abajo del Carrito: ");
		carritoAbajo.forEach(System.out::println);
	}
	
}
