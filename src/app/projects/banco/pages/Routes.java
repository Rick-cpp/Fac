package app.projects.banco.pages;

import app.util.node.Navigation;

public class Routes extends Navigation {
    Navigation main;

    public Routes(Navigation navigation) { main = navigation; }

    @Override
    protected void quit() { main.popBack(); }

    @Override
    public Routes onReady() {
        register("index", new Home()::render);
        register("new", new Register()::render);
        register("push", new Sacar()::render);
        register("login", new Login()::render);
        register("add", new Depositar()::render);
        return this;
    } 
}
