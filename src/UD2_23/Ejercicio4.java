
/*
 * el programa nos pide introducir 3 numeros y mediante un if los compara y devuelve el numero que es mayor.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Dime un primer numero: ");
		int x = in.nextInt();
		System.out.println("Dime un segundo numero: ");
		int y = in.nextInt();
		System.out.println("Dime un segundo numero: ");
		int z = in.nextInt();

		if (x > y && x > z) {
			System.out.println(x + " es el mayor");
		} else if (y > x && y > z) {
			System.out.println(y + "es mayor");
		} else if (z > x && z > y) {
			System.out.println(z + " es el mayor");
		} else {
			System.out.println("Los 3 numeros son iguales");
		}
	}
}
/*
 * el programa nos pide introducir 3 numeros y mediante un if los compara y
 * devuelve el numero que es mayor.
 */