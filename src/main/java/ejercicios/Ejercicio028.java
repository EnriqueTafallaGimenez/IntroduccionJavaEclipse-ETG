package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
    public void cajeroAutomatico() {
    	  Scanner scanner = new Scanner(System.in);
    	    int opcion;

    	    do {
    	        opcion = Integer.parseInt(scanner.nextLine());

    	        switch (opcion) {
    	            case 1:
    	                consultarSaldo();
    	                break;
    	            case 2:
    	                ingresarDinero(scanner);
    	                break;
    	            case 3:
    	                retirarDinero(scanner);
    	                break;
    	            case 0:
    	                break;
    	        }
    	    } while (opcion != 0);        
    }
    
    //COMPLETAR METODO
    private void consultarSaldo() {
    	System.out.println("Saldo: " + saldo);
    }
    
    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
    	double cantidad = Double.parseDouble(scanner.nextLine());
        saldo += cantidad;
    }
    
    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
    	double cantidad = Double.parseDouble(scanner.nextLine());
        if (cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
