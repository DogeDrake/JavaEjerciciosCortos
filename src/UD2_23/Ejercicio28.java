
/*
 * Informar cuántos puntos se han ingresado en el primer, segundo, tercer y 
cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad 
de puntos a procesar
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String[] args) {
		int cuad1 = 0;
		int cuad2 = 0;
		int cuad3 = 0;
		int cuad4 = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Dime cuantos cuadrantes quieres tener en cuenta: ");
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("NUMERO " + (i + 1) + ": ");
			System.out.println("Introduce el punto x: ");
			int x = in.nextInt();
			System.out.println("Introduce el punto y: ");
			int y = in.nextInt();
			if (x > 0 && y > 0) {
				cuad1++;
			}
			if (x > 0 && y < 0) {
				cuad4++;
			}
			if (x < 0 && y > 0) {
				cuad2++;
			}
			if (x < 0 && y < 0) {
				cuad3++;
			}
		}
		System.out.println("Hay " + cuad1 + " en el primer cuadrante");
		System.out.println("Hay " + cuad2 + " en el segundo cuadrante");
		System.out.println("Hay " + cuad3 + " en el tercer cuadrante");
		System.out.println("Hay " + cuad4 + " en el cuarto cuadrante");

	}
}
/*
 * Se pediran los cuadrantes que se van a tener en cuenta, y despues se pediran
 * numeros en parejas segun el punto se sumara a un contador en que cuadrante
 * esta, y luego se mostrara al usuario
 */
