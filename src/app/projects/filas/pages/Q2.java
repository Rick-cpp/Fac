package app.projects.filas.pages;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Q2 implements NavigationPage {
    @Override
    public void render(Navigation navigation) {
        Console.box(" 2) Um hospital precisa organizar os exames realizados em pacientes \r\n" + //
                        "durante o dia. Cada exame é registrado em ordem cronológica. No fim \r\n" + //
                        "do dia, o sistema deve imprimir esses exames na ordem inversa à que \r\n" + //
                        "foram feitos (do último para o primeiro). \r\n" + //
                        "Que estrutura você usaria para guardar os exames: fila ou pilha? \r\n" + //
                        "Implementaria com array ou lista encadeada? Justifique.");
        Console.box("A estrutura mais adequada é a pilha, porque o \"Desfazer\" precisa seguir a ordem inversa das ações realizadas, ou seja, o último comando executado deve ser o primeiro a ser desfeito (LIFO).");
        Console.input("Digite ENTER coisa para continuar: ");
        navigation.popBack();
    }
}
