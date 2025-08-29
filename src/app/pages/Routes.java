package app.pages;

import app.projects.array.ArrayIndex;
import app.projects.banco.BancoIndex;
import app.projects.boletim.BoletimIndex;
import app.projects.carro.CarroIndex;
import app.projects.livraria.LivrariaIndex;
import app.projects.person.PersonIndex;
import app.util.core.MainLoop;
import app.util.node.Navigation;

public class Routes extends Navigation {

    public Navigation onReady() {
        register("main", new Home()::render);
        register("livraria", new LivrariaIndex()::render);
        register("school", new BoletimIndex()::render);
        register("bank", new BancoIndex()::render);
        register("car", new CarroIndex()::render);
        register("array", new ArrayIndex()::render);
        register("person", new PersonIndex()::render);
        return this;
    }

    @Override
    protected void quit() { MainLoop.exit(); }
}
