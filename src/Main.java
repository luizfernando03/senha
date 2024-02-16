import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        System.out.println(Usuario.alterarSenha("Senha001"));
        System.out.println(Usuario.alterarSenha("Senha002"));
        System.out.println(Usuario.alterarSenha("Senha003"));
        System.out.println(Usuario.alterarSenha("Senha004"));

    }
}