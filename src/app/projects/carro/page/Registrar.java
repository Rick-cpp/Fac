package app.projects.carro.page;

import app.projects.carro.data.Carro;
import app.projects.carro.data.Concessionaria;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Registrar implements NavigationPage {
    @Override
    public void render(Navigation navigation) {
        Concessionaria.display();

        Console.print("[Novo Carro]");

        Carro carro = new Carro(
            Console.input("Marca: "), 
            Console.input("Modelo: "), 
            Console.inputInt("Ano: ")
        );

        Concessionaria.post(carro);

        Console.print("Registrado: ", carro.getMarca());

        int context = Console.menu("Continuar", "Voltar");
        if (context == 1) navigation.popBack();
    }
    
}
