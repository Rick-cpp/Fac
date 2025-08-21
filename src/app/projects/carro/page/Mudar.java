package app.projects.carro.page;

import app.projects.carro.data.Concessionaria;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Mudar implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        int index = Concessionaria.change();
        
        Concessionaria.update(
            index,
            Console.input("Marca: "), 
            Console.input("Modelo: "), 
            Console.inputInt("Ano: ")
        );

        int context = Console.menu("Continuar", "Voltar");
        if (context == 1) navigation.popBack();
    }
    
}
