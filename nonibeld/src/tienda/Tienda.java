package tienda;

import tienda.estantes.Estante;
import tienda.objeto.Objeto;

public class Tienda {
	
	
	public static Estante crearTienda(){
		
		Estante tienda = new Estante(); 
		
		Objeto espada = new Objeto("Espada ", "Espada Corta Hecha de metal", 1.300, 22, 1);
		Objeto libro = new Objeto("Grimorio", "Este Grimorio Contiene el Conjurp Bola de Fuego", .500, 300,1);
		Objeto pocion = new Objeto("Pocion", "Posion de Recuperacion menor", .100, 50, 1);
		Objeto Pizza = new Objeto("Pizza", "Pizza de peperoni de las mas rica pizza del mundo", .500, 15, 1);
		
		
		
		tienda.agregarObjeto(4, Pizza);
		tienda.agregarObjeto(1, pocion);
		tienda.agregarObjeto(2, espada);
		tienda.agregarObjeto(3, libro);
		
		

		return tienda;
		}

}
