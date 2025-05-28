package exerciciosLista3;
import java.util.Scanner;
public class Ex11 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada de dados
	        System.out.print("Digite o salário fixo do vendedor: R$ ");
	        double salarioFixo = scanner.nextDouble();

	        System.out.print("Digite o número de carros vendidos: ");
	        int carrosVendidos = scanner.nextInt();

	        System.out.print("Digite o valor recebido por carro vendido: R$ ");
	        double valorPorCarro = scanner.nextDouble();

	        System.out.print("Digite o valor total das vendas: R$ ");
	        double totalVendas = scanner.nextDouble();

	        // Cálculos
	        double comissaoFixa = carrosVendidos * valorPorCarro;
	        double comissaoPercentual = totalVendas * 0.05;
	        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;

	        // Exibe o resultado
	        System.out.printf("O salário final do vendedor é: R$ %.2f\n", salarioFinal);

	        scanner.close();
	    }
}
