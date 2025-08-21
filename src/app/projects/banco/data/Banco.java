package app.projects.banco.data;

import java.util.ArrayList;

import app.util.core.Console;

public class Banco {
    static ArrayList<Conta> contas = new ArrayList<>();
    static Conta login = null;

    public static void register(Conta conta) { contas.add(conta); }

    public static boolean login(String numero) { 
        for (var conta : contas) if (conta.numeroDaConta.equals(numero)) {
            login = conta;
            return true;
        }
        
        return false;
    }

    public static Conta recover(String name) {
        for (var conta : contas) if (conta.numeroDaConta.equals(name)) return conta;
        return null;
    }

    public static boolean logado() { return login == null; }

    public static String saque(double quantidade) {
        if (login.saldo >= quantidade) {
            login.saldo -= quantidade;
            return "Saque realizado com sucesso!";
        }


        return "Saldo insuficiente";
    }

    public static String depositar(double quantidade) {
        if (quantidade <= 0) {
            return "Não se pode depositar valor negativo";
        }
        login.saldo += quantidade;
        return "Valor depositado";
    }

    public static void render() {
        if (login == null) {
            Console.print("Crie um conta ou Entre na sua conta!");
            return;
        }

        login.render();
    }

    public static void exit() { login = null; }
}
