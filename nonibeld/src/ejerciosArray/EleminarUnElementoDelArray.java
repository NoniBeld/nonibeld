package ejerciosArray;
import java.util.Scanner;

public class EleminarUnElementoDelArray {

	    public static void main(String[] args) {
	        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el número a eliminar: ");
	        int numEliminar = scanner.nextInt();

	        int contador = 0;
	        for (int num : numeros) {
	            if (num != numEliminar) {
	                contador++;
	            }
	        }

	        int[] nuevoArray = new int[contador];
	        int index = 0;

	        for (int num : numeros) {
	            if (num != numEliminar) {
	                nuevoArray[index] = num;
	                index++;
	            }
	        }

	        System.out.println("Array después de eliminar " + numEliminar + ": ");
	        for (int num : nuevoArray) {
	            System.out.print(num + " ");
	        }
	    }
	}

