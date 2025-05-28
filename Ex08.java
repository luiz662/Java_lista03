package exerciciosLista3;
import java.util.Scanner;
public class Ex08 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada de dados
	        System.out.print("Digite o número total de eleitores: ");
	        int totalEleitores = scanner.nextInt();

	        System.out.print("Digite o número de votos brancos: ");
	        int votosBrancos = scanner.nextInt();

	        System.out.print("Digite o número de votos nulos: ");
	        int votosNulos = scanner.nextInt();

	        System.out.print("Digite o número de votos válidos: ");
	        int votosValidos = scanner.nextInt();

	        // Verificação simples para evitar divisão por zero e dados inconsistentes
	        if (totalEleitores <= 0) {
	            System.out.println("O número total de eleitores deve ser maior que zero.");
	        } else if (votosBrancos + votosNulos + votosValidos > totalEleitores) {
	            System.out.println("A soma dos votos brancos, nulos e válidos não pode ser maior que o total de eleitores.");
	        } else {
	            // Cálculo dos percentuais
	            double percBrancos = (votosBrancos * 100.0) / totalEleitores;
	            double percNulos = (votosNulos * 100.0) / totalEleitores;
	            double percValidos = (votosValidos * 100.0) / totalEleitores;

	            // Exibição dos resultados
	            System.out.printf("Percentual de votos brancos: %.2f%%\n", percBrancos);
	            System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
	            System.out.printf("Percentual de votos válidos: %.2f%%\n", percValidos);
	        }

	        scanner.close();
	    }
}
