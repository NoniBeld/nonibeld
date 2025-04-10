package tienda.contenedores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tienda.objeto.Objeto;

public class Canasta {

	private List<Objeto> canasta;
	
	public Canasta() {
		
		canasta = new ArrayList<>();
		
	}
	
	public void agregarObjeto(int canastilla, Objeto objeto) {
		
		switch (canastilla) {
		
		case 1 -> canasta.add(objeto);
		default -> JOptionPane.showMessageDialog(null, "la Canastilla esta en el 1 ");
		}
	}
	
	public void retirarObjeto(int retirar, Objeto objeto) {
		
		switch (retirar) {
		
		case 1 -> canasta.remove(objeto);
		default -> JOptionPane.showMessageDialog(null, "la Canastilla esta en el 1 ");
		}
	}
	
}
