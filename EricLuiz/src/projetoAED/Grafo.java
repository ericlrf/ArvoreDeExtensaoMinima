package projetoAED;

import java.util.ArrayList;

public class Grafo {

	ArrayList<Vertice> listaVertices = new ArrayList<Vertice>();
	ArrayList<Aresta> listaArestas = new ArrayList<Aresta>();
	
	public Grafo(ArrayList<Vertice> listaVertices,
			ArrayList<Aresta> listaArestas) {
		super();
		this.listaVertices = listaVertices;
		this.listaArestas = listaArestas;
	}
	
	public Grafo() {
		
	}

	public ArrayList<Vertice> getListaVertices() {
		return listaVertices;
	}

	public void setListaVertices(ArrayList<Vertice> listaVertices) {
		this.listaVertices = listaVertices;
	}

	public ArrayList<Aresta> getListaArestas() {
		return listaArestas;
	}

	public void setListaArestas(ArrayList<Aresta> listaArestas) {
		this.listaArestas = listaArestas;
	}

	@Override
	public String toString() {
		return listaVertices + ""
				+ listaArestas;
	}
	
}
