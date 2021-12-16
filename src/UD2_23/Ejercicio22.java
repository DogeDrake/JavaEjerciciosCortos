
/*
 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta
ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o
menor a cero.

 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		int s = 0;
		int num = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Ingrese Valores, si escribe 9999 se parará el programa: ");
			num = in.nextInt();
			if (num != 9999) {
				s = s + num;
			} else {
				System.out.println(s);
			}
		} while (num != 9999);

	}
}
//ingresa los valores que quieras hasta que introduzcas el numero 9999, lo que causara la pausa del programa