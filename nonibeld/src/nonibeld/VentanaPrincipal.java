package nonibeld;

import java.awt.Color;

import javax.swing.JFrame;

import cuadroDeDialogo.DialogoJugador;

public class VentanaPrincipal {
    
    public VentanaPrincipal() {
        
        JFrame Ventanaprincipal = new JFrame();
        Ventanaprincipal.setSize(1280, 720);
        //Ventanaprincipal.setUndecorated(true); // Eliminar la barra de título y bordes
        Ventanaprincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ventanaprincipal.getContentPane().setBackground(Color.black); // Fondo negro
        Ventanaprincipal.setLayout(null);
        Ventanaprincipal.setLocationRelativeTo(null);  // Centrar la ventana
        
        // Mostrar el cuadro de diálogo
        DialogoJugador.Saludo(Ventanaprincipal, " ");
        
        // Asegúrate de que la ventana sea visible
        Ventanaprincipal.setVisible(true);
    }
}
