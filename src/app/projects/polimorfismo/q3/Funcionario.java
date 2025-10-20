package app.projects.polimorfismo.q3;

import app.projects.polimorfismo.q1.Calculadora;

public abstract class Funcionario {
    protected static final Calculadora Math = new Calculadora();
    protected double salarioBase;
    
    public void set(double valor) {
        this.salarioBase = valor;
    }
    
    public abstract double calcularSalarioFinal();
}
