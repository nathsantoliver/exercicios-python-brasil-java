package sequencial;

import java.util.Scanner;
/*
 *  Faça um programa que peça o raio de um circulo, calcule e mostre sia area;
 */

public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular a area de um circulo?");
        System.out.println("####################################");
        System.out.print("Informe o raio do circulo: ");
        float raio = scan.nextFloat();

        System.out.println(areaCirculo(raio));
    }

    public static float areaCirculo(float r) {
        float pi = 3.14159f;

        return (float) (pi * Math.pow(r, 2));
    }
}
