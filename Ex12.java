package exerciciosLista3;
import java.util.Scanner;
public class Ex12 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada: temperatura em Fahrenheit
	        System.out.print("Digite a temperatura em graus Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();

	        // Conversão para Celsius
	        double celsius = (fahrenheit - 32) * 5 / 9;

	        // Exibição do resultado
	        System.out.printf("A temperatura em Celsius é: %.2f°C\n", celsius);

	        scanner.close();
	    }
}
