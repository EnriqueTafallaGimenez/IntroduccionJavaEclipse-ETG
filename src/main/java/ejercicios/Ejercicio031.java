package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {
	
	//COMPLETAR METODO
	public void sumarElementosArray() {
		Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5]; 
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());
            suma += numeros[i];
        }

        System.out.println("Suma: " + suma);
        
    }
    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}
