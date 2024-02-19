package sequencial;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        System.out.println("Vamos calcular o seu salário?");
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o valor que você recebe por hora: ");
        double salarioPorHora = scan.nextDouble();
        System.out.print("Informe o número de horas trabalhadas neste mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioMes = salarioPorHora * horasTrabalhadas;

        System.out.println("O seu salário este mês será de: $" + salarioMes);
    }
}
