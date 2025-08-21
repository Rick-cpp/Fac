package app.projects.banco.pages;

import app.projects.banco.data.Banco;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Home implements NavigationPage {
    @Override 
    public void render(Navigation navigation) {
        Banco.render();

        int context = Console.menu(
            "Criar conta",
            "Entrar",
            "Sacar",
            "Depositar",
            "Sair"
        );

        if (context == 0) navigation.navigate("new");
        if (context == 1) navigation.navigate("login");
        if (context == 2) navigation.navigate("push");
        if (context == 3) navigation.navigate("add");
        if (context == 4) {
            Banco.exit();
            navigation.popBack();
        }
    }
}
