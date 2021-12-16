
/*
 * Se ingresan por teclado tres números, si todos los valores ingresados son
menores a 10, imprimir en pantalla la leyenda "Todos los números son menores
a diez".
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un valor: ");
		double x = in.nextDouble();
		System.out.println("Escribe un segundo valor: ");
		double y = in.nextDouble();
		System.out.println("Escribe un tercer valor: ");
		double z = in.nextDouble();
		if (x < 10 && y < 10 && z < 10) {
			System.out.println("Todos los numeros son menores a diez");
		}
	}
}
/*
 * el programa nos pide que introduzcamos 3 valores y solo en el caso de que
 * todos los numeros sean menores a diez el programa devolvera por pantalla
 * "Todos los numeros son menores a 10".
 */