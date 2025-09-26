package repeticao;

import java.util.Scanner;

public class Repeticao17 {
    public static void main(String[] args) {

        // Fazer Factorial => [ 5!=5*4*3*2*1 ]
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int factorial = num;

        System.out.print(factorial + "! = ");
        
        while (num > 1) {
            factorial = factorial * (num-1);
            num--;
        }

        System.out.print(factorial);

        scan.close();
    }
}
