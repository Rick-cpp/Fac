package app.projects.banco.pages;

import app.projects.banco.data.Banco;
import app.projects.banco.data.Conta;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Login implements NavigationPage {
    @Override 
    public void render(Navigation navigation) {
        Console.box("Login");
        
        int context = Console.menu("Logar", "Recuperar conta", "Voltar");

        if (context == 0) {
            boolean result = Banco.login(Console.input("Número da conta: "));

            if (result) {
                Console.print("Entrando...");
                Console.confirmation();
                navigation.popBack();
                return;
            }

            Console.print("Não foi possivel acessar conta");
            Console.confirmation();
            return;
        }

        if (context == 1) {
            Conta result = Banco.recover(Console.input("Titular: "));

            if (result == null) {
                Console.print("Não foi possivel recuperar sua conta!");
                Console.confirmation();
                navigation.popBack();
                return;
            }

            Console.print("Número da conta: ", result.numeroDaConta);
            Console.confirmation();
            return;
        }

        if (context == 2) {
            navigation.popBack();
            return;
        }
    }
}