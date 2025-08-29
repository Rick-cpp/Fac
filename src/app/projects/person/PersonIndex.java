package app.projects.person;

import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class PersonIndex implements NavigationPage {

    @Override
    public void render(Navigation navigation) {
        Console.box(
            "Quando criamos um programa, estamos dizendo ao computador o que ele deve fazer, passo a passo",
            "Para isso, usamos uma linguagem de programação, como o Java.",
            "No Java, quase tudo começa com algo chamado classe.",
            "Pense em uma classe como uma forma de organizar informações e comportamentos.",
            "Por exemplo, se quisermos representar uma pessoa, com nome e idade, podemos criar uma classe Pessoa."
        );

        Console.confirmation();
        Console.clear();
        Console.print("public class Pessoa");
        Console.box(
            "public: isso significa que essa parte do código pode ser usada por outras partes do programa.",
            "class: essa palavra diz que estamos criando uma classe um molde que descreve algo. No caso, uma pessoa.",
            "Pessoa: é o nome da classe. Damos esse nome para indicar que essa classe representa uma pessoa."
        );


        Console.confirmation();
        Console.clear();
        Console.printStep("\n", "String nome;", "int idade;");
        Console.box(
            "Dentro da classe, criamos duas variáveis:",
            " * String nome;: isso quer dizer que cada pessoa vai ter um nome, e esse nome é um texto (chamado String em Java).",
            " * int idade;: isso quer dizer que cada pessoa também vai ter uma idade, que é um número inteiro (chamado int).",
            "Essas variáveis guardam as informações de cada pessoa."
        );


        Console.confirmation();
        Console.clear();
        Console.print("public Pessoa(String n, int i)");
        Console.box(
        "Essa parte é chamada de construtor.",
            " * Um construtor é como uma receita para criar uma nova pessoa.",
            " * Ele diz o que fazer quando alguém escreve algo como: nova Pessoa(\"Maria\", 25);",
            "Os parênteses (String n, int i) indicam que, para criar uma pessoa, precisamos informar dois valores:",
            " * Um texto (n), que será o nome.",
            " * Um número (i), que será a idade."
        );

        Console.confirmation();
        Console.clear();
        Console.printStep("\n","this.nome = n;", "this.idade = i;");
        Console.box(
            "Agora estamos dizendo o seguinte:",
            " * this.nome = n;: pegue o nome que veio (o n) e guarde na variável nome da pessoa.",
            " * this.idade = i;: pegue a idade que veio (o i) e guarde na variável idade da pessoa.",
            "A palavra this é usada para dizer: estou falando da variável que pertence a esta pessoa que está sendo criada agora."
        );

        Console.confirmation();
        Console.clear();

        Console.box("Agora vamos criar duas pessoas: Luana 22 e Rick 22 [Verifique o codigo fonte]",
        "Junto com uma nova classe Endereço");
        Pessoa luana = new Pessoa("Luana", 22, new Endereco("R.São Paulo", 25));
        Pessoa rickz = new Pessoa("Rick", 22, new Endereco("R.Vitoria", 78));

        luana.render();
        rickz.render();

        Console.confirmation("Fim: ");
        navigation.popBack();
    }
    
}
