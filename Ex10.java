package exerciciosLista3;
import java.util.Scanner;
public class Ex10 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada do custo de fábrica
	        System.out.print("Digite o custo de fábrica do carro: R$ ");
	        double custoFabrica = scanner.nextDouble();

	        // Percentuais fixos
	        double percentualDistribuidor = 0.28;
	        double percentualImpostos = 0.45;

	        // Cálculos
	        double valorDistribuidor = custoFabrica * percentualDistribuidor;
	        double valorImpostos = custoFabrica * percentualImpostos;
	        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

	        // Saída dos resultados
	        System.out.printf("O custo final ao consumidor é: R$ %.2f\n", custoFinal);

	        scanner.close();
	    }
}
