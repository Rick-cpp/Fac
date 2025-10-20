package app.projects.polimorfismo.pages;

import app.projects.livraria.data.Livraria;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class QNav implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        int option = Console.menu(
            "Q1 - Sobrecarga de Métodos",
            "Q2 - Sobrescrita de Métodos",
            "Q3 - Polimorfismo com Herança e Método Abstrato ",
            "Sair"
        );

        if (option == 0) { navigation.navigate("Q1"); }
        if (option == 1) { navigation.navigate("Q2"); }
        if (option == 2) { navigation.navigate("Q3"); }
        if (option == 3) { navigation.popBack(); }
    }
    
}
