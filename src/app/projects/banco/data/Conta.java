package app.projects.banco.data;

import app.util.core.Console;

public class Conta {
    private String numeroDaConta;
    private String titular;
    private double saldo;

    public Conta(String n, String t, double s) {
        this.numeroDaConta = n;
        this.titular = t;
        this.saldo = s;
    }

    public Boolean verificar(String other) {
        return numeroDaConta.equals(other);
    }

    public String sacar(Double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return "Saque realizado com sucesso!";
        }

        return "Saldo insuficiente";
    }

    public String depositar(double quantidade) {
        if (quantidade <= 0) {
            return "Não se pode depositar valor negativo";
        }
        saldo += quantidade;
        return "Valor depositado";
    }

    public String getNumero() {
        return numeroDaConta;
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
