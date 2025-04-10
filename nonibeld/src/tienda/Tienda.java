package tienda;

import tienda.contenedores.Estante;
import tienda.objeto.Armas;
import tienda.objeto.Comida;
import tienda.objeto.Libro;
import tienda.objeto.Objeto;
import tienda.objeto.Pocion;

public class Tienda {
	
	
	public static Estante crearTienda(){
		
		Estante tienda = new Estante(); 
		
		Objeto espada = new Armas("Espada ","arma" , "Espada Corta Hecha de metal", 1.300, 22, 1, 15);
		Objeto pocion = new Pocion("Pocion","Pocion", "Posion de Recuperacion menor", 0.100, 50, 1,"curacion");
		Objeto libro = new Libro("Grimorio", "Grimorio ","Este Grimorio Contiene el Conjurp Bola de Fuego", .500, 300,1, "Magica");
		Objeto Pizza = new Comida("Pizza", "Comida ","Pizza de peperoni de las mas rica pizza del mundo", .500, 15, 1, true);
		
		
		
		tienda.agregarObjeto(4, Pizza);
		tienda.agregarObjeto(1, pocion);
		tienda.agregarObjeto(2, espada);
		tienda.agregarObjeto(3, libro);
		
		

		return tienda;
		}
	
	

}
