package decisao;

import java.util.Scanner;

public class Decisao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pedir ao usuário o valor da hora trabalhada (R$)
        System.out.print("Informe o valor da hora trabalhada: ");
        double valorHora = scan.nextDouble();

        // Pedir ao usuário a quantidade de horas trabalhadas no mês
        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();

        System.out.println();

        double salarioBruto = valorHora * horasTrabalhadas;

        // Fazer o cálculo do desconto do Imposto de Renda (5%)
        double ir = 0.00;
        String impostoRenda = "00";

        if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
            impostoRenda = "05";
            ir = salarioBruto * 0.05;
        } else if (salarioBruto > 1500.00 && salarioBruto <=2500.00) {
            impostoRenda = "10";
            ir = salarioBruto * 0.10;
        } else if (salarioBruto > 2500.00) {
            impostoRenda = "20";
            ir = salarioBruto * 0.20;
        }

        // Calcular o INSS (10%)
        double inss = salarioBruto * 0.10;

        // Calcular o FGTS (11%)
        double fgts = salarioBruto * 0.11;

        // Calcular o total de descontos
        double descontos = ir + inss;

        double salarioLiquido = salarioBruto - descontos;

        // Imprimir na tela as informações da folha de pagamento
        System.out.printf("|---------------------------------------|%n");
        System.out.printf("| Salário Bruto           : R$ %8.2f |%n", salarioBruto);
        System.out.printf("| (-) IR (%s%%)            : R$ %8.2f |%n", impostoRenda, ir);
        System.out.printf("| (-) INSS (10%%)          : R$ %8.2f |%n", inss);
        System.out.printf("| FGTS (11%%)              : R$ %8.2f |%n", fgts);
        System.out.printf("| Total de descontos      : R$ %8.2f |%n", descontos);
        System.out.printf("| Salário Líquido         : R$ %8.2f |%n", salarioLiquido);
        System.out.printf("|---------------------------------------|%n");

        scan.close();
    }
}
