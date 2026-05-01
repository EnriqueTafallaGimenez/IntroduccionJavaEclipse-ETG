package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {
	
	//COMPLETAR METODO
	public void calcularMediaArray() {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        // Leer números
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());
            suma += numeros[i];
        }

        double media = (double) suma / numeros.length;

        System.out.println("Media: " + media);
		
    }
    
    public static void main(String[] args) {
        Ejercicio035 ejercicio = new Ejercicio035();
        ejercicio.calcularMediaArray();
    }
}
