package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {
	
	//COMPLETAR METODO
	public void procesarNumeros() {
		Scanner scanner = new Scanner(System.in);

	    int suma = 0;
	    int positivos = 0;
	    int negativos = 0;

	    while (scanner.hasNextLine()) {
	        int numero = Integer.parseInt(scanner.nextLine());

	        if (numero == 0) break;

	        if (numero > 0) {
	            positivos++;
	        } else {
	            negativos++;
	        }

	        suma += numero;
	    }

	    System.out.println("Suma: " + suma);
	    System.out.println("Positivos: " + positivos);
	    System.out.println("Negativos: " + negativos);
	}
    
    public static void main(String[] args) {
    	Ejercicio030 ejercicio030 = new Ejercicio030();
    	ejercicio030.procesarNumeros();
    }
    
}
