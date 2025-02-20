package repeticao;

public class Questao04 {
    public static void main(String[] args) {
        double popA = 80000.00;
        double popB = 200000.00;
        final double crescA = 0.03;
        final double crescB = 0.015;
        int ano = 0;

        do {
            popA += (popA * crescA);
            popB += (popB * crescB);
            ano++;
        } while (popB > popA);

        System.out.printf("%nAno %d:", ano);
        System.out.printf(
                "%nPaís A tem %.2f de habitantes.%nPaís B tem %.2f de habitantes.",
                popA, popB);
    }
}
