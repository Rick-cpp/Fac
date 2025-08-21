package app.projects.banco.pages;

import java.util.Random;

import app.projects.banco.data.Banco;
import app.projects.banco.data.Conta;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Register implements NavigationPage {
    @Override
    public void render(Navigation navigation) { 
        Console.box("Registrar");
        String nome = Console.input("Digite seu nome: ");
        double saldo = Console.inputDouble("Saldo inicial: ");
        int context = Console.menu("Confimar", "Cancelar");

        if (context == 1) { return; }
        
        String value = Integer.toString(new Random().nextInt(1_999_999_999)).substring(0, 4);

        Banco.register(new Conta(value, nome, saldo));
        Console.print("Conta criada, N: ", value.trim());
        Console.confirmation();
        navigation.popBack();
    }
}
