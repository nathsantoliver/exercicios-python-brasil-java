package decisao;

import java.util.Scanner;

/*  Faça um programa para a leitura de duas notas parciais de um aluno.
    O programa deve calcular a média alcançada por aluno e apresentar:
        - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete(7);
        - A mensagem "Reprovado", se a média for menor do que sete(7);
        - A mensagem "Aprovado com Distinção", se a média for igual a dez(10)
*/

public class Questao05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Digite a Nota 1: ");
        nota1 = scan.nextDouble();
        System.out.print("Digite a Nota 2: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;
        if (media >= 7 && media < 10) {
            System.out.println("Sua média é "+ media + " - Você foi APROVADO");
        } else if (media < 7) {
            System.out.println("Sua média é "+ media + " - Você foi REPROVADO");
        } else if (media == 10) {
            System.out.println("Sua média é "+ media + " - Você foi APROVADO COM DISTINÇÃO");
        }

    }
}
