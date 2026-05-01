package ejercicios;

public class Ejercicio006 {
	
	//COMPLETAR METODO
	public String obtenerCalificacion(double nota) {
		if(nota < 5) {
			return "Insuficiente";
		}else if (nota == 5) {
			return "Suficiente";
		}else if (nota == 6) {
			return "Bien";
		}else if (nota == 7 || nota == 8) {
			return "Notable";
		} else {
			return "Sobresaliente";
		}
    }

    public static void main(String[] args) {
    	Ejercicio006 ejercicio006 = new Ejercicio006();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce una nota (0–10): ");
        double nota = scanner.nextDouble();

        String resultado = ejercicio006.obtenerCalificacion(nota);
        System.out.println(resultado);

        scanner.close();
    }
}
