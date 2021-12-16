
/*
 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		while (num <= 10) {
			System.out.println("Escribe una nota: ");
			double x = in.nextDouble();
			if (x >= 7) {
				cont++;
			}
			num++;

		}
		System.out.println("Hay " + cont + " alumnos con notas mayores o iguales a 7");
	}
}
//Se introducen los valores de las notas de distintos alumnos
//Se calcula cuantos alumnos hay con notas >= a 7