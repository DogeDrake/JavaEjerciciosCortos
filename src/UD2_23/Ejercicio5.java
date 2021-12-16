/*
 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el
número es positivo, nulo o negativo
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int x = in.nextInt();
		if (x > 0) {
			System.out.println("El numero es positivo");
		} else if (x < 0) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es nulo");
		}
	}
}
/*
 * el programa nos pide introducir un numero , si el numero es mayor a 0 nos
 * devuelve
 * "El numero es positivo, si el numero es menor a 0 el programa nos devuelve "
 * El numero es negativo y si el numero el igual a 0 el programa devuelve
 * "El numero es nulo".
 */
