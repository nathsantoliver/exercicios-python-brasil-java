package repeticao;

import java.util.Scanner;

// Faça um programa que leia 5 números e informe a soma e a média dos números.
public class Questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma = 0, media = 0;

        System.out.println("Digite 5 números: ");
        for (int i = 1; i <= 5; i++) {
            numero = scan.nextInt();
            soma += numero;
            media = soma / i;
        }

        System.out.println("******************");
        System.out.println("Soma dos 5 numeros digitados: " + soma);
        System.out.println("A media dos 5 numeros digitados: " + media);

        scan.close();
    }
}
