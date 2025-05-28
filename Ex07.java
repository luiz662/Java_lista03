package exerciciosLista3;
import java.util.Scanner;
public class Ex07 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita anos, meses e dias
	        System.out.print("Digite a idade em anos: ");
	        int anos = scanner.nextInt();

	        System.out.print("Digite os meses: ");
	        int meses = scanner.nextInt();

	        System.out.print("Digite os dias: ");
	        int dias = scanner.nextInt();

	        // Converte tudo para dias
	        int totalDias = anos * 365 + meses * 30 + dias;

	        // Exibe o resultado
	        System.out.println("A idade total em dias é: " + totalDias);

	        scanner.close();
	    }
}
