package repeticao;

import java.util.Scanner;

/*
    Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual
    ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
*/

public class Questao02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeUsuario;
        String senha;

        System.out.println("Digite um Nome de Usuário e Senha");
        System.out.println("Nome de Usuário: ");
        nomeUsuario = scan.nextLine();
        System.out.println("Senha: ");
        senha = scan.nextLine();

        while (nomeUsuario.equalsIgnoreCase(senha)) {
            System.out.println("A Senha não pode ser igual ao Nome de Usuário, digite novamente");
            System.out.print("Senha: ");
            senha = scan.nextLine();
        }

        scan.close();
    }

}
