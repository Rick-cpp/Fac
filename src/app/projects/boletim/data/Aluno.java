package app.projects.boletim.data;

import app.util.core.Console;

public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    public Aluno(String nNome, int nMatricula) {
        this.nome = nNome;
        this.matricula = nMatricula;
        this.notaAv1 = -1;
        this.notaAv2 = -1;
    }

    public boolean aprovado() { return ((notaAv1 + notaAv2) / 2) >= 7; }
    public String getName() { return this.nome; }

    public void render() {
        Console.box(
            "Nome: " + this.nome,
            "Matricula: " + Integer.toString(this.matricula),
            "Nota AV1: " + Double.toString(notaAv1),
            "Nota AV2: " + Double.toString(notaAv2),
            notaAv1 == -1 || notaAv2 == -1 ? "Sem nota ainda": (aprovado()?"Aprovado":"Reprovado")
        );
    }
}
