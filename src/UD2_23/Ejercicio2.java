/*
 * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
mostrar un mensaje "Promocionado".

 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Dime la primera nota: ");
		double x = in.nextInt();
		System.out.println("Dime la segunda nota: ");
		double y = in.nextInt();
		System.out.println("Dime la tarcera nota: ");
		double z = in.nextInt();
		double promedio = (x + y + z) / 3;
		if (promedio >= 7) {
			System.out.println("Promocionado");
		} else {
			System.out.println("No promocionado");
		}
	}
}

/*
 * nos piden que insertemos 3 notas, realizaremos la media entre ellas y
 * posterior mente si la nota media es igual o mayor de 7 el promagrama imprime
 * "Promocionado", en el caso contrario imprimira "No promocionado"
 * 
 */
