package sequencial;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao conversor Fahrenheit para Celsius!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em Graus Fahrenheit: ");
        double fr = scan.nextDouble();

        double c = 5 * ((fr - 32) / 9);

        System.out.printf("%.1fºF = ", fr);
        System.out.printf("%.1fºC", c);

        scan.close();
    }
}
