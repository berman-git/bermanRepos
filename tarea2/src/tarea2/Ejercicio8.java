package tarea2;

import java.util.Scanner;

/**
 * 8. Escribe un programa Java que pregunte al usuario por 10 números enteros y muestre por pantalla el 
 * número mayor y el menor de todos los introducidos

 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =0;
		int num =0;
		int mayor=0;
		int menor=0;
		while (i < 10) {
			System.out.println("Dime 10 numeros enteros");
			num = sc.nextInt();
			if(i == 0) {
				mayor = num;
				menor = num;
			}
			if (num > mayor) {
				mayor = num;
			} else if(num < menor){
				menor = num;
			}
			i++;
		}
		System.out.println("El menor es: "+ menor + " el mayor es: "+ mayor);
	}

}
