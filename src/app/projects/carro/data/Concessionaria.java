package app.projects.carro.data;

import java.util.ArrayList;
import java.util.Arrays;

import app.util.core.Console;

public class Concessionaria {
    static ArrayList<Carro> carros = new ArrayList<>();
    
    public static void update(int index, String marca, String modelo, int ano) {
        carros.get(index).set(marca, modelo, ano);
    }

    public static void post(Carro carro) {
        carros.add(carro);
    }
    
    public static void display() {
        ArrayList<String> data = new ArrayList<>();

        for (Carro carro : carros) {
            data.addAll(Arrays.asList(carro.render()));
            data.add(" ");
        }

        Console.box(data.toArray(new String[] {}));
    }

    public static int change() {
        ArrayList<String> data = new ArrayList<>();
        for (Carro carro : carros) {
            data.addAll(Arrays.asList(carro.getLine()));
        }
        
        return Console.menu(data.toArray(new String[] {}));
    }
}
