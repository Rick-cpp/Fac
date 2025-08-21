package app.projects.boletim.data;

import java.util.ArrayList;

import app.util.core.Console;

public class Escola {
    static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void update(int id, double notaAv1, double notaAv2) {
        alunos.get(id).notaAv1 = notaAv1;
        alunos.get(id).notaAv2 = notaAv2;
    }

    public static void register(Aluno aluno) {
        alunos.add(aluno);
    }

    public static void render() {
        if (alunos.isEmpty()) {
            Console.print("Registre algum aluno");
            return;
        }

        for (var it : getNames()) { 
            Console.print(it); 
        }
    }

    public static String[] getNames() {
        String[] names = new String[alunos.size()];

        for (int index = 0; index < alunos.size(); index++) {
            names[index] = alunos.get(index).nome;
        }

        return names;
    }

    public static void render(int x) {
        alunos.get(x).render();
    }
}
