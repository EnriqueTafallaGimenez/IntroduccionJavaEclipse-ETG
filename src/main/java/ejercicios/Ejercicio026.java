package ejercicios;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
		Scanner scanner = new Scanner(System.in);
	    List<String> usuarios = new ArrayList<>();

	    while (true) {
	        String entrada = scanner.nextLine();

	        if (entrada.equalsIgnoreCase("fin")) {
	            break;
	        }

	        usuarios.add(entrada);
	    }

	    for (String u : usuarios) {
	        System.out.println(u);
	    }
	}

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
