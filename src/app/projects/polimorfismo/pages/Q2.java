package app.projects.polimorfismo.pages;

import app.projects.polimorfismo.q1.Calculadora;
import app.projects.polimorfismo.q2.Funcionario;
import app.projects.polimorfismo.q2.Gerente;
import app.projects.polimorfismo.q2.Programador;
import app.util.core.Console;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class Q2 implements NavigationPage {
    private static final String Q = (
        " 2. Polimorfismo Dinamico (Sobrescrita de Metodos)\n" + //
        "Objetivo: Aplicar herança e a sobrescrita (@Override) para alterar o comportamento de metodos\n" + //
        "em subclasses, utilizando a classe base como um tipo generico.\n" + //
        "Cenario: Sistema de Pagamento de Funcionarios\n" + //
        "1. Crie uma classe base chamada Funcionario com os atributos nome, cpf e um metodo publico\n" + //
        "calcularSalario()que retorna um valor fixo (por exemplo, 1500.00).\n" + //
        "2. Crie duas subclasses que herdam de Funcionario:\n" + //
        " * Gerente: Sobrescreva o metodo calcularSalario() para retornar o salario base (1500.00)\n" + //
        "mais uma bonificacao fixa de RS 500,00.\n" + //
        " * Programador: Sobrescreva o metodo calcularSalario() para retornar o salario base\n" + //
        "(1500.00) mais um adicional de 20% sobre o salario base" +
        "\n" +
        "2. CONTINUACAO DO COMANDO - Polimorfismo Dinamico (Sobrescrita de Metodos)\n" + //
        "3. Crie uma classe principal (Main) e defina um Array de referencias do tipo Funcionario.\n" + //
        "Este array sera a sua \"lista de pagamento”.\n" + //
        "4. Adicione as instancias de Gerente e Programador a este array de Funcionario. (O\n" + //
        "Java permite que voce coloque um objeto de um tipo mais especifico em uma referencia\n" + //
        "de um tipo mais geral, desde que haja herança.)\n" + //
        "5. Percorra o array listaDePagamento e chame o metodo calcularSalario() para cada\n" + //
        "elemento.\n" + //
        "6. Analise: Observe que, mesmo que o array seja do tipo Funcionario, o metodo\n" + //
        "executado em tempo de execucao sera o especifico de cada objeto (Gerente ou Programador).\n" + 
        "Isso demonstra o poder do Polimorfismo"
    );

    @Override
    public void render(Navigation navigation) {
        Console.box(Q.split("\n"));
        

        Funcionario[] funcionarios = new Funcionario[] {
            new Gerente(),
            new Programador(),
            new Programador(),
            new Programador()
        };

        double[] salarios = new double[funcionarios.length];
        for (int i = 0; i < funcionarios.length; i++) {
            salarios[i] = funcionarios[i].calcularSalario();
            Console.print(funcionarios[i].getClass().getName(), ": ", salarios[i]);
        }

        Console.print("Total: ", new Calculadora().decimal_sum(salarios));

        Console.confirmation();
        navigation.popBack();
    }
}
