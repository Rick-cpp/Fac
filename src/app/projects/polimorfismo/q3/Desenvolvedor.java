package app.projects.polimorfismo.q3;

public class Desenvolvedor extends Funcionario {
    @Override
    public double calcularSalarioFinal() {
        return Math.decimal_mul(this.salarioBase, 1.1);
    }
}
