
/*
 * Escribir un programa que pida el lado de un cuadrado y lo imprima con * y sin 
relleno. De esta forma, si por ejemplo se introduce un 5
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio30 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("*");

		}
		System.out.println();
		for (int i = 0; i < num - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < num - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}
}
/*
 * Siempre se escribiran 2 lineas arriba y abajo y restando al numero dado estas
 * filas se haran filas horizontales divididas por espacios en blanco
 */