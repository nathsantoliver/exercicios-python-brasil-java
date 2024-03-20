package sequencial;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double num3 = scan.nextDouble();

        // produto do dobro do primeiro com metade do segundo
        double a = (num1 * 2) * ((double) num2 / 2);
        // a soma do triplo do primeiro com o terceiro
        double b = (num1 * 3) + num3;
        // o terceiro elevado ao cubo
        double c = Math.pow(num3, 3.0);     // ou double c = num3 * num3 * num3;

        System.out.println(a + "\n" + b + "\n" + c);

        scan.close();
    }
}
