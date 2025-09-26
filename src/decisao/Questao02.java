package decisao;

import java.util.Scanner;

// Faça um programa que peça um valor e mostre na tela se ele é positivo ou negativo.

public class Questao02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor;
        System.out.print("Digite um número: ");
        valor = scan.nextInt();

        if (valor > 0) {
            System.out.println("O valor digitado é POSITIVO!");
        } else if (valor < 0) {
            System.out.println("O valor digitado é NEGATIVO!");
        } else {
            System.out.println("O valor digitado é ZERO!");
        }

        scan.close();
    }
}
