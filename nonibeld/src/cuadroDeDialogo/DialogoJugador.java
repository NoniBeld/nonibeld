package cuadroDeDialogo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DialogoJugador {

    public static void Saludo(JFrame VentanaPrincipal, String dialogo) {
        
        String Titulo = " Jugador ";
        String dialogo1 = "¡Hola y bienvenido!";
        int ancho = 800;
        int alto = 200; // Ajuste del tamaño del cuadro de diálogo
        int posicionX = 240; // Ajuste de la posición
        int posicionY = 260; // Ajuste de la posición
        Color colorfondo = Color.blue;
        Color colorTexto = Color.white;
        Color colorBorde = Color.cyan;
        Font tipoLetra = new Font("Times New Roman", Font.PLAIN, 18);
        
        // Crear el cuadro de diálogo
        CuadroDeDialogo cuadroDeDialogo = new CuadroDeDialogo();
        JPanel Dialogo = cuadroDeDialogo.CuadroDeDialogo(Titulo, dialogo1, ancho, alto, posicionX, posicionY, colorfondo, colorTexto, colorBorde, tipoLetra);
        
        // Añadir el cuadro de diálogo a la ventana principal
        VentanaPrincipal.getContentPane().add(Dialogo);

        // Asegurarse de que la ventana principal se actualice para mostrar el cuadro de diálogo
        VentanaPrincipal.repaint();
        VentanaPrincipal.revalidate(); // Fuerza la actualización de la ventana
        
        // Asegúrate de que la ventana principal sea visible
        VentanaPrincipal.setVisible(true);
    }
}

