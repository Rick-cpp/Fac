package app.projects.filas.pages;

import app.projects.filas.data.Stack;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Q4 implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        Console.box("Elemento do Topo: " + stack.peek());
        
        String[] log = new String[stack.getCapacity()];
        int i = 0;
        while (!stack.isEmpty()) {
            log[i] = "Removeu: " + stack.pop();
            i++;
        }

        Console.box(log);

        int context = Console.menu("Continuar", "Sair");
        if (context == 1) navigation.popBack();
    }
    
}
