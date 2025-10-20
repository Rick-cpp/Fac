package app.projects.polimorfismo.pages;

import app.projects.polimorfismo.q1.Calculadora;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Q1 implements NavigationPage {
    static final String Q = (
        " 1. Polimorfismo (Sobrecarga de Metodos)\n" + //
        "Objetivo: Praticar a criação de métodos com o mesmo nome, mas assinaturas diferentes,\n" + //
        "dentro da mesma classe.\n" + //
        "Cenario: Calculadora Universal\n" + //
        "1. Crie uma classe chamada Calculadora.\n" + //
        "2. Dentro de Calculadora, crie um metodo publico chamado somar.\n" + //
        " * Versão 1: O metodo deve receber dois parametros int e retornar a soma.\n" + //
        " * Versão 2: O metodo deve receber tres parametros int e retornar a soma.\n" + //
        " * Versão 3: O metodo deve receber dois parametros double e retornar a soma.\n" + //
        "3. Crie uma classe Main (ou de teste) e chame o metodo somar com diferentes combinacoes\n" + //
        "de argumentos (2 inteiros, 3 inteiros, 2 doubles) para provar que o compilador consegue\n" + //
        "escolher o metodo correto"
    );

    @Override
    public void render(Navigation navigation) {
        Console.box(Q.split("\n"));

        Calculadora calculadora = new Calculadora();

        Console.print("Somando valores inteiros: 16+16 = ", calculadora.soma(16, 16));
        Console.print("Somando valores inteiros: 16+16+16 = ", calculadora.soma(16, 16, 16));
        Console.print("Somando valores decimais: 0.1+0.2 = ", calculadora.soma(.2,.1));

        Console.confirmation();
        navigation.popBack();
    }

}
