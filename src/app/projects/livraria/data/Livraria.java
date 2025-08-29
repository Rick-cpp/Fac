package app.projects.livraria.data;

import java.util.ArrayList;

public class Livraria {
    public static ArrayList<Livro> livros = new ArrayList<>();
    public static Livro alugado = null;

    public static void register(Livro livro) { livros.add(livro); }

    public static String[] getName() {
        String[] names = new String[livros.size()];

        for (int index = 0; index < livros.size(); index++) {
            names[index] = livros.get(index).getName();
        }

        return names;
    }

    public static void rent(int index) { alugado = livros.get(index); }

    public static void clear() { alugado = null; }
}

