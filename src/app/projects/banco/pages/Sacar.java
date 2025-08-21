package app.projects.banco.pages;

import app.projects.banco.data.Banco;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Sacar implements NavigationPage {
    @Override 
    public void render(Navigation navigation) {
        if (Banco.logado()) { 
            Console.print("Você precisa está logado.");
            Console.confirmation();
            navigation.popBack();
            return;
        }
        
        Console.box("Sacar");
        double quantidade = Console.inputDouble("Quantidade: ");
    
        Console.print(Banco.saque(quantidade));

        int context = Console.menu("Continuar", "Voltar");

        if (context == 1) navigation.popBack();
    }    
}
