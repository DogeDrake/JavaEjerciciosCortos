
/*
 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar
un mensaje indicando si el número tiene uno o dos dígitos. (Tener en cuenta
que condición debe cumplirse para tener dos dígitos, un número entero
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Dime un numero de 1 o 2 digitos: ");
		String x = in.next();

		if (x.length() == 2) {
			System.out.println("El numero tiene 2 digitos");
		} else if (x.length() == 1) {
			System.out.println("El numero tiene 1 digito");
		} else {
			System.err.println("El numero tenia que tener un maximo de 2 digitos");
		}

	}
}
/*
 * nos pide que introduzcamos un numero a nuestra eleccion de 1 o 2 digitos y
 * posterior mente si el largo del numero introducido es igual a 2 imprime
 * "El numero de 1 o 2 digitos", en caso de que el largo sea 1
 * imprime"El numero tiene 1 digito" y en caso de no tener ni 1 ni 2 digitos el
 * programa devuelve "El numero tenia que tener un maximo de 2 digitos".
 */