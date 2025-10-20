package app.projects.polimorfismo.pages;

import app.util.node.Navigation;

public class QRoutes extends Navigation {
    Navigation main;

    public QRoutes(Navigation main) {
        this.main = main;
    }

    @Override
    public Navigation onReady() {
        register("Root", new QNav()::render);
        register("Q1", new Q1()::render);
        register("Q2", new Q2()::render);
        register("Q3", new Q3()::render);
        return this;
    }
    
    @Override protected void quit() { main.popBack(); }
}
