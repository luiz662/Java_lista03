package exerciciosLista3;
import java.util.Scanner;
public class Ex01 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Lê o valor do usuário
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Calcula o antecessor
	        int antecessor = numero - 1;

	        // Mostra o resultado
	        System.out.println("O antecessor de " + numero + " é: " + antecessor);

	        scanner.close();
	    }
}
