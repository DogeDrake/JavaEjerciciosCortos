/*
 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma 
de los últimos 5 valores ingresados.
 */

package UD2_23;

public class Ejercicio26 {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= 10; i++) {
			int multi = num * i;
			System.out.println(multi);
		}
	}
}
/*
 * Basicamente ira dando vueltas al for (10 veces) multiplicando el numero
 * resultado *5, asi llegar al 50
 */