package listas;

import java.util.Scanner;

public class Lista06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        // Pedir 4 notas de 10 alunos
        float[][] notas = new float[10][4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("  Nota " + (j + 1) + ": ");
                notas[i][j] = scan.nextFloat();
            }
        }

        // Calcular a media e armazenar a media de cada aluno em um vetor
        float[] medias = new float[10];
        for (int i = 0; i < notas.length; i++) {
            float soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / notas[i].length;
        }

        // Imprimir o numero de alunos com media acima ou igual a 7.0
        for (float media : medias) {
            if (media >= 7.0) {
                count++;
            }
        }

        System.out.println("Numero de alunos com media acima ou igual a 7.0: " + count);

    }
}
