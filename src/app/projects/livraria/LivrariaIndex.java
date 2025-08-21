package app.projects.livraria;

import app.projects.livraria.data.Livraria;
import app.projects.livraria.data.Livro;
import app.projects.livraria.pages.LivrariaRoutes;
import app.util.node.Navigation;
import app.util.node.NavigationPage;

/**
 * 1) Utilizando o ProjetoLivraria. Faça:
 *      Instanciação de dois objetos da classe;
 *      Alteração dos atributos através do objeto da classe;
 *      Impressão dos atributos na tela;
 *      Invocação dos métodos da classe.
 */
public class LivrariaIndex implements NavigationPage {
    LivrariaRoutes routes = null;

    public LivrariaIndex() {
        Livraria.register(new Livro("Introdução à Inteligência Artificial", "Ana Souza", 120));
        Livraria.register(new Livro("Aprendizado de Máquina Prático", "Carlos Pereira", 150));
        Livraria.register(new Livro("Redes Neurais e Deep Learning", "Beatriz Lima", 180));

        Livraria.register(new Livro("Cálculo Diferencial e Integral", "João Martins", 100));
        Livraria.register(new Livro("Cálculo Avançado", "Mariana Alves", 130));
        Livraria.register(new Livro("Problemas Resolvidos de Cálculo", "Ricardo Fernandes", 90));
    }

    private LivrariaRoutes getRoutes(Navigation navigation) {
        if (routes == null) {
            routes = new LivrariaRoutes(navigation).onReady();            
        }
        return routes;
    }

    @Override
    public void render(Navigation navigation) { 
        getRoutes(navigation).render(); 
    }
    
}
