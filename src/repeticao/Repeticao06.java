package repeticao;

/* Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
Depois modifique o programa para que ele mostre os números um ao lado do outro.
* */
public class Repeticao06 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            // Imprimindo os números um abaixo do outro
            System.out.println(i);
            // Imprimindo os números lado a lado
            System.out.print(i + " ");
        }

    }
}
