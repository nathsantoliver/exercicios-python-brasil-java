package sequencial;

import java.util.Scanner;

public class Sequencia15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TODO 1: Perguntar quanto se ganha por horas
        System.out.println("Digite o quanto você ganha por hora?");
        double salarioPorHora = scan.nextDouble();

        // TODO 2: Perguntar as horas trabalhadas por mês
        System.out.println("Digite quantas horas você trabalhou no mês?");
        int horasTrabalhadas = scan.nextInt();

        System.out.println("*********************************************\n");

        // Calcular o total do salário a receber
        // Salario Bruto
        double salarioBruto = salarioPorHora * horasTrabalhadas;

        // IR (11%)
        double ir = salarioBruto * 0.11;

        // INSS (8%)
        double inss = salarioBruto * 0.08;

        // TSindicato (5%)
        double sindicato = salarioBruto * 0.05;

        double descontos = ir + inss + sindicato;

        // Salario liquido
        double salarioLiquido = salarioBruto - descontos;

        // Impressão dos dados
        System.out.printf("+ Salário Bruto:   $%.2f\n", salarioBruto);
        System.out.printf("- IR (11%%):        $%.2f\n", ir);
        System.out.printf("- INSS (8%%):       $%.2f\n", inss);
        System.out.printf("- Sindicato (5%%):  $%.2f\n", sindicato);
        System.out.printf("= Salário Líquido: $%.2f\n", salarioLiquido);

        scan.close();
    }
}
