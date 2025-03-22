package nonibeld;

import javax.swing.JOptionPane;

import cuadroDeDialogo.DialogoJugador;

public class NoniBeld {

	public static void main(String[] args) {
		
		
		System.out.println("Hola y se bienvenido o bienvenida!"
				+ "\nEstos son mis apuntes de estudio de Java.!");
		
	JOptionPane.showMessageDialog(null, " ( ^ - ^ ) ");
		
		JOptionPane.showMessageDialog(null, "Espero que esta guia te ayude a ti tambien", 
				"Sorprendido", JOptionPane.WARNING_MESSAGE);        // el String de esta linea es el nombre que aparece en el titulo de la ventana
		
		 JOptionPane.showMessageDialog(null, "Este es un mensaje de información.", 
                 "Información", JOptionPane.INFORMATION_MESSAGE);
	
		 JOptionPane.showMessageDialog(null, "Este es un mensaje de advertencia.", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
		
	JOptionPane.showMessageDialog(null, "Este es un mensaje de error.", 
                 "Error", JOptionPane.ERROR_MESSAGE);
		 
		 new VentanaPrincipal();
		
		 DialogoJugador.Saludo(null, "te Amo Dios");


	}

}
