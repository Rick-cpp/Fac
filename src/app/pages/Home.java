package app.pages;

import app.util.core.Console;
import app.util.core.MainLoop;
import app.util.node.ImageASCII;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Home implements NavigationPage {
    ImageASCII image = ImageASCII.from(new int[][] {
        { 4,3, 2,2,2, 3, 3,3,4, 4, 4,3,3, 3, 2,2,2, 3,4},
        { 3,0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0,3},
        { 2,0, 4,4,4, 0, 4,4,4, 0, 4,4,4, 0, 4,0,4, 0,2},
        { 3,0, 4,0,4, 0, 0,4,0, 0, 4,0,0, 0, 4,0,4, 0,3},
        { 4,0, 4,4,0, 0, 0,4,0, 0, 4,0,0, 0, 4,4,0, 0,4},
        { 3,0, 4,0,4, 0, 0,4,0, 0, 4,0,0, 0, 4,0,4, 0,3},
        { 2,0, 4,0,4, 0, 4,4,4, 0, 4,4,4, 0, 4,0,4, 0,2},
        { 3,0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0,3},
        { 4,3, 2,2,2, 3, 3,3,4, 4, 4,3,3, 3, 2,2,2, 3,4},
    });

    @Override
    public void render(Navigation navigation) {
        Console.print(image.toString());

        int selection = Console.menu("Livraria",
            "Boletin",
            "Banco",
            "Carro",
            "Arrays",
            "Pessoas",
            "Sair"
        );
        
        if (selection == 0) navigation.navigate("livraria");
        if (selection == 1) navigation.navigate("school");
        if (selection == 2) navigation.navigate("bank");
        if (selection == 3) navigation.navigate("car");
        if (selection == 4) navigation.navigate("array");
        if (selection == 5) navigation.navigate("person");
        if (selection == 6) MainLoop.exit();
        
    }
}
