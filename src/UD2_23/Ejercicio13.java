
/*
 * De un operario se conoce su sueldo y los años de antigüedad. Se pide
confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años,
otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años,
otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca el suelto: ");
		double x = in.nextDouble();
		System.out.println("Introduzca su antiguedad: ");
		double y = in.nextDouble();
		if (x < 500 && y >= 10) {
			double aument = x + (x * 0.2);
			System.out.println("El sueldo a pagar ahora sera de " + aument);
		} else if (x < 500 && y < 10) {
			double aument2 = x + (x * 0.05);
			System.out.println("El sueldo a pagar ahora sera de " + aument2);
		} else if (x >= 500) {
			System.out.println("El sueldo es de " + x);
		}
	}
}
//Se pide al usuario introducir unos valores
//Se calcula el sueldo dependiendo de los valores introducidos anteriormente