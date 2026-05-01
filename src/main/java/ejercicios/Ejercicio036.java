package ejercicios;

import java.util.Scanner;

public class Ejercicio036 {
	
	//COMPLETAR METODO
	public void comprobarPalindromo() {
		Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        texto = texto.replaceAll("\\s+", "").toLowerCase();

        String invertido = "";


        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        if (texto.equals(invertido)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
    
}
