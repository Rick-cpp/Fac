package app.pages;

import app.projects.banco.BancoIndex;
import app.projects.boletim.BoletimIndex;
import app.projects.carro.CarroIndex;
import app.projects.livraria.LivrariaIndex;
import app.util.core.MainLoop;
import app.util.node.Navigation;

public class Routes extends Navigation {

    public Navigation onReady() {
        register("main", new Home()::render);
        register("livraria", new LivrariaIndex()::render);
        register("school", new BoletimIndex()::render);
        register("bank", new BancoIndex()::render);
        register("car", new CarroIndex()::render);
        return this;
    }

    @Override
    protected void quit() { MainLoop.exit(); }
}
