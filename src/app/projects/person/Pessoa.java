package app.projects.person;

import app.util.core.Console;

public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;

    public Pessoa(String n, int i, Endereco e) {
        this.nome = n;
        this.idade = i;
        this.endereco = e;
    }

    public void render() {
        Console.print("Nome: ", this.nome , "Idade: ", this.idade, "[", endereco.getRua(), "-", endereco.getNumero(), "]");
    }
}
