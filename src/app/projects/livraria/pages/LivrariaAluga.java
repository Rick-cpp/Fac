package app.projects.livraria.pages;

import java.util.Arrays;

import app.projects.livraria.data.Livraria;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class LivrariaAluga implements NavigationPage {
    @Override
    public void render(Navigation navigation) {
        String[] books = Livraria.getName();

        if (books.length == 0) {
            Console.print("Registre algum livro.");
            Console.confirmation();
            navigation.popBack();
            return;
        }

        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = "Voltar";

        int context = Console.menu(books);

        if (context == books.length-1) { navigation.popBack(); return; }
        
        if (Livraria.alugado != null) { 
            Console.print("Você já possui um livro.");
            navigation.popBack(); 
            return;
        }
        
        Livraria.rent(context); 
        navigation.popBack();
    }
    
}
