package tarea2;
/**
 * 5. Escribe un programa Java que muestre los números pares entre 0 y 100
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 100) {
			if (i %2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
