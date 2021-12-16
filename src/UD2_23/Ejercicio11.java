
/*
 * Se ingresan por teclado tres números, si al menos uno de los valores ingresados
es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es
menor a diez".
 */






package UD2_23;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe un valor: ");
		double x = in.nextDouble();
		System.out.println("Escribe un segundo valor: ");
		double y = in.nextDouble();
		System.out.println("Escribe un tercer valor: ");
		double z = in.nextDouble();
		if (x < 10 || y < 10 || z < 10) {
			System.out.println("Alguno de los nuemros es menor a diez");
		}
	}
}
//Se pide al usuario introducir unos valores
//El If verifica si alguno es menor a 10
