import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private static List<String> senhas;
    private static Scanner scanner;

    public Usuario() {
        this.senhas = new ArrayList<>();
        this.scanner = new Scanner(System.in);

    }

    public static String alterarSenha(String novaSenha) {
        System.out.println("Digite a sua senha");
        String senhaAtual = scanner.nextLine();

        if (senhas.isEmpty() || senhaAtual.equals(senhas.get(senhas.size() - 1))) {
            if (senhas.size() >= 3 && (novaSenha.equals(senhas.get(senhas.size() - 2)) || novaSenha.equals(senhas.get(senhas.size() - 3)))) {
                return "A nova senha não pode ser igual a das ultimas três senhas!";
            } else if (novaSenha.equals(senhaAtual)) {
                return "A nova senha não pode ser igual a da senha atual";

            } else {
                senhas.add(novaSenha);
                return "Senha alterada com sucesso!";
            }
        } else {
            return "Senha atual invalida!";
        }
    }

}
