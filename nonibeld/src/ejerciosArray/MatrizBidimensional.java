package ejerciosArray;

public class MatrizBidimensional {

	
	    public static void main(String[] args) {
	        int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Recorremos la matriz con bucles anidados
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();  // Salto de línea al final de cada fila
	        }
	    }
	}


