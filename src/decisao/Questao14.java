package decisao;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float notaUm, notaDois, media;
        char conceito;
        String situacao = "";

        System.out.print("Digite a primeira nota: ");
        notaUm = scan.nextFloat();

        System.out.print("Digite a segunda nota: ");
        notaDois = scan.nextFloat();

        media = (notaUm + notaDois) / 2;

        if (media > 9.0) conceito = 'A';
        else if (media >= 7.5 && media <= 9.0) conceito = 'B';
        else if (media >= 6.0 && media <= 7.5) conceito = 'C';
        else if (media >= 4.0 && media <= 6.0) conceito = 'D';
        else conceito = 'E';

        situacao = switch (conceito) {
            case 'A' -> "APROVADO";
            case 'B' -> "APROVADO";
            case 'C' -> "APROVADO";
            case 'D' -> "REPROVADO";
            case 'E' -> "REPROVADO";
            default -> situacao;
        };

        System.out.printf("%n|------------------------------------------------|");
        System.out.printf("%n| NOTA 1 | NOTA 2 | MEDIA | CONCEITO | SITUAÇÃO  |"); // 8 - 8 - 7 - 10 - 10
        System.out.printf("%n|------------------------------------------------|");
        System.out.printf("%n| %-6.1f | %-6.1f | %-5.1f |    %-5s | %-9s |",
                notaUm,  notaDois, media, conceito, situacao);
        System.out.printf("%n|------------------------------------------------|");

        scan.close();
    }
}
