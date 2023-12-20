import java.util.Scanner;

public class CalculadoraProgressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor inicial e a raiz
        System.out.print("Digite o valor inicial (número inteiro): ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite a raiz (número inteiro): ");
        int raiz = scanner.nextInt();

        // Solicita ao usuário o tipo de progressão desejada
        System.out.print("Escolha o tipo de progressão (P.A. ou P.G.): ");
        scanner.nextLine(); // Limpa o buffer do scanner
        String tipoProgressao = scanner.nextLine().toLowerCase(); // Converte para minúsculas

        // Calcula e exibe a progressão escolhida
        switch (tipoProgressao) {
            case "pa":
                calcularPA(valorInicial, raiz);
                break;
            case "pg":
                calcularPG(valorInicial, raiz);
                break;
            default:
                System.out.println("Tipo de progressão inválido. Por favor, escolha P.A. ou P.G.");
        }

        scanner.close();
    }

    // Método para calcular e exibir uma Progressão Aritmética (P.A.)
    public static void calcularPA(int valorInicial, int raiz) {
        System.out.println("Progressão Aritmética (P.A.):");
        System.out.print(valorInicial + ", ");

        for (int i = 1; i < 10; i++) {
            valorInicial += raiz;
            System.out.print(valorInicial + ", ");
        }
    }

    // Método para calcular e exibir uma Progressão Geométrica (P.G.)
    public static void calcularPG(int valorInicial, int raiz) {
        System.out.println("Progressão Geométrica (P.G.):");
        System.out.print(valorInicial + ", ");

        for (int i = 1; i < 10; i++) {
            valorInicial *= raiz;
            System.out.print(valorInicial + ", ");
        }
    }
}
