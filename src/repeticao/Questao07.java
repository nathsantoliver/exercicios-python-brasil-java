package repeticao;

import java.util.Scanner;

// Faça um programa que laia 5 números e informe o maior número
public class Questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, maior = 0;

        System.out.println("Digite 5 números: ");
        for (int i = 1; i <= 5; i++) {
            numero = scan.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("******************");
        System.out.println("Maior numero digitado: " + maior);

        scan.close();
    }
}
