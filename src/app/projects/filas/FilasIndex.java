package app.projects.filas;

import app.projects.filas.pages.FilaRoutes;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class FilasIndex implements NavigationPage {
    FilaRoutes routes;

    public FilaRoutes getRoutes(Navigation navigation) {
        if (routes == null) {
            routes = new FilaRoutes(navigation).onReady();
        }
        return routes;
    }

    @Override
    public void render(Navigation navigation) {
        getRoutes(navigation).render();
    }

}
