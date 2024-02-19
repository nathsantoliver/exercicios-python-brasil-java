package sequencial;

import java.util.Scanner;

/*
 *  Faça um programa que calcule a área de um quadrado, em seguida,
 *  mostre o dobro desta área para o usuário.
 */
public class Questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado: ");
        float lado = scan.nextFloat();

        System.out.println(areaQuadrado(lado) * 2);
    }

    public static float areaQuadrado(float l) {
        return (float) Math.pow(l, 2);
    }
}
