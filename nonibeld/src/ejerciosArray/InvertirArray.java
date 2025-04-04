package ejerciosArray;

public class InvertirArray {

	    public static void main(String[] args) {
	        int[] numeros = {1, 2, 3, 4, 5, 6};

	        System.out.println("Array original:");
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }

	        // Invertir el array
	        int n = numeros.length;
	        for (int i = 0; i < n / 2; i++) {
	            int temp = numeros[i];
	            numeros[i] = numeros[n - 1 - i];
	            numeros[n - 1 - i] = temp;
	        }

	        System.out.println("\nArray invertido:");
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	    }
	}


