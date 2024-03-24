package tarea2;

import java.util.Scanner;

/**
 * 9. Escribe un programa Java que pregunte al usuario por 10 números enteros y 
 * muestre por pantalla el número total de veces que el usuario ha introducido el 0, 
 * el número total de enteros mayores que 0 introducidos y el número total de enteros 
 * menores que 0 introducidos.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int contadorCero=0;
		int contadorMay=0;
		int contadorMen=0;
		int num=0;
		while (i < 10) {
			System.out.println("Dime un numeros");
			num = sc.nextInt();
			if (num == 0) {
				contadorCero ++;
			} else if (num > 0) {
				contadorMay ++;
			} else if (num < 0) {
				contadorMen++;
			}
			i++;
		}
		System.out.println("numero de 0 =" + contadorCero + " numero de enteros mayor a 0 = " + contadorMay
				+ " numeros menor a 0 = "+ contadorMen);
	}

}
