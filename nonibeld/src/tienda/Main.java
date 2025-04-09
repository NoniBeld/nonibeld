package tienda;

import tienda.estantes.Estante;

public class Main {

	public static void main(String[] args) {

		Estante tienda = Tienda.crearTienda();
		
		tienda.mostrarContenido();
		
		
	}

}
