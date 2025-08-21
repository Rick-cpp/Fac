package app.projects.livraria.pages;

import app.projects.livraria.data.Livraria;
import app.projects.livraria.data.Livro;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class LivrariaRegistrar implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        String name = Console.input("Digite o nome: ");
        String author = Console.input("Digite o autor: ");
        double valor = Console.inputDouble("Digite o valor: ");

        Livraria.register(new Livro(name, author, valor));
        
        Console.print("Livro registrado: ", name);
        int context = Console.menu("Continuar", "Sair");
        if (context == 1) navigation.popBack();
        
    }
    
}
