package listas;

import java.util.Scanner;

public class Lista05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        // Ler 20 numeros e armazenar em um vetor.
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = scan.nextInt();

            // Armazenar os numeros pares em um vetor e os impares em outro vetor.
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            } else {
                impares[i] = numeros[i];
            }

        }

        // Imprimir os vetores.
        System.out.println("\nNumeros digitados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nNumeros pares:");
        for (int par : pares) {
            if (par != 0) {
                System.out.print(par + " ");
            }
        }

        System.out.println("\n\nNumeros impares:");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }


    }
}
