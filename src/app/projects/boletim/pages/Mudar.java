package app.projects.boletim.pages;

import java.util.Arrays;

import app.projects.boletim.data.Escola;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Mudar implements NavigationPage {
    @Override
    public void render(Navigation navigation) {
        
        String[] alunos = Escola.getNames();
        
        if (alunos.length == 0) {
            Console.print("Não tem nenhum aluno registrado.");
            Console.confirmation();
            navigation.popBack();
            return;
        }
        
        alunos = Arrays.copyOf(alunos, alunos.length+1);
        alunos[alunos.length-1] = "Voltar";

        int context = Console.menu(alunos);

        if (context == alunos.length-1) {
            navigation.popBack();
            return;
        }

        Console.clear();

        double notaAv1 = Console.inputDouble("Nota Av1: ");
        double notaAv2 = Console.inputDouble("Nota Av2: ");
        Console.flush();
        Console.confirmation();
        Escola.update(context, notaAv1, notaAv2);
        
        Console.print("Aluno atualizado!");
        Console.confirmation();
    }
}
