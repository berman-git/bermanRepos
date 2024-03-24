package tarea2;
/**
 * 3. Escribe un programa Java que te muestre únicamente la suma de los números enteros entre 50 y 100 
 * (ambos incluidos)
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int i = 50;
		int aux=0;
		while (i <= 100) {
				aux = aux + i;
			i++;
		}
		System.out.println(aux);
	}

}
