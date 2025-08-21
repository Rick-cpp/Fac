package app.projects.boletim.pages;

import app.projects.boletim.data.Escola;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Home implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        Escola.render();
        int context = Console.menu("Registrar", "Verificar", "Alterar", "Sair");
    
        if (context == 0) { navigation.navigate("register"); }
        if (context == 1) { navigation.navigate("verify"); }
        if (context == 2) { navigation.navigate("update"); }
        if (context == 3) { navigation.popBack(); }
    }
    
}
