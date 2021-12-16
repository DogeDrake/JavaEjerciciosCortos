/*
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura
promedio de las personas.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double y, z = 0;
		double x = 0;
		System.out.println("Cuantas alturas va a intrudcir: ");
		double num = in.nextDouble();
		while (x < num) {
			System.out.println("Diga las alturas: ");
			y = in.nextDouble();
			z = z + y;
			x++;
		}
		y = z / num;
		System.out.println("La media de altruas es: " + y);
	}
}
//Introduce un dato principal por el cual luego tienes que introducir mas o menos datos
//Calcula la media de las alturas