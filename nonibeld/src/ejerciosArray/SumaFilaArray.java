package ejerciosArray;

public class SumaFilaArray {
	
	    public static void main(String[] args) {
	        int[][] matriz = {
	            {3, 5, 2},
	            {1, 4, 7},
	            {8, 9, 6}
	        };

	        for (int i = 0; i < matriz.length; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < matriz[i].length; j++) {
	                sumaFila += matriz[i][j];
	            }
	            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
	        }
	    }
	}


