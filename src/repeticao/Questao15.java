package repeticao;

import java.util.*;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Formula do Fibonacci: F(n) = F(n - 1) + F(n - 2)

        System.out.print("Defina um número limite para a série Fibonacci: ");
        int nesimo = scan.nextInt();
        int ant = 0;
        int atual = ant + 1;
        int prox = 0;

        System.out.println();

        for (int i = 0; i <= nesimo; i++) {
            System.out.print(ant + ", ");
            prox = ant + atual;
            ant = atual;
            atual = prox;
        }

        System.out.print("...");

        scan.close();
    }
}
