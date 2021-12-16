
/*
 *  En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
$500, realizar un programa que lea los sueldos que cobra cada empleado e
informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de
$300. Además el programa deberá informar el importe que gasta la empresa en
sueldos al personal.
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		int x = 0, z = 0;
		int s = 1;
		int contMas = 0;
		int contMenos = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba el numero de empleados: ");
		int empleados = in.nextInt();
		while (x < empleados) {
			System.out.println("Escriba cuanto cobra el empleado " + s + ": ");
			int sueldo = in.nextInt();
			if (sueldo >= 100 && sueldo <= 300) {
				contMenos++;
			} else if (sueldo > 300) {
				contMas++;
			}
			z = z + sueldo;
			x++;
			s++;
		}
		System.out.println(contMenos + " cobran menos de 300 y " + contMas + " cobran mas de 300");
		System.out.println("La emperda paga " + z);
	}
}
//Introduce el numero de empleados y los sueldos
//Se separa en cuantos cobran menos de 300 y mas de 300