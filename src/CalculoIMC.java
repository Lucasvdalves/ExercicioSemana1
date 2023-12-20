import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite sua altura
        System.out.print("Digite sua altura (em metros, use ponto para separar casas decimais): ");
        double altura = scanner.nextDouble();

        // Solicita ao usuário que digite seu peso
        System.out.print("Digite seu peso (em quilogramas): ");
        double peso = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o resultado do IMC
        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }
}
