package sequencial;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TODO 1: Pedir o tamanho (em metros quadrados) da área a ser pintada [ 90m² ]
        System.out.print("Digite o tamanho, em metros quadrados, da área a ser pintada: ");
        double area = scan.nextDouble();

        System.out.println();
        // TODO 2: 1L de tinta -> 3m²
        double litrosTinta = area / 3;

        // TODO 3: Lata -> 18L -> R$80,00
        int qtdLata = (int) Math.ceil(litrosTinta / 18);
        double preco = qtdLata * 80.00;

        // TODO 4: Informe a quantidade de latas de tinta a serem compradas e o preço total
        System.out.printf("Quantidade de latas: %d\nPreço Total: %.2f", qtdLata, preco);

        scan.close();
    }
}
