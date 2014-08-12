package projetoAED;

import java.util.ArrayList;

public class ArvoreGeradora {
	ArrayList<Vertice> listaVertices = new ArrayList<Vertice>();
	ArrayList<Vertice> listaVerticesPossiveis = new ArrayList<Vertice>();
	ArrayList<Vertice> listaVerticesIncluidos = new ArrayList<Vertice>();

	ArrayList<Aresta> listaArestas = new ArrayList<Aresta>();
	ArrayList<Aresta> listaArestasPossiveis = new ArrayList<Aresta>();
	ArrayList<Aresta> listaArestasIncluidas = new ArrayList<Aresta>();

	public ArvoreGeradora(Grafo grafo) {
		super();
		this.listaVertices = grafo.getListaVertices();
		this.listaArestas = grafo.getListaArestas();
		this.algoritmoPrim();
	}
	
	public ArvoreGeradora() {
		
	}

	public ArrayList<Vertice> getListaVertices() {
		return listaVertices;
	}

	public void setListaVertices(ArrayList<Vertice> listaVertices) {
		this.listaVertices = listaVertices;
	}

	public ArrayList<Vertice> getListaVerticesPossiveis() {
		return listaVerticesPossiveis;
	}

	public void setListaVerticesPossiveis(ArrayList<Vertice> listaVerticesPossiveis) {
		this.listaVerticesPossiveis = listaVerticesPossiveis;
	}

	public ArrayList<Vertice> getListaVerticesIncluidos() {
		return listaVerticesIncluidos;
	}

	public void setListaVerticesIncluidos(ArrayList<Vertice> listaVerticesIncluidos) {
		this.listaVerticesIncluidos = listaVerticesIncluidos;
	}

	public ArrayList<Aresta> getListaArestas() {
		return listaArestas;
	}

	public void setListaArestas(ArrayList<Aresta> listaArestas) {
		this.listaArestas = listaArestas;
	}

	public ArrayList<Aresta> getListaArestasPossiveis() {
		return listaArestasPossiveis;
	}

	public void setListaArestasPossiveis(ArrayList<Aresta> listaArestasPossiveis) {
		this.listaArestasPossiveis = listaArestasPossiveis;
	}

	public ArrayList<Aresta> getListaArestasIncluidas() {
		return listaArestasIncluidas;
	}

	public void setListaArestasIncluidas(ArrayList<Aresta> listaArestasIncluidas) {
		this.listaArestasIncluidas = listaArestasIncluidas;
	}
	
	/**
	 * Os Métodos abaixo são para processar a Árvore de Extensão Mínima
	 * utilizando o Algoritmo de Prim (algoritmo guloso) no Grafo
	 * */

	public void algoritmoPrim() {
		//
		
	}

	@Override
	public String toString() {
		return listaVerticesIncluidos + ""
				+ listaArestasIncluidas;
	}
	
}
