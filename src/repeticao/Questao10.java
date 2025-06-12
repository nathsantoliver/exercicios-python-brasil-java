package repeticao;

import java.util.Scanner;

// Faça um programa que receba 2 números inteiros e gere os números inteiros
// que estão no intervalo compreendido por eles.
public class Questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("***********************");
        if (x < y) {
            System.out.printf("Os números entre %d e %d são: ", x, y);
            for (x += 1; x < y; x++) {
                System.out.print(x + " ");
            }
        } else if (x > y) {
            System.out.printf("Os números entre %d e %d são: ", x, y);
            for (x -= 1; x > y; x--) {
                System.out.print(x + " ");
            }
        } else {
            System.out.print("Os números são iguais!");
        }

        System.out.println("\n***********************");

        scan.close();
    }
}
