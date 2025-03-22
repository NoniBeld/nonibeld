package cuadroDeDialogo;

import java.awt.Color;
import java.awt.Font;

public class DialogoJugador extends CuadroDeDialogo{

	public static void Saludo() {
		
		String Titulo = " Jugador ";
		String dilogo = "Hola ";
		int ancho = 50;
		int alto = 100;
		int posicionX = 50;
		int posicionY = 500;
		Color colorfondo= Color.blue;
		Color colorTexto = Color.black;
		Color colorBorde = Color.cyan;
		Font tipoLetra = new Font("Times New Roman", Font.PLAIN, 18);
		
		Cuadrodialogo(Titulo, dilogo, ancho, alto, posicionX, posicionY, colorfondo, colorTexto, colorBorde, tipoLetra);
	
	}
}
