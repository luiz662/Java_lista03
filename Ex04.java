package exerciciosLista3;
import java.util.Scanner;
public class Ex04 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita a base do triângulo
	        System.out.print("Digite a base do triângulo: ");
	        double base = scanner.nextDouble();

	        // Solicita a altura do triângulo
	        System.out.print("Digite a altura do triângulo: ");
	        double altura = scanner.nextDouble();

	        // Calcula a área do triângulo
	        double area = (base * altura) / 2;

	        // Exibe o resultado
	        System.out.println("A área do triângulo é: " + area);

	        scanner.close();
	    }
}
