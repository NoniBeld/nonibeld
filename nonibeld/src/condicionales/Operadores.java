package condicionales;

public @interface Operadores {
/*	
	📌 Operadores en Condicionales if (Java)
		1. Operadores de Comparación
		Se usan para comparar valores y devuelven true o false.

		Operador	Descripción	Ejemplo
		==	Igual que	if (a == b)
		!=	Diferente de	if (a != b)
		>	Mayor que	if (a > b)
		<	Menor que	if (a < b)
		>=	Mayor o igual que	if (a >= b)
		<=	Menor o igual que	if (a <= b)
		Ejemplo:

		java
		Copy
		int edad = 18;
		if (edad >= 18) {
		    System.out.println("Mayor de edad");
		}
		2. Operadores Lógicos
		Permiten combinar múltiples condiciones.

		Operador	Descripción	Ejemplo
		&&	AND (y lógico)	if (a > 0 && b < 10)
		||	OR (o lógico)	if (a == 5 || b == 5)
		!	NOT (negación lógica)	if (!(a == b))
		Ejemplo:

		java
		Copy
		int edad = 20;
		boolean tieneLicencia = true;

		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puedes conducir");
		}
		3. Operador Ternario (? :)
		Es una forma abreviada de un if-else.

		Estructura:

		java
		Copy
		variable = (condición) ? valorSiTrue : valorSiFalse;
		Ejemplo:

		java
		Copy
		int numero = 10;
		String mensaje = (numero % 2 == 0) ? "Par" : "Impar";
		System.out.println(mensaje); // Salida: "Par"
		4. Operadores para Objetos (equals, instanceof)
		equals(): Compara el contenido de objetos (como String).

		java
		Copy
		String nombre = "Juan";
		if (nombre.equals("Juan")) {
		    System.out.println("Hola, Juan");
		}
		instanceof: Verifica si un objeto es de cierta clase.

		java
		Copy
		Object obj = "Hola";
		if (obj instanceof String) {
		    System.out.println("Es un String");
		}
		🚀 Ejemplo Avanzado (Combinando Operadores)
		java
		Copy
		int edad = 25;
		boolean esEstudiante = true;

		if ((edad >= 18 && edad <= 30) || esEstudiante) {
		    System.out.println("Tienes descuento juvenil");
		}
		¿Qué hace este código?

		Si la edad está entre 18 y 30 o si es estudiante, imprime el mensaje.*/

}
