package tarea2;

import java.util.Scanner;

/**
 * 10. Escribe un programa Java que devuelva los N números de la Sucesión de Fibonacci 
 * (donde N es un número entero seleccionado por el usuario). Para realizar este ejercicio primero 
 * debes conocer qué es la Sucesión de Fibonacci y cómo funciona. Si consigues hacer este ejercicio, 
 * ¡eres un crack!
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 */
public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero para la serie fibonacci");
		int n = sc.nextInt();
		int i = 0;
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		if (n == 1) {
			System.out.println(n1);
		} else if(n == 2) {
			System.out.println(n2);
		} else {
			while (i < n - 1) {	
				//n1 vale 0 //n2 vale 1 //n3 vale la suma de n1 y n2
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;	
				i++;
			}
			System.out.println(n1);
		}
	}

}
