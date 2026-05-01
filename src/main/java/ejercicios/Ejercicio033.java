package ejercicios;

import java.util.Scanner;

public class Ejercicio033 {
	
	//COMPLETAR METODO
	public void invertirArray() {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}
