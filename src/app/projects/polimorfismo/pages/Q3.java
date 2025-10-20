package app.projects.polimorfismo.pages;

import app.projects.polimorfismo.q3.Desenvolvedor;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;
import app.projects.polimorfismo.q3.Suporte;

public class Q3 implements NavigationPage {
    private static final String Q = (
        "3. Polimorfismo com Herança e Metodo Abstrato\n" + //
        "Objetivo: Aplicar Classes Abstratas para forçar que as subclasses implementem um metodo especifico.\n" + //
        "1.Crie uma Classe Abstrata chamada Funcionario.\n" + //
        " * Inclua um atributo salarioBase (double).\n" + //
        " * Crie um metodo abstrato chamado calcularSalarioFinal() que retorna um double.\n" + //
        "2.Crie duas subclasses concretas que herdam de Funcionario:\n" + //
        " * Desenvolvedor: Deve implementar calcularSalarioFinal() para retornar salarioBase acrescido de\n" + //
        "um bonus de 10%.\n" + //
        " * Suporte: Deve implementar calcularSalarioFinal() para retornar salarioBase mais uma ajuda de\n" + //
        "custo fixa de RS 200,00.\n" + //
        "3.Na classe principal (Main), crie instâncias de Desenvolvedor e Suporte e armazene-as em variaveis do\n" + //
        "tipo Funcionario.\n" + //
        "4.Imprima o resultado de calcularSalarioFinal() para cada um, mostrando que a chamada ao metodo\n" + //
        "abstrato resulta em calculos diferentes, dependendo do tipo real do objeto."
    );

    @Override
    public void render(Navigation navigation) {
        Console.box(Q.split("\n"));
        
        Desenvolvedor dev = new Desenvolvedor();
        dev.set(2500);
        Suporte suporte = new Suporte();
        suporte.set(1500);

        Console.print("Salario Dev: [Base 2500]", dev.calcularSalarioFinal());
        Console.print("Salario Sup: [Base 1500]", suporte.calcularSalarioFinal());

        Console.confirmation();
        navigation.popBack();
    }

}
