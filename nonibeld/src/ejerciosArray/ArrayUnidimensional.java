package ejerciosArray;

public class ArrayUnidimensional {

	public static void main(String[] args) {

		int[]numeros = {10 , 20 , 30 , 40 , 50 , 60};
		
		//Recoriendo el array de numeros en un bucle for
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//recoriendo el array de String en un bucle for 
		
		String[]nombres = {"Renata", "Isaac", "Noni", "Ariz", "Kito",};
		
		for(int e = 0; e < nombres.length; e++) {
			System.out.println(nombres[e]);
		}
	}

}
