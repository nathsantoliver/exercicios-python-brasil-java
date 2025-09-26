package repeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repeticao14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nums[] = new int[10];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite 10 numeros inteiros entre 0 e 100:");

        for (int i = 0; i < 10; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.println("\n**************\n**************\n");

        for (int num : nums) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        int countImpar = Math.toIntExact(impares.stream().count());
        int countPar = Math.toIntExact(pares.stream().count());

        System.out.println("Pares: " + countPar);
        System.out.println("Impares: " + countImpar);

        scan.close();
    }
}
