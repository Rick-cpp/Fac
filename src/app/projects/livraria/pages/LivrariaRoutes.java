package app.projects.livraria.pages;

import app.util.node.Navigation;

public class LivrariaRoutes extends Navigation {
    Navigation main;

    public LivrariaRoutes(Navigation nav) { this.main = nav; }

    @Override
    public LivrariaRoutes onReady() {
        register("index", new LivrariaNav()::render);
        register("register", new LivrariaRegistrar()::render);
        register("rent", new LivrariaAluga()::render);
        return this;
    }

    @Override protected void quit() { main.popBack(); }
    
}
