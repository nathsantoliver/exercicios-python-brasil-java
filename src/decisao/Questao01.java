package decisao;

import java.util.Scanner;

// Faça um Programa que peça dois números e imprima o maior deles.

public class Questao01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite dois números inteiros: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O número maior é " + num1);
        } else {
            System.out.println("O número maior é " + num2);
        }

    }
}