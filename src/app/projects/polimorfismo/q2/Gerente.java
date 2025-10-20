package app.projects.polimorfismo.q2;

public class Gerente extends Funcionario {
    @Override
    public double calcularSalario() {
        return Math.decimal_sum(super.calcularSalario(), 500);
    }
}
