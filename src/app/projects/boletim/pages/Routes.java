package app.projects.boletim.pages;

import app.util.node.Navigation;

public class Routes extends Navigation {

    Navigation main;

    public Routes(Navigation nav) { this.main = nav; }
    
    @Override protected void quit() { main.popBack(); }

    @Override
    public Routes onReady() { 
        register("home", new Home()::render);
        register("register", new Registrar()::render);
        register("verify", new Verificar()::render);
        register("update", new Mudar()::render);
        return this; 
    }
}
