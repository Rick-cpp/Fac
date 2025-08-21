package app.projects.carro.page;

import app.util.node.Navigation;

public class Routes extends Navigation {
    Navigation main;

    public Routes(Navigation navigation) { main = navigation; }

    @Override
    protected void quit() { main.popBack(); }

    @Override
    public Routes onReady() {
        register("home", new Home()::render);
        register("update", new Mudar()::render);
        register("post", new Registrar()::render);

        return this;
    }     
}
