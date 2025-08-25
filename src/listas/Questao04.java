package listas;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] vetorCaracteres = new char[10];
        int contadorConsoantes = 0;

        System.out.println("Digite 10 caracteres:");

        // Laço para ler os caracteres e preencher o vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            vetorCaracteres[i] = scanner.next().charAt(0);
        }

        // Laço para contar as consoantes e imprimi-las
        System.out.println("\nConsoantes encontradas:");
        for (int i = 0; i < 10; i++) {
            char caractere = Character.toLowerCase(vetorCaracteres[i]); // Converte para minúscula para facilitar a verificação

            // Verifica se o caractere é uma letra e não é uma vogal
            if (Character.isLetter(caractere) && !isVogal(caractere)) {
                System.out.print(vetorCaracteres[i] + " ");
                contadorConsoantes++;
            }
        }

        System.out.println("\n\nTotal de consoantes: " + contadorConsoantes);

        scanner.close();
    }

    // Metodo auxiliar para verificar se um caractere é uma vogal
    public static boolean isVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}

