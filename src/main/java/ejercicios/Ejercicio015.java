package ejercicios;

import java.util.Scanner;

public class Ejercicio015 {
	
	//COMPLETAR METODO
	public void mostrarMultiplosTres(int n) {
		 for (int i = 1; i <= n; i++) {
		        if (i % 3 == 0) {
		            System.out.println(i);
		        }
		    }
    }

    public static void main(String[] args) {
    	Ejercicio015 ejercicio015 = new Ejercicio015();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número N: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Introduce un número positivo.");
        } else {
        	ejercicio015.mostrarMultiplosTres(n);
        }
        
        scanner.close();
    }
}
