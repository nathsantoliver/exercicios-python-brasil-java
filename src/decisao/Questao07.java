package decisao;

import java.util.Scanner;

//  Faça um programa que leia três números e mostre o maior e o menor deles.

public class Questao07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite três números!");
        System.out.print("Primeiro Número: ");
        num1 = scan.nextInt();
        System.out.print("Segundo Número: ");
        num2 = scan.nextInt();
        System.out.print("Terceiro Número: ");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 < num3) {
                System.out.println(num1 + " é maior \n" + num2 + " é menor");
            } else {
                System.out.println(num1 + " é maior \n" + num3 + " é menor");
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 < num3) {
                System.out.println(num2 + " é maior \n" + num1 + " é menor");
            } else {
                System.out.println(num2 + " é maior \n" + num3 + " é menor");
            }
        } else {
            if (num1 < num2) {
                System.out.println(num3 + " é maior \n" + num1 + " é menor");
            } else {
                System.out.println(num3 + " é maior \n" + num2 + " é menor");
            }
        }

        scan.close();
    }
}
