package app.projects.banco;

import app.projects.banco.pages.Routes;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class BancoIndex implements NavigationPage {
    Routes routes;

    Routes getRoutes(Navigation navigation) {
        if (routes == null) {
            routes = new Routes(navigation).onReady();
        }
        return routes;
    }

    @Override
    public void render(Navigation navigation) {
        getRoutes(navigation).render();
    }

}