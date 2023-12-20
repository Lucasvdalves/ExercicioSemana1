import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class VerificarIdadeParaVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a data de nascimento ao usuário
        System.out.println("Digite sua data de nascimento no formato AAAA-MM-DD:");
        System.out.print("Data de Nascimento: ");
        String dataNascimentoString = scanner.nextLine();

        try {
            // Converte a entrada do usuário para um objeto LocalDate
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoString);

            // Obtém a data atual
            LocalDate dataAtual = LocalDate.now();

            // Calcula a diferença entre a data atual e a data de nascimento para obter a idade
            int idade = dataAtual.getYear() - dataNascimento.getYear();

            // Verifica a situação de voto de acordo com a idade
            if (idade < 16) {
                System.out.println("Voto proibido. Você tem menos de 16 anos.");
            } else if (idade >= 16 && idade <= 17 || idade >= 60) {
                System.out.println("Voto opcional. Sua idade é: " + idade + " anos.");
            } else {
                System.out.println("Voto obrigatório. Sua idade é: " + idade + " anos.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido. Use o formato AAAA-MM-DD.");
        }

        scanner.close();
    }
}
