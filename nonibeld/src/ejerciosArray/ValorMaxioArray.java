package ejerciosArray;

public class ValorMaxioArray {

	public static void main(String[] args) {
		
		int [] numeros = {1, 80 , 50 , 65 , 112};
		int max = numeros[0];
		int a;
		
		
		for(a = 1; a < numeros.length; a++) {
			if (numeros[a] > max) {
				max = numeros[a];
			}
		}
		
		System.out.println("Este es el valor MAs Grande que esta en la lista: " + max);
	}
}
