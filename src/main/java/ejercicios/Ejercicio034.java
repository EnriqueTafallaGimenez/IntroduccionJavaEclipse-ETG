package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }
        int buscar = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número encontrado");
        } else {
            System.out.println("Número no encontrado");
        }
    } 
    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
    
}
