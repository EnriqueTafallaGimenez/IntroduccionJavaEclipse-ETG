package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {
	
	//COMPLETAR METODO
	public void contarParesArray() {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());

            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }
        
    }
    
    public static void main(String[] args) {
        Ejercicio032 ejercicio = new Ejercicio032();
        ejercicio.contarParesArray();
    }
    
}
