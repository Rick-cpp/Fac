package app.projects.filas.pages;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Q1 implements NavigationPage {
    @Override
    public void render(Navigation navigation) {
        Console.box("1) Um aplicativo de edição de texto permite que o usuário use a função \r\n" + //
                        "\"Desfazer\" (Ctrl+Z). Cada ação realizada pelo usuário precisa ser \r\n" + //
                        "desfeita na ordem inversa em que aconteceu. \r\n" + //
                        "Qual estrutura de dados é mais adequada para essa situação: fila ou \r\n" + //
                        "pilha? Explique");
        Console.box("Usaria uma pilha, implementada com array se o número de exames for conhecido, ou lista encadeada se precisar de flexibilidade, pois assim é possível imprimir do último ao primeiro exame.");
        Console.input("Digite ENTER coisa para continuar: ");
        navigation.popBack();
    }
    
}
