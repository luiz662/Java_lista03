package exerciciosLista3;
import java.util.Scanner;
public class Ex09 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita o salário atual
	        System.out.print("Digite o salário mensal atual: ");
	        double salarioAtual = scanner.nextDouble();

	        // Solicita o percentual de reajuste
	        System.out.print("Digite o percentual de reajuste (%): ");
	        double percentual = scanner.nextDouble();

	        // Calcula o novo salário
	        double novoSalario = salarioAtual + (salarioAtual * percentual / 100);

	        // Exibe o resultado
	        System.out.printf("O novo salário após reajuste é: R$ %.2f\n", novoSalario);

	        scanner.close();
	    }
}
