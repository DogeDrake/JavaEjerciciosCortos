/*Realizar un programa que lea por teclado dos números, si el primero es mayor
al segundo informar su suma y diferencia, en caso contrario informar el
producto y la división del primero respecto al segundo.
 */
package UD2_23;

import java.util.Scanner;

public class Ejericicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Dime un primer numero: ");
		double x = in.nextInt();
		System.out.println("Dime un segundo numero: ");
		double y = in.nextInt();
		if (x > y) {
			double suma = x + y;
			double diferencia = x - y;
			System.out.println("La suma es " + suma + " y la difernecia es " + diferencia);

		} else {
			double producto = x * y;
			double division = x / y;
			System.out.println("El producto es " + producto + " y la division es " + division);
		}
	}
}
/*
 * para comenzar nos preguntan dos numeros y dependiendo de cual sea el mayor va
 * a realizar unas operaciones u otras. Si el primer numero es mayor sse
 * realizara la suma y la resta de ambos, en el caso contrario se realizara la
 * multiplicacion y la division.
 */
