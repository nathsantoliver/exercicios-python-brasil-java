package sequencial;

import java.util.Scanner;

public class Sequencia12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();

        // calculo do peso ideal
        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("O seu peso ideal é de %.2f", pesoIdeal);

        scan.close();
    }
}
