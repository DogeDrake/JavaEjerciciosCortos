
/*
 * Confeccionar un programa que permita cargar un número entero positivo de
hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
Mostrar un mensaje de error si el número de cifras es mayor.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un numero de 1, 2 o 3 difras: ");
		String x = in.next();
		if (x.length() == 3) {
			System.out.println("El numero tiene 3 cifras");
		} else if (x.length() == 2) {
			System.out.println("El numero tiene 2 cifras");
		} else if (x.length() == 1) {
			System.out.println("El numero tiene 1 cifra");
		} else {
			System.err.println("El numero tiene mas de las cifras pedidas");
		}
	}
}
/*
 * El programa nos pide introducir un numero de 1,2 o 3 cifras y mediante
 * comparaciones el if determina el numero de cifras que tiene el numero
 * introducido pintandolo por pantalla.
 */