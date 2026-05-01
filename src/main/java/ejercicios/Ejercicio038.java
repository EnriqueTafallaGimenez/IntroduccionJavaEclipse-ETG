package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio038 {
	// COMPLETAR METODO: Genera numero aleatorio 1-50
    public int generarNumeroSecreto() {
    	return new Random().nextInt(50) + 1;	
    }
    
    // COMPLETAR METODO: Compara intento con secreto y dice resultado
    public String comprobarIntento(int intento, int numeroSecreto) {
    	if (intento < numeroSecreto) {
            return "¡Más alto!";
        } else if (intento > numeroSecreto) {
            return "¡Más bajo!";
        } else {
            return "¡Correcto!";
        }
    }

    // COMPLETAR METODO: Funcion principal que usa ambos modulos
    public void adivinarNumero() {
    	 Scanner scanner = new Scanner(System.in);
         int numeroSecreto = generarNumeroSecreto();
         int intento;
         int contador = 0;

         do {
             intento = Integer.parseInt(scanner.nextLine());
             contador++;

             String resultado = comprobarIntento(intento, numeroSecreto);
             System.out.println(resultado);

         } while (intento != numeroSecreto);

         System.out.println("Intentos: " + contador);
     }
    
    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}
