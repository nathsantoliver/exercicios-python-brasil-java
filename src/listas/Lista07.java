package listas;

public class Lista07 {
    public static void main(String[] args) {
        // TODO: Ler um vetor de 5 numeros inteiros
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;
        int multiplicacao = 1;

        // TODO: Mostrar a soma
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("Soma dos numeros: " + soma);

        // TODO: Mostrar a multiplicacao
        for (int numero : numeros) {
            multiplicacao *= numero;
        }

        System.out.println("Multiplicacao dos numeros: " + multiplicacao);
        
        // TODO: Mostrar os numeros
        System.out.println("Numeros do vetor: ");

        for (int numero : numeros) {
            System.out.print(numero + " - ");
        }
        
    }
}