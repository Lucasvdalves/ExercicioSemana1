import java.util.Scanner;

public class CalculadoraReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o salário do funcionário
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double percentualAumento = 0;
        double salarioAntesReajuste = salario;

        // Calcula o percentual de aumento e o novo salário baseado nas faixas salariais
        if (salario <= 1200) {
            percentualAumento = 0.2; // 20%
        } else if (salario > 1200 && salario <= 1700) {
            percentualAumento = 0.15; // 15%
        } else if (salario > 1700 && salario <= 2500) {
            percentualAumento = 0.1; // 10%
        } else {
            percentualAumento = 0.05; // 5%
        }

        // Calcula o valor do aumento e o novo salário
        double valorAumento = salario * percentualAumento;
        double novoSalario = salario + valorAumento;

        // Exibe as informações na tela
        System.out.println("Salário antes do reajuste: R$ " + salarioAntesReajuste);
        System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);

        scanner.close();
    }
}
