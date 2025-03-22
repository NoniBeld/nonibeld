package cuadroDeDialogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CuadroDeDialogo {

    public static JPanel CuadroDeDialogo(String Titulo, String dialogo, int ancho, int alto, int posicionX, int posicionY, Color colorfondo, Color colorTexto, Color colorBorde, Font tipoLetra) {
        
        // Creación del panel
        JPanel CuadroDeDialogo = new JPanel();
        CuadroDeDialogo.setPreferredSize(new Dimension(ancho, alto)); // Tamaño preferido del panel
        CuadroDeDialogo.setBackground(colorfondo); // Fondo del cuadro de diálogo
        CuadroDeDialogo.setBorder(BorderFactory.createLineBorder(colorBorde, 3)); // Borde del cuadro de diálogo
       CuadroDeDialogo.setLayout(null); // No usar un layout, usar setBounds

        // Establecer la posición del panel usando setBounds
        CuadroDeDialogo.setBounds(posicionX, posicionY, ancho, alto);

        // Creación del JLabel (el texto del cuadro de diálogo)
        JLabel DialogoTexto = new JLabel(dialogo);
        DialogoTexto.setFont(tipoLetra);
        DialogoTexto.setForeground(colorTexto);
        DialogoTexto.setBounds(10, 10, ancho - 20, alto - 20); // Tamaño y posición del texto

        CuadroDeDialogo.add(DialogoTexto); // Añadir el JLabel al panel
        
        return CuadroDeDialogo;
    }
}
