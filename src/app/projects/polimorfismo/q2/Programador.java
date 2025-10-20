package app.projects.polimorfismo.q2;

public class Programador extends Funcionario {
    @Override
    public double calcularSalario() {
        return Math.decimal_mul(super.calcularSalario(), 1.2);
    }
}
