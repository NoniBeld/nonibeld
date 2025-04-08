package condicionales;

public class Condicionales {

	  public static void main(String[] args) {
	        int edad = 18;

	        if (edad >= 18) {
	            System.out.println("Eres mayor de edad.");
	        }
	        

	        //------------------------------------------------------------------	        
	        
	        int numero = 10;

	        if (numero % 2 == 0) {
	            System.out.println("El número es par.");
	        } else {
	            System.out.println("El número es impar.");
	        }

	        
	        //------------------------------------------------------------------	        
	
	        int nota = 85;

	        if (nota >= 90) {
	            System.out.println("Excelente (A)");
	        } else if (nota >= 80) {
	            System.out.println("Bueno (B)");
	        } else if (nota >= 70) {
	            System.out.println("Regular (C)");
	        } else {
	            System.out.println("Reprobado (F)");
	        }
	        
	        
	        //------------------------------------------------------------------	        
	        
	        
	        int edad1 = 17;
	        boolean tienePermiso = true;

	        if (edad1 >= 18) {
	            System.out.println("Puedes entrar.");
	        } else {
	            if (tienePermiso) {
	                System.out.println("Puedes entrar con permiso.");
	            } else {
	                System.out.println("No puedes entrar.");
	            }
	        }
	        
	        
	        
	        //------------------------------------------------------------------	        
	        
	        
	        int numero1 = 7;
	        String resultado = (numero1 % 2 == 0) ? "par" : "impar";
	        System.out.println("El número es " + resultado);
	        
	        
	        //------------------------------------------------------------------	        

	        
	        
	        
	        
	        String dia = "Lunes";

	        switch (dia) {
	            case "Lunes":
	                System.out.println("Inicio de semana");
	                break;
	            case "Viernes":
	                System.out.println("¡Fin de semana cerca!");
	                break;
	            default:
	                System.out.println("Día normal");
	        }
	        
	        
	        //------------------------------------------------------------------	        
	        
	        
	        String lenguaje = "Java";

	        if (lenguaje.equals("Java")) {
	            System.out.println("¡Es Java!");
	        } else {
	            System.out.println("No es Java.");
	        }
	        
	        
	        
	        
	    }
	}