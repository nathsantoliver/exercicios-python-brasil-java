package listas;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas = new double[4];
        double sum = 0;

        System.out.print("Digite a primeira nota: ");
        notas[0] = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        notas[1] = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        notas[2] = scan.nextDouble();
        System.out.print("Digite a quarta nota: ");
        notas[3] = scan.nextDouble();

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d - %.2f%n", i, notas[i]);
            sum += notas[i];
        }

        double media = sum / notas.length;
        System.out.println(media);
    }
}
