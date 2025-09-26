package repeticao;

import java.util.Scanner;

public class Repeticao05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double popA, popB, crescA, crescB;

        String again;
        String outraVez = "s";

        do {
            System.out.println("Digite o número de habitantes do País A: ");
            popA = input.nextDouble();
            System.out.println("Digite a taxa de crescimento do País A: ");
            crescA = input.nextDouble();
            System.out.println("Digite o número de habitantes do País B: ");
            popB = input.nextDouble();
            System.out.println("Digite a taxa de crescimento do País B: ");
            crescB = input.nextDouble();

            popA += (popA * crescA);
            popB += (popB * crescB);

            System.out.printf(
                    "%nPaís A tem %.2f de habitantes.%nPaís B tem %.2f de habitantes.",
                    popA, popB);

            input.nextLine();

            System.out.println("\nSe deseja continuar, digite s?");
            again = input.nextLine();
        } while (outraVez.equalsIgnoreCase(again));

        System.out.println("Encerrando Programa!");

        input.close();
    }
}
