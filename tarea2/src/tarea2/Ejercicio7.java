package tarea2;

import java.util.Scanner;

/**
 * 7. Escribe un programa Java que pregunte al usuario por un número entero y muestre por pantalla 
 * su tabla de multiplicar
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int num = sc.nextInt();
		int i = 0;
		while (i <= 10) {
			System.out.println(num + " * " + i + " = " + (num*i));
			i++;
		}
	}

}
