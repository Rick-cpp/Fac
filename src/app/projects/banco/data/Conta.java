package app.projects.banco.data;

import app.util.core.Console;

public class Conta {
    public String numeroDaConta;
    public String titular;
    public double saldo;

    public Conta(String n, String t, double s) {
        this.numeroDaConta = n;
        this.titular = t;
        this.saldo = s;
    }

    public void render() {
        Console.box(
            "N: " + numeroDaConta,
            "Titular: " + titular,
            "Saldo: " + saldo
        );
    }

    @Override
    public String toString() {
        return numeroDaConta;
    }
}
