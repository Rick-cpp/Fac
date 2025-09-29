package app.projects.filas.pages;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;
import app.projects.filas.data.Queue;

public class Q5 implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        Queue q = new Queue(16);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        Console.box("Primeiro: ", Integer.toString(q.peek()));
        
        String[] log = new String[q.getCapacity()];
        int i = 0;
        while (!q.isEmpty()) {
            log[i] = "Removeu: " + Integer.toString(q.dequeue());
            i++;
        }
        Console.box(log);
        int context = Console.menu("Continuar", "Sair");
        if (context == 1) navigation.popBack();
    }
    
}
