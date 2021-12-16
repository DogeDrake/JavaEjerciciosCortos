//Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos 
//muestre la tabla de multiplicar del mismo (los primeros 12 términos)
//Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 
//36.
//muestre la tabla de multiplicar del mismo (los primeros 12 términos)
//Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 
//36.
//

package UD2_23;

import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = in.nextInt();
		for (int i = 1; i <= 12; i++) {
			int multi = num * i;
			System.out.println(multi);
		}
	}
}

//Igual que el ejercicio 26, pero en vez de ser 10 vueltas son 12
