package app.projects.filas.pages;

import app.util.node.Navigation;

public class FilaRoutes extends Navigation {
    Navigation main;

    public FilaRoutes(Navigation nav) { this.main = nav; }

    @Override
    protected void quit() { main.popBack(); }

    @Override
    public FilaRoutes onReady() {
        register("Q1", new Q1()::render);
        register("Q2", new Q2()::render);
        register("Q3", new Q3()::render);
        register("Q4", new Q4()::render);
        register("Q5", new Q5()::render);

        return this;
    }
    
}
