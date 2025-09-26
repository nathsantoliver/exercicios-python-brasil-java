package decisao;

import java.util.Scanner;

//Faça um programa que leia três números e mostre o maior deles

public class Questao06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite 3 números: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número digitado é " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número digitado é " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O maior número digitado é " + num3);
        }

        scan.close();
    }
}
