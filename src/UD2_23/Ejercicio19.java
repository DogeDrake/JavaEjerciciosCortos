
/*
 *  Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 -
24, etc.
 */

package UD2_23;

public class Ejercicio19 {

	public static void main(String[] args) {
		int suma = 0;
		while (suma <= 500) {
			suma += 8;
			System.out.println(suma);
		}
	}
}
//Suma 8 a la variable "suma" y la escribe en consola cada vez, hasta que esta sea mayor que 500