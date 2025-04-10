package tienda.contenedores;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import tienda.objeto.Objeto;

public class CintaTransportadora {

	private List<Objeto> cintaTransportadora;
	
	public CintaTransportadora() {
		
		cintaTransportadora = new ArrayList<>();
		
	}
	
	public void agregarObjeto(int cinta, Objeto objeto) {
		
		switch (cinta) {
		case 1 -> cintaTransportadora.add(objeto);
		default -> JOptionPane.showMessageDialog(null, "la cinta esta en el 1");
		}
		
	}

	public void retirarObjeto(int retirar, Objeto objeto) {
		
		switch (retirar) {
		case 1 -> cintaTransportadora.remove(objeto); 
		default -> JOptionPane.showMessageDialog(null, "la cinta esta en el 1");

		}
	}
	
	public void verCintaTransportadora() {
		
		System.out.println("Veamos que llevamos");
		cintaTransportadora.forEach(System.out::println);
	}
}
