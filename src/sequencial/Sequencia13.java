package sequencial;

import java.util.Scanner;

public class Sequencia13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu gênero (m - masculino e f - feminino): ");
        String genero = scan.nextLine();

        System.out.print("Digite a sua altura: ");
        double h = scan.nextDouble();

        double pesoIdeal;

        if (genero.equalsIgnoreCase("m")) {
           pesoIdeal = (72.7 * h) - 58;
           System.out.printf("O seu peso ideal é: %.2f", pesoIdeal);
        } else if (genero.equalsIgnoreCase("f")) {
           pesoIdeal = (62.1 * h) - 44.7;
           System.out.printf("O seu peso ideal é: %.2f", pesoIdeal);
        } else {
            System.out.println("O gênero digitado não existe!");
        }

        scan.close();
    }
}
