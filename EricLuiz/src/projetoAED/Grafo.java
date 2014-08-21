package projetoAED;

import java.util.Collection;
import java.util.TreeSet;

public class Grafo {

	Collection<Vertice> listaVertices = new TreeSet<Vertice>();
	Collection<Aresta> listaArestas = new TreeSet<Aresta>();

	public Grafo(Collection<Vertice> listaVertices,
			Collection<Aresta> listaArestas) {
		super();
		this.listaVertices = listaVertices;
		this.listaArestas = listaArestas;
	}

	public Grafo() {
		super();
	}

	public Collection<Vertice> getListaVertices() {
		return listaVertices;
	}

	public void setListaVertices(Collection<Vertice> listaVertices) {
		this.listaVertices = listaVertices;
	}

	public Collection<Aresta> getListaArestas() {
		return listaArestas;
	}

	public void setListaArestas(Collection<Aresta> listaArestas) {
		this.listaArestas = listaArestas;
	}

	@Override
	public String toString() {
		return "" + listaArestas;
	}
}
