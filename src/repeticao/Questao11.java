package repeticao;

import java.util.Scanner;

// Altere o programa anterior para mostrar a soma dos números;
public class Questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int soma = 0;

        System.out.println("***********************************");
        if (x < y) {
            soma = x;
            System.out.printf("Os números entre %d e %d são: ", x, y);
            for (x += 1; x < y; x++) {
                System.out.print(x + " ");
                soma += x;
            }
            soma += y;
            System.out.printf("%n%nA soma dos números é: %d", soma);
        } else if (x > y) {
            soma = x;
            System.out.printf("Os números entre %d e %d são: ", x, y);
            for (x -= 1; x > y; x--) {
                System.out.print(x + " ");
                soma += x;
            }
            soma += y;
            System.out.printf("%n%nA soma dos números é: %d", soma);
        } else {
            System.out.print("Os números são iguais!");
            soma = x + y;
            System.out.printf("%n%nA soma dos números é: %d", soma);
        }

        System.out.println("\n***********************************");

        scan.close();
    }
}
