
/*
 * Se ingresan tres valores por teclado, si todos son iguales se imprime la suma
del primero con el segundo y a éste resultado se lo multiplica por el tercero.

 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un valor: ");
		double x = in.nextDouble();
		System.out.println("Escribe un segundo valor: ");
		double y = in.nextDouble();
		System.out.println("Escribe un tercer valor: ");
		double z = in.nextDouble();
		if (x == y && y == z) {
			double resultado = ((x + y) * z);
			System.out.println(resultado);
		}
	}
}
/*
 * el programa nos pide introducir 3 numero y mediante un if si los 3 numeros
 * son iguales se realiza una suma de los dos primeros y posteriormente
 * multiplican el resultado por el numero restante.
 */