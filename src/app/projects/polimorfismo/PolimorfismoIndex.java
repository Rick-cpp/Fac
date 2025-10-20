package app.projects.polimorfismo;

import app.projects.polimorfismo.pages.QRoutes;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

public class PolimorfismoIndex implements NavigationPage {
    Navigation nav;

    public Navigation getNav(Navigation navigation) {
        if (nav == null) {
            nav = new QRoutes(navigation).onReady();
        }
        return nav;
    }

    @Override
    public void render(Navigation navigation) {
        getNav(navigation).render();
    }
}
