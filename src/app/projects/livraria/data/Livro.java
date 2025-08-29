package app.projects.livraria.data;

import app.util.core.Console;

public class Livro {
    private String nome;
    private String autor;
    private double valor;

    String[] args;

    public Livro(String nNome, String nAutor, double nValor) {
        this.nome  = nNome;
        this.autor = nAutor;
        this.valor = nValor;
        args = new String[] {
            "nome: "  + this.nome,
            "autor: " + this.autor,
            "valor: " + Double.toString(this.valor)
        };
    }

    public void setPrice(double value) {
        this.valor = value < 0?0:value;
        args[2] = "valor: " + Double.toString(this.valor);
    }

    public String getName() {
        return this.nome;
    }

    public double getPrice() { return this.getPrice(); }

    public void render() {
        Console.box(args);
    }
}
