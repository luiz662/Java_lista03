package exerciciosLista3;
import java.util.Scanner;
public class Ex02 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Lê o valor do usuário
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Calcula o sucessor
	        int sucessor = numero + 1;

	        // Exibe o resultado
	        System.out.println("O sucessor de " + numero + " é: " + sucessor);

	        scanner.close();
	    }
}
