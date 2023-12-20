public class AdivinharNumero import java.util.Scanner;
        import java.util.Random;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pergunta ao usuário para adivinhar o número
        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando.");
        System.out.print("Insira um número entre 1 e 5: ");
        int numeroUsuario = scanner.nextInt();

        // Gera aleatoriamente um número entre 1 e 5
        int numeroAleatorio = random.nextInt(5) + 1;

        // Verifica se o número gerado é igual ao número inserido pelo usuário
        if (numeroUsuario >= 1 && numeroUsuario <= 5) {
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou, o número correto era " + numeroAleatorio);
            }
        } else {
            System.out.println("Por favor, insira um número entre 1 e 5.");
        }

        scanner.close();
    }
}
{
}
