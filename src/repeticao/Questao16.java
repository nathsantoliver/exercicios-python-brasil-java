package repeticao;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Formula do Fibonacci: F(n) = F(n - 1) + F(n - 2)

        System.out.print("\nSequência Fibonacci: ");
        int ant = 0;
        int atual = ant + 1;
        int prox;

        do {
            System.out.print(ant + ", ");
            prox = ant + atual;
            ant = atual;
            atual = prox;
        } while (ant <= 500);

        System.out.print("...\n");

        scan.close();
    }
}
