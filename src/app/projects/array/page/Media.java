package app.projects.array.page;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Media implements NavigationPage {
    @Override
    public void render(Navigation navigation) {
        int stack = Console.inputInt("Número de registros [4]: ");
        String[] notas = new String[stack > 0 ? stack : 4];
        int total = 0;

        for (int i = 0; i < notas.length; i++) {
            int value = Console.inputInt("Digite uma nota: ");
            notas[i] = Integer.toString(value);
            total += value;
        }

        String[] message = new String[2 + notas.length];

        message[0] = "Idades:";
        message[message.length-1] = "Media: " + Integer.toString(total / notas.length);
        System.arraycopy(notas, 0, message, 1, notas.length);

        Console.box(message);
        
        int context = Console.menu("Continuar", "Voltar");
        if (context == 1) navigation.popBack();
    }
    
}
