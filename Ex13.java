package exerciciosLista3;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das três notas
        System.out.print("Digite a primeira nota (peso 2): ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (peso 3): ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (peso 5): ");
        double n3 = scanner.nextDouble();

        // Cálculo da média ponderada
        double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        // Exibição do resultado
        System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);

        scanner.close();
    }
}
