package ejerciosArray;
import java.util.HashSet;
public class DuplicadosEnArray {
	

	    public static void main(String[] args) {
	        int[] numeros = {4, 2, 7, 4, 8, 2, 9, 7};
	        HashSet<Integer> elementos = new HashSet<>();
	        HashSet<Integer> duplicados = new HashSet<>();

	        for (int num : numeros) {
	            if (!elementos.add(num)) {
	                duplicados.add(num);
	            }
	        }

	        System.out.println("Números duplicados en el array: " + duplicados);
	    }
	}


