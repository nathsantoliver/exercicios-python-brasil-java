package sequencial;

import java.util.Scanner;

public class Sequencia03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Digite o numero 1: ");

        numero1 = scan.nextInt();

        System.out.println("Digite o numero 2: ");

        numero2 = scan.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma dos dois numeros digitados é: " + soma);

        scan.close();
    }
}
