package decisao;

import java.util.Scanner;

/*  Faça um programa que pregunte o preço de três produtos e informe qual produto você deve comprar,
    sabendo que a decisão é sempre pelo mais barato.*/

public class Decisao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double prod1, prod2, prod3;

        System.out.println("Digite o preço de três produtos.");
        System.out.print("Produto 1: ");
        prod1 = scan.nextDouble();
        System.out.print("Produto 2: ");
        prod2 = scan.nextDouble();
        System.out.print("Produto 3: ");
        prod3 = scan.nextDouble();

        if (prod1 < prod2 && prod1 < prod3){
            System.out.println("Você deve comprar o Produto 1, pois o valor é menor (R$" + prod1 +")");
        } else if (prod2 < prod1 && prod2 < prod3) {
            System.out.println("Você deve comprar o Produto 2, pois o valor é menor (R$" + prod2 + ")");
        } else {
            System.out.println("Você deve comprar o Produto 3, pois o valor é menor (R$" + prod3 + ")");
        }

        scan.close();
    }
}
