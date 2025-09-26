package repeticao;

import java.util.Scanner;

public class Repeticao13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero da base: ");
        int base = scan.nextInt();  // 4
        System.out.print("Digite o numero do expoente: ");
        int exp = scan.nextInt();   // 2   -   3

        int calc = base;   // 8   - 64

        for (int i = 1; i < exp; i++) {
            calc = calc * base;
        }

        System.out.println("\n\nResultado de " + base + " elevado a " + exp + ": " + calc);

        scan.close();
    }
}
