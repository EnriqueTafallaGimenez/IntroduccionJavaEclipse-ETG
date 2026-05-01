package ejercicios;

import java.util.Scanner;

public class Ejercicio037 {
	
	//COMPLETAR METODO
	public void contarRepeticiones() {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            boolean yaContado = false;

            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    yaContado = true;
                    break;
                }
            }
            if (!yaContado) {
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;
                    }
                }
                System.out.println(numeros[i] + ": " + contador);
            }
        }
    } 
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}
