import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário seu sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Pergunta ao usuário seu nome
        System.out.print("Agora digite seu nome: ");
        String nome = scanner.nextLine();

        // Concatenação do nome completo
        String nomeCompleto = nome + " " + sobrenome;

        // Número de letras no nome completo
        int numeroDeLetras = nomeCompleto.replaceAll("\\s", "").length();

        // Exibição do nome completo e número de letras
        System.out.println("Seu nome completo é: " + nomeCompleto);
        System.out.println("O nome completo tem " + numeroDeLetras + " letras.");

        scanner.close();
    }
}
