package repeticao;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite o seu Nome: ");
        String nome = scan.next();
        System.out.print("Digite a sua Idade: ");
        int idade = scan.nextInt();
        System.out.print("Digite o seu Salário: ");
        double salario = scan.nextDouble();
        System.out.print("Digite o seu Sexo: ");
        String sexo = scan.next();
        System.out.print("Digite o seu Estado Civil: ");
        String estadoCivil = scan.next();
        
        System.out.println("\nValidando as informações...");

        // Nome => maior que 3 caracteres
       while (nome.length() <= 3) {
            System.out.print("\nO nome deve ter mais que 3 caracteres.");
            System.out.print("\nDigite o nome novamente: ");
            nome = scan.next();
        }

        // Idade => entre 0 e 150
        while (idade <= 0 || idade >= 150) {
            System.out.print("\nA idade deve ser maior que 0 e menor que 150.");
            System.out.print("\nDigite a idade novamente: ");
            idade = scan.nextInt();
        }

        // Salário => maior que zero
        while (salario <= 0) {
            System.out.printf("%nO salário deve ser maior que 0.%nDigite o salário novamente: ");
            salario = scan.nextDouble();
        }

        // Sexo => 'f' ou 'm'
        while (!sexo.equalsIgnoreCase("f") &&
                !sexo.equalsIgnoreCase("m")) {
            System.out.printf("%nEste sexo não existe!%nDigite 'f' para feminino e 'm' para masculino: ");
            sexo = scan.next();
        }

        // Estado Civil => 's', 'c', 'v', 'd'
        while (!estadoCivil.equalsIgnoreCase("s") &&
                !estadoCivil.equalsIgnoreCase("c") &&
                !estadoCivil.equalsIgnoreCase("v") &&
                !estadoCivil.equalsIgnoreCase("d")) {
            System.out.printf("Estado civil digitado errado! As opções são: %n");
            System.out.print("s - solteiro(a)\nc - casado(a)\nv - viúvo(a)\nd - divorciado(a)");
            System.out.printf("%nDigite o Estado Civil novamente: ");
            estadoCivil = scan.next();
        }

        System.out.println("\nInformações validadas!!!");

        scan.close();
    }
}
