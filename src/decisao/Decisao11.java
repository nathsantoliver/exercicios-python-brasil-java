package decisao;

import java.util.Scanner;

public class Decisao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem Vindo(a) as Organizações Tabajara!");
        System.out.print("Digite o salário do colaborador: ");
        double salario = scan.nextDouble();
        double reajuste, salReajustado;

        if (salario <= 280.00) {
            reajuste = salario * 0.20;
            salReajustado = salario + reajuste;

            System.out.printf("Salario antes do reajuste: R$%.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 20%");
            System.out.printf("\nValor do aumento: R$%.2f", reajuste);
            System.out.printf("\nSalario com reajuste: R$%.2f", salReajustado);
        } else if (salario > 280.00 && salario <= 700.00) {
            reajuste = salario * 0.15;
            salReajustado = salario + reajuste;

            System.out.printf("Salario antes do reajuste: R$%.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 15%");
            System.out.printf("\nValor do aumento: R$%.2f", reajuste);
            System.out.printf("\nSalario com reajuste: R$%.2f", salReajustado);
        } else if (salario > 700.00 && salario <= 1500.00) {
            reajuste = salario * 0.10;
            salReajustado = salario + reajuste;

            System.out.printf("Salario antes do reajuste: R$%.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 10%");
            System.out.printf("\nValor do aumento: R$%.2f", reajuste);
            System.out.printf("\nSalario com reajuste: R$%.2f", salReajustado);
        } else if (salario > 1500.00) {
            reajuste = salario * 0.05;
            salReajustado = salario + reajuste;

            System.out.printf("Salario antes do reajuste: R$%.2f%n", salario);
            System.out.println("Percentual de aumento aplicado: 5%");
            System.out.printf("\nValor do aumento: R$%.2f", reajuste);
            System.out.printf("\nSalario com reajuste: R$%.2f", salReajustado);
        }
        scan.close();
    }
}
