package repeticao;

import java.util.Scanner;

/*
    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
    entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída
    deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 x 1 = 5
    5 x 2 = 10
    ...
    5 x 10 = 50
*/

public class Questao12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Declarando as variáveis
        int num, mult;
        int i = 1;

        System.out.println("Qual tabuada você deseja imprimir?");
        System.out.print("Digite um número de 1 a 10: ");
        num = scan.nextInt();

        //Primeiro Método
        /*
        do {
            mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
            i++;
        } while (i <= 10);
        */

        //Segundo Método
        for (i = 1; i <= 10; i++) {
            mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
        }
    }

}
