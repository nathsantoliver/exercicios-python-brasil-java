package repeticao;

import java.util.Scanner;

/*
    Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja
    inválido e continue pedindo até que o usuário informe um valor válido.
*/

public class Repeticao01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota;

        do {
            System.out.print("Informe a nota do Aluno: ");
            nota = scan.nextFloat();
        } while (nota >= 10.0);

        scan.close();
    }

}
