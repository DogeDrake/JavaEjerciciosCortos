
/*
 * Realizar un programa que pida cargar una fecha cualquiera, luego verificar si
dicha fecha corresponde a Navidad.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe en que dia estas: ");
		double x = in.nextDouble();
		System.out.println("Escribe que mes es: ");
		double y = in.nextDouble();
		if (x == 25 && y == 12) {
			System.out.println("Estas en Navidad");
		} else {
			System.out.println("No es navidad");
		}
	}
}
/*
 * El programa nos pide introducir el mes y el dia del mes y si el dia es 25 y
 * el mes el 12 el programa imprime en pantalla "Estas en navidad" en caso
 * contrario el programa imprime"No es navidad".
 */
