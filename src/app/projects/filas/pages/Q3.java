package app.projects.filas.pages;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Q3 implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        Console.box("3) Um sistema precisa controlar tarefas usando simultaneamente uma fila e uma pilha. As tarefas chegam e são inseridas na fila, mas algumas tarefas prioritárias precisam ser movidas imediatamente para a pilha, sendo resolvidas antes das demais. Explique qual será a ordem final de execução das tarefas e justifique o porquê, considerando o funcionamento das duas estruturas.");
        Console.box("As tarefas normais entram na fila (FIFO) e são processadas na ordem de chegada. Tarefas prioritárias vão para a pilha (LIFO) e são resolvidas imediatamente, ou seja, o último prioritário inserido será o primeiro a ser executado. Portanto, a execução final começa pelas tarefas da pilha, na ordem inversa de inserção, e só depois continua com as tarefas da fila na ordem original.");
        Console.input("Digite ENTER coisa para continuar: ");
        navigation.popBack();
    }
    
}
