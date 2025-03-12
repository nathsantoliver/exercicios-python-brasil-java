package repeticao;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // TODO: Nome => maior que 3 caracteres
//        String nome;

        // TODO: Idade => entre 0 e 150
//        int idade;

        // TODO: Salário => maior que zero
//        double salario;

        // TODO: Sexo => 'f' ou 'm'
//        char[] listaSexo = {'f', 'm'};
//        char choiced;
        char sexo = scan.next().charAt(0);

        if (sexo == 'f' || sexo == 'm') {
            System.out.println("Digite o seu sexo. 'F' para feminino ou 'M' para masculino: ");
        } 

//        for (char sex : listaSexo) {
//            if (sex == sexo) {
//                choiced = sex;
//
//                System.out.printf("Você escolheu: %s", choiced);
//            }
//        }

        // TODO: Estado Civil => 's', 'c', 'v', 'd'
//        char[] estadoCivil = {'s', 'c', 'v', 'd'};

    }
}
