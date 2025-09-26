package sequencial;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao conversor Celsius para Fahrenheit!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em Graus Celsius: ");
        double c = scan.nextDouble();

        double fr = c * 1.8 + 32;

        System.out.printf("%.1fºC = ", c);
        System.out.printf("%.1fºF", fr);

        scan.close();
    }
}
