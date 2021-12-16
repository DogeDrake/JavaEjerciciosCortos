
/*
 * Desarrollar un programa que permita cargar n números enteros y luego nos
informe cuántos valores fueron pares y cuántos impares.
Emplear el operador ?%? en la condición de la estructura condicional:
if (valor%2==0) //Si el if da verdadero luego es par
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Cuantos numeros quieres introducir: ");
		int veces = in.nextInt();
		int x = 0;
		int pares = 0;
		int inpares = 0;
		while (x < veces) {

			System.out.print("Escribe un numero: ");
			int num = in.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				inpares++;
			}
			x++;
		}
		System.out.println("Han aparecido " + pares + " pares y " + inpares + " inpares");
	}
}
//Introduces una cantidad de numeros y luego intruduces estos ultimos.
//Se separan entre impares y pares y se escriben en consola