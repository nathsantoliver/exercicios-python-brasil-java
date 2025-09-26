package repeticao;

// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 150.

public class Repeticao09 {
    public static void main(String[] args) {
        int i = 0;

        // Estrutura de Repetição com o laço for
        for (i = 0; i < 150; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
