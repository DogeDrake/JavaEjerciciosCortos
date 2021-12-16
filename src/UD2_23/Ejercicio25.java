/*
 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma 
de los últimos 5 valores ingresados.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("Introduce un numero: ");
			num = in.nextInt();
			if (i > 5) {
				suma += num;
			}

		}
		System.out.println(suma);
	}
}
//Se pediran 10 numeros pero solo se tedran en cuenta los 5 ultimos para sumarlos y sacar el resultado