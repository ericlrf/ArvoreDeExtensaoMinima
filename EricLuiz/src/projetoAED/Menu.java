package projetoAED;

import java.util.Collection;
import java.util.TreeSet;

public class Menu {

	public static void main(String[] args) {
		/**
		 * 
		 * Dados de entrada que tambem podem ser recebidos por Console
		 * 
		 * Exemplo retirado do site:
		 * http://en.wikipedia.org/wiki/Kruskal%27s_algorithm#Example
		 * 
		 */
		Collection<Vertice> vs = new TreeSet<Vertice>();
		Vertice a = new Vertice("A");
		vs.add(a);
		System.out.println("Vertice '" + a + "' adicionado.");
		Vertice b = new Vertice("B");
		vs.add(b);
		System.out.println("Vertice '" + b + "' adicionado.");
		Vertice c = new Vertice("C");
		vs.add(c);
		System.out.println("Vertice '" + c + "' adicionado.");
		Vertice d = new Vertice("D");
		vs.add(d);
		System.out.println("Vertice '" + d + "' adicionado.");
		Vertice e = new Vertice("E");
		vs.add(e);
		System.out.println("Vertice '" + e + "' adicionado.");
		Vertice f = new Vertice("F");
		vs.add(f);
		System.out.println("Vertice '" + f + "' adicionado.");
		Vertice g = new Vertice("G");
		vs.add(g);
		System.out.println("Vertice '" + g + "' adicionado.");
		System.out.println("Vertices disponiveis: " + vs.toString());
		Collection<Aresta> as = new TreeSet<Aresta>();
		Aresta ad = new Aresta(5, a, d);
		as.add(ad);
		System.out.println("Aresta '" + ad + "' de custo " + ad.getCusto()
				+ " adicionada.");
		Aresta ab = new Aresta(7, a, b);
		as.add(ab);
		System.out.println("Aresta '" + ab + "' de custo " + ab.getCusto()
				+ " adicionada.");
		Aresta bd = new Aresta(9, b, d);
		as.add(bd);
		System.out.println("Aresta '" + bd + "' de custo " + bd.getCusto()
				+ " adicionada.");
		Aresta bc = new Aresta(8, b, c);
		as.add(bc);
		System.out.println("Aresta '" + bc + "' de custo " + bc.getCusto()
				+ " adicionada.");
		Aresta be = new Aresta(7, b, e);
		as.add(be);
		System.out.println("Aresta '" + be + "' de custo " + be.getCusto()
				+ " adicionada.");
		Aresta ce = new Aresta(5, c, e);
		as.add(ce);
		System.out.println("Aresta '" + ce + "' de custo " + ce.getCusto()
				+ " adicionada.");
		Aresta de = new Aresta(15, d, e);
		as.add(de);
		System.out.println("Aresta '" + de + "' de custo " + de.getCusto()
				+ " adicionada.");
		Aresta df = new Aresta(6, d, f);
		as.add(df);
		System.out.println("Aresta '" + df + "' de custo " + df.getCusto()
				+ " adicionada.");
		Aresta fe = new Aresta(8, f, e);
		as.add(fe);
		System.out.println("Aresta '" + fe + "' de custo " + fe.getCusto()
				+ " adicionada.");
		Aresta fg = new Aresta(11, f, g);
		as.add(fg);
		System.out.println("Aresta '" + fg + "' de custo " + fg.getCusto()
				+ " adicionada.");
		Aresta eg = new Aresta(9, e, g);
		as.add(eg);
		System.out.println("Aresta '" + eg + "' de custo " + eg.getCusto()
				+ " adicionada.");
		Grafo grafo = new Grafo(vs, as);
		System.out.println("Grafo de " + vs.size() + " vertices e " + as.size()
				+ " arestas: ");
		System.out.println(grafo.toString());
		ArvoreGeradora arvore = new ArvoreGeradora(grafo);
		System.out.println("Arvore-de-extensao-minima de "
				+ arvore.getListaVerticesIncluidos().size() + " vertices e "
				+ arvore.getListaArestasIncluidos().size() + " arestas: ");
		System.out.println(arvore.toString());

	}
}
