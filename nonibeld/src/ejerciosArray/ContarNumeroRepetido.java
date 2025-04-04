package ejerciosArray;

public class ContarNumeroRepetido {

	public static void main (String[] args) {
		
		int [] numeros = {1 , 2 , 3 , 4 , 3 , 5 , 8 , 3 , 8 , 6 , 5 , 7 , 9 , 6 , 5 , 5 };
		
		int numeroBuscado = 5 ; 
		int contador = 0 ;
		
		for (int b = 0; b < numeros.length; b++) {
			if(numeros[b] == numeroBuscado) {
				contador++;
			}
			

		}
        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces.");

	}
}
