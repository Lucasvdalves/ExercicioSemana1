import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as notas
        System.out.println("Digite suas notas do semestre:");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média final
        double mediaFinal = (nota1 + nota2 + nota3) / 3;

        // Exibe a média final com 2 casas decimais
        System.out.printf("Sua média final é: %.2f%n", mediaFinal);

        scanner.close();
    }
}
