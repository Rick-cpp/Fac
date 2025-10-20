package app.projects.polimorfismo.q2;

import app.projects.polimorfismo.q1.Calculadora;

public class Funcionario {
    protected static final Calculadora Math = new Calculadora();

    public String nome;
    public String cpf;

    public double calcularSalario() {
        return 1500;
    } 
}
