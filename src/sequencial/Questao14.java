package sequencial;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {

        // Peso de peixes > 50kg -> multa de R$4,00/kg
        // Leia a variavel de peso (peso de peixes) e calcule o excesso
        Scanner scan = new Scanner(System.in);

        // Gravar na variavel 'peso' a quantidade de quilos de peixe
        System.out.print("Digite o peso (kg) de peixes: ");
        double peso = scan.nextDouble();

        System.out.println("***********************************\n");

        // Gravar na variavel 'excesso' a quantidade de quilos alem do limite
        double excesso = peso - 50.00;

        if (excesso >= 0) {
            // Gravar na variavel 'multa' o valor da multa que Joao devera pagar
            double multa = excesso * 4.00;

            // Imprima os dados do programa com as mensagens adequadas
            System.out.printf("Peso: %.2fkg\nExcesso: %.2fkg\nMulta: R$%.2f", peso, excesso, multa);
        } else {
            System.out.println("Você está no limite de peso exigido no Estado de São Paulo!");
        }

        scan.close();

    }
}
