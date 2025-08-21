package app.projects.carro;

import app.projects.carro.page.Routes;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class CarroIndex implements NavigationPage {
    Routes routes = null;

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
