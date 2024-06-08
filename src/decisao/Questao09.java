package decisao;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int maior, meio, menor;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }
        System.out.println(maior + " " + meio + " " + menor);
    }
}
