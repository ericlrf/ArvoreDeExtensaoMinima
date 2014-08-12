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

	public void setListaVerticesPossiveis(
			ArrayList<Vertice> listaVerticesPossiveis) {
		this.listaVerticesPossiveis = listaVerticesPossiveis;
	}

	public ArrayList<Vertice> getListaVerticesIncluidos() {
		return listaVerticesIncluidos;
	}

	public void setListaVerticesIncluidos(
			ArrayList<Vertice> listaVerticesIncluidos) {
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
		listaVerticesPossiveis.addAll(listaVertices);
		listaVerticesIncluidos.add(listaVerticesPossiveis.get(0));
		listaVerticesPossiveis.remove(0);
		verificarVertices();
	}

	public void verificarVertices() {
		for (int indice = 0; indice < listaVerticesIncluidos.size(); indice++) {
			verficarArestas(listaVerticesIncluidos.get(indice));
		}
	}

	public void verficarArestas(Vertice vertice) {
		for (int indice = 0; indice < listaArestas.size(); indice++) {
			if (vertice == listaArestas.get(indice).getVertice1()
					|| vertice == listaArestas.get(indice).getVertice2()) {
				listaArestasPossiveis.add(listaArestas.get(indice));
			}
		}
	}

	public void percorrerArestas() {
		for (int indice = 0; indice < listaArestasPossiveis.size(); indice++) {
			compararArestas(listaArestasPossiveis.get(indice));
		}
	}
	
	public void compararArestas(Aresta aresta) {
		int contador = 0;
		if (!(listaArestasIncluidas.isEmpty())) {
			for (int indice = 0; indice < listaArestasIncluidas.size(); indice++) {
				if(aresta == listaArestasIncluidas.get(indice)) {
					contador++;
				}
			}
			if(contador == 0) {
				listaArestasIncluidas.add(aresta);
			}
		} else {
			listaArestasIncluidas.add(aresta);
			listaArestasPossiveis.remove(aresta);
		}
	}

	/**
	 * Método toString responsável pela representação em texto do sub-grafo
	 * gerado por esta Classe, no canal de saída padrão
	 * */

	@Override
	public String toString() {
		return listaVerticesIncluidos + "" + listaArestasIncluidas;
	}

}
