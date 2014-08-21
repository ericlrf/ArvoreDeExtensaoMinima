package projetoAED;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ArvoreGeradora {

	NavigableSet<Vertice> listaVerticesPossiveis = new TreeSet<Vertice>();
	NavigableSet<Vertice> listaVerticesIncluidos = new TreeSet<Vertice>();
	NavigableSet<Aresta> listaArestasPossiveis = new TreeSet<Aresta>();
	NavigableSet<Aresta> listaArestasIncluidos = new TreeSet<Aresta>();

	public ArvoreGeradora(Grafo grafo) {
		super();
		this.algoritmoDeKruskal(grafo);
	}

	public ArvoreGeradora() {
		super();
	}

	public NavigableSet<Vertice> getListaVerticesPossiveis() {
		return listaVerticesPossiveis;
	}

	public void setListaVerticesPossiveis(
			NavigableSet<Vertice> listaVerticesPossiveis) {
		this.listaVerticesPossiveis = listaVerticesPossiveis;
	}

	public NavigableSet<Vertice> getListaVerticesIncluidos() {
		return listaVerticesIncluidos;
	}

	public void setListaVerticesIncluidos(
			NavigableSet<Vertice> listaVerticesIncluidos) {
		this.listaVerticesIncluidos = listaVerticesIncluidos;
	}

	public NavigableSet<Aresta> getListaArestasPossiveis() {
		return listaArestasPossiveis;
	}

	public void setListaArestasPossiveis(
			NavigableSet<Aresta> listaArestasPossiveis) {
		this.listaArestasPossiveis = listaArestasPossiveis;
	}

	public NavigableSet<Aresta> getListaArestasIncluidos() {
		return listaArestasIncluidos;
	}

	public void setListaArestasIncluidos(
			NavigableSet<Aresta> listaArestasIncluidos) {
		this.listaArestasIncluidos = listaArestasIncluidos;
	}

	/**
	 * 
	 * Os Métodos abaixo são para encontrar uma Árvore de Extensão Mínima do
	 * Grafo utilizando o Algoritmo de Kruskal
	 * 
	 * */
	public void algoritmoDeKruskal(Grafo grafo) {
		listaVerticesPossiveis.addAll(grafo.getListaVertices());
		listaArestasPossiveis.addAll(grafo.getListaArestas());
		for (Aresta aresta : listaArestasPossiveis) {
			if (verificaCiclo(aresta)) {
				listaArestasIncluidos.add(aresta);
			}
		}
		listaVerticesIncluidos.addAll(listaVerticesPossiveis);
		grafo.setListaVertices(listaVerticesIncluidos);
		grafo.setListaArestas(listaArestasIncluidos);
	}
	
	public boolean verificaCiclo(Aresta aresta) {
		boolean resultado1 = true;
		boolean resultado2 = true;
		for (Aresta a : listaArestasIncluidos) {
			if (aresta.getVertice1() == a.getVertice1()
					|| aresta.getVertice1() == a.getVertice2()) {
				resultado1 = false;
			}
		}
		for (Aresta a : listaArestasIncluidos) {
			if (aresta.getVertice2() == a.getVertice1()
					|| aresta.getVertice2() == a.getVertice2()) {
				resultado2 = false;
			}
		}
		return resultado1 || resultado2;
	}

}