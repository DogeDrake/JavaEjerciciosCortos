//Escribir un programa que pida el lado de un cuadrado y lo imprima con * y sin 
//relleno. De esta forma, si por ejemplo se introduce un 5

package UD2_23;

import java.util.Scanner;

public class Ejercicio31 {
	public static void main(String[] args) {
		int contneg = 0;
		int contpos = 0;
		int multi = 0;
		int pares = 0;
		for (int i = 0; i < 10; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			int num = in.nextInt();
			if (num != 0) {
				if (num < 0) {
					contneg++;
				} else {
					contpos++;
				}
				if (num % 15 == 0) {
					multi++;
				}
				if (num % 2 == 0) {
					pares++;
				}
			}
		}
		System.out.println("Numeros negativos: " + contneg);
		System.out.println("Numeros positivos: " + contpos);
		System.out.println("Numeros multiplos de 15: " + multi);
		System.out.println("Numeros pares: " + pares);
	}
}

/*
 * Se piden 10 numeros, segun se sumplan las condiciones se se aumentara un
 * contador o otro, luego se muestra el resultado obtenido por cada contador
 * 
 */
