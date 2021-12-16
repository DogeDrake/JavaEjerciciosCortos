
/*
 * Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
(No se ingresan valores por teclado)
 */

package UD2_23;

public class Ejercicio18 {
	public static void main(String[] args) {
		int num = 0;
		int suma = 0;
		while (num < 25) {
			suma += 11;
			num++;
			System.out.println(suma);
		}
	}
}

//Suma continuamente 11 a la variable "suma" y 1 a la variable "num" hasta que "num" llegue 25
//asi veremos una serie de numeros desde 11 hasta 275