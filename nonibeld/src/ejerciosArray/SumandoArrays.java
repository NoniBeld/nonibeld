package ejerciosArray;

public class SumandoArrays {

	public static void main(String[] args) {

		int[]numeros = {1,1,1,1,1,1,1,1,1};
		int suma = 0;
		for(int i = 0; i < numeros.length; i++) {
			
			suma += numeros[i];
		}
		System.out.println("la suma de los elementos es: " + suma);
		
		int[]a = {2,5,8,9};
		int e;
		for(e = 0; e < a.length; e++) {
			
			suma += a[e];
		}
		System.out.println("la suma de los elementos es: " + suma);

	
	}
		

}
