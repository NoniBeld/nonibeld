package creadorDePersonajes.reparto;

import creadorDePersonajes.Sujeto;
import creadorDePersonajes.razas.Elfo;

public class AguilaDorda extends Sujeto implements Elfo{


	 AguilaDorda(String nombre){
		
		 nombre = "Aguila Dorada ";
		 
		 
		
	}
	 
	 void raza(){
		 
	 }
	 
	 void saludo() {
		 
		 System.out.println(AguilaDorda.raza);
	 }
}
