package app.projects.livraria.pages;

import app.projects.livraria.data.Livraria;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class LivrariaNav implements NavigationPage {
    @Override
    public void render(Navigation navigation) {
        if (Livraria.alugado == null) {
            Console.print("Você não possui livros...");
        } else {
            Livraria.alugado.render();
            Console.space();
        }
        
        int option = Console.menu(
            "Registrar Livro",
            "Alugar Livro",
            "Devolver Livro",
            "Sair"
        );

        if (option == 0) { navigation.navigate("register"); }
        if (option == 1) { navigation.navigate("rent"); }
        if (option == 2) { Livraria.clear(); }
        if (option == 3) { navigation.popBack(); }
    }
    
}
