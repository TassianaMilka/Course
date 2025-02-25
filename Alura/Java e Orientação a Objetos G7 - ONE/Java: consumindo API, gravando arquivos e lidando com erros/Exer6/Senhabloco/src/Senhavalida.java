//Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para
// capturar a exceção SenhaInvalidaException, uma classe de exceção personalizada
// que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo,
// ter pelo menos 8 caracteres).

import java.util.Scanner;

public class Senhavalida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro"+  e.getMessage());
        }
    }

    public static void validarSenha(String senha) {
        if (senha.length() < 6) {
            throw new SenhaInvalidaException("A senha deve conter 6 digito");
        }
    }
}

