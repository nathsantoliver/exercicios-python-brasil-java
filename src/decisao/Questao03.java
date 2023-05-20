package decisao;

import java.util.Scanner;

/*
    Faça um programa que verifique se uma letra difgitada é "F" ou "M".
    Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/

public class Questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sexo;
        System.out.print("Digite seu sexo: ");
        sexo = scan.next();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }

    }
}
