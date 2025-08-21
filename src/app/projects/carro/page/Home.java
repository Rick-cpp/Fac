package app.projects.carro.page;

import app.projects.carro.data.Concessionaria;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Home implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        Concessionaria.display();

        int context = Console.menu(
            "Adicionar",
            "Mudar",
            "Sair"
        );

        if (context == 0) navigation.navigate("post");
        if (context == 1) navigation.navigate("update");
        if (context == 2) navigation.popBack();
    }
    
}
