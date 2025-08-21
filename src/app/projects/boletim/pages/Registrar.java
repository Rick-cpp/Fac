package app.projects.boletim.pages;

import app.projects.boletim.data.Aluno;
import app.projects.boletim.data.Escola;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Registrar implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        String nome = Console.input("Digite o nome: ");
        int matricula = Console.inputInt("Digite a matricula: ");
        
        Escola.register(new Aluno(nome, matricula));
        Console.print("Aluno registrado: ", nome);
        
        int context = Console.menu("Continuar", "Voltar");
        
        if (context == 1) navigation.popBack();
    }
    
}
