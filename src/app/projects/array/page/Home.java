package app.projects.array.page;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Home implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        int context = Console.menu(
            "Idade",
            "Media",
            "Sair"
        );

        if (context == 0) navigation.navigate("age");
        if (context == 1) navigation.navigate("mean");
        if (context == 2) navigation.popBack();
    }
    
}
