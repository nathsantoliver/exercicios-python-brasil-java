package decisao;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é vogal ou consoante.

public class Decisao04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String letra;
        System.out.print("Digite uma letra: ");
        letra = scan.next();

        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Você digitou uma VOGAL!");
        } else if (letra.equalsIgnoreCase("e")){
            System.out.println("Você digitou uma VOGAL!");
        } else if (letra.equalsIgnoreCase("i")){
            System.out.println("Você digitou uma VOGAL!");
        } else if (letra.equalsIgnoreCase("o")){
            System.out.println("Você digitou uma VOGAL!");
        } else if (letra.equalsIgnoreCase("u")){
            System.out.println("Você digitou uma VOGAL!");
        } else {
            System.out.println("Você digitou uma CONSOANTE!");
        }

        scan.close();
    }
}
