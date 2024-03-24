package tarea2;

import java.util.Scanner;

/**
 * 4. Escribe un programa Java que pregunte al usuario por 2 números, y te muestre por 
 * pantalla todos los números situados entre ambos
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int a = sc.nextInt();
		System.out.println("Dime otro numero");
		int b = sc.nextInt();
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}

}
