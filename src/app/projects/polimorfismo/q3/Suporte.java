package app.projects.polimorfismo.q3;

public class Suporte extends Funcionario {

    @Override
    public double calcularSalarioFinal() {
        return Math.decimal_sum(this.salarioBase, 200); 
    }
    
}
