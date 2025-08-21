package app.projects.boletim.pages;

import java.util.Arrays;

import app.projects.boletim.data.Escola;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Verificar implements NavigationPage {
    int target = -1;
    
    @Override
    public void render(Navigation navigation) {
        if (target != -1) Escola.render(target);
        
        String[] alunos = Escola.getNames();
        
        if (alunos.length == 0) {
            Console.print("Não tem nenhum aluno registrado.");
            Console.confirmation();
            target = -1;
            navigation.popBack();
            return;
        }
        
        alunos = Arrays.copyOf(alunos, alunos.length+1);
        alunos[alunos.length-1] = "Voltar";

        int context = Console.menu(alunos);

        if (target == context) return;

        if (context == alunos.length-1) {
            target = -1;
            navigation.popBack();
            return;
        }

        target = context;
    }
}
