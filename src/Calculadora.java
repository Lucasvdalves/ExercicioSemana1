import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicita ao usuário que insira a operação desejada
        System.out.print("Escolha a operação (somar, subtrair, multiplicar ou dividir): ");
        scanner.nextLine(); // Limpa o buffer do scanner
        String operacao = scanner.nextLine().toLowerCase(); // Converte a operação para minúsculas

        double resultado = 0;

        // Realiza a operação escolhida
        switch (operacao) {
            case "somar":
                resultado = numero1 + numero2;
                break;
            case "subtrair":
                resultado = numero1 - numero2;
                break;
            case "multiplicar":
                resultado = numero1 * numero2;
                break;
            case "dividir":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return; // Encerra o programa se houver tentativa de divisão por zero
                }
                break;
            default:
                System.out.println("Operação inválida. Por favor, escolha somar, subtrair, multiplicar ou dividir.");
                return; // Encerra o programa se a operação for inválida
        }

        // Exibe o resultado da operação
        System.out.println("O resultado da operação " + operacao + " é: " + resultado);

        scanner.close();
    }
}
