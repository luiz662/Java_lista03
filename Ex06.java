package exerciciosLista3;
import java.util.Scanner;
public class Ex06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita o raio do círculo
	        System.out.print("Digite o raio do círculo: ");
	        double raio = scanner.nextDouble();

	        // Calcula a área do círculo: área = π * raio²
	        double area = Math.PI * Math.pow(raio, 2);

	        // Exibe o resultado
	        System.out.printf("A área do círculo é: %.2f\n", area);

	        scanner.close();
	    }
}
