package cuadroDeDialogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CuadroDeDialogo {

	public static void Cuadrodialogo(String dilogo, String Titulo, int ancho, int alto, int posicionX, int posicionY, Color colorfondo, Color colorTexto, Color colorBorde, Font tipoLetra ) {
		
		//Creacion del panel.
		
		JPanel CuadroDeDialogo =  new JPanel();
		CuadroDeDialogo.setPreferredSize(new Dimension(ancho,alto));
		CuadroDeDialogo.setBackground(colorfondo);
		CuadroDeDialogo.setBorder(BorderFactory.createLineBorder(colorBorde, 3));//borde del cuadro de dialogo
		CuadroDeDialogo.setBounds(posicionX, posicionY, ancho, alto); // para ubicar la posicion. 
		
		
		//Creacion del Dialogo
		JLabel dialogo = new JLabel();
		dialogo.setFont(tipoLetra);
		dialogo.setForeground(colorTexto);
		
		CuadroDeDialogo.add(dialogo);
		
		JOptionPane.showMessageDialog(null, CuadroDeDialogo, Titulo, JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	
	/*String dilogo, Titulo;
	int ancho, alto;
	Color colorfondo, colorTexto, colorBorde;
	Font tipoLetra;*/
}
