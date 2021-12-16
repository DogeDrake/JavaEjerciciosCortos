/*
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
siguiente información: cantidad total de preguntas que se le realizaron y la
cantidad de preguntas que contestó correctamente. Se pide confeccionar un
programa que ingrese los dos datos por teclado e informe el nivel del mismo
según el porcentaje de respuestas correctas que ha obtenido
 */

package UD2_23;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Dime el numero de preguntas que se le hicieron: ");
		double x = in.nextDouble();
		System.out.println("Dime cuantas acertó: ");
		double y = in.nextDouble();

		double respuestas = (y / x);
		double porcent = respuestas * 100;
		System.out.printf("%.2f", porcent);
		System.out.print("%: ");
		if (respuestas < 0.5) {
			System.out.println("Fuera de nivel");
		} else if (respuestas > 0.5 && respuestas < 0.75) {
			System.out.println("Nivel Regular");
		} else if (respuestas > 0.75 && respuestas < 0.90) {
			System.out.println("Nivel Medio");
		} else {
			System.out.println("Nivel Maximo");
		}

	}
}
/*
 * el problema nos pide introducir el numero de preguntas que tenia el tes y el
 * numero de aciertos que obtuvo, una vez introducidos el programa calcula el
 * porcentaje de aciertos que obtuvo y dependiendo del porcentaje y gracias a un
 * else if asigna un nivel determinado imprimiendolo por pantalla.
 */