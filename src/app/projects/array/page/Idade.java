package app.projects.array.page;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Idade implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        int stack = Console.inputInt("Número de registros [10]: ");
        String[] idades = new String[stack > 0 ? stack : 10];
        String[] maiores = new String[idades.length];
        int pointer = 0;

        for (int i = 0; i < idades.length; i++) {
            int value = Console.inputInt("Digite uma idade: ");
            idades[i] = Integer.toString(value);

            if (value > 17) {
                maiores[pointer] = idades[i];
                pointer++;
            }
        }

        String[] message = new String[1 + idades.length + 1 + pointer];

        message[0] = "Idades:";
        System.arraycopy(idades, 0, message, 1, idades.length);

        message[idades.length + 1] = "Maiores:";
        System.arraycopy(maiores, 0, message, idades.length + 2, pointer);

        Console.box(message);

        int context = Console.menu("Continuar", "Voltar");
        if (context == 1) navigation.popBack();
    }
    
}
