package projetoAED;

import java.util.ArrayList;

public class ArvoreGeradora {
	ArrayList<Vertice> listaVertices = new Grafo().getListaVertices();
	ArrayList<Vertice> listaVerticesPossiveis = new ArrayList<Vertice>();
	ArrayList<Vertice> listaVerticesIncluidos = new ArrayList<Vertice>();

	ArrayList<Aresta> listaArestas = new Grafo().getListaArestas();
	ArrayList<Aresta> listaArestasPossiveis = new ArrayList<Aresta>();
	ArrayList<Aresta> listaArestasIncluidas = new ArrayList<Aresta>();

	public ArvoreGeradora() {
		super();
		this.algoritmoPrim();
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
		// Passo 1
		listaVerticesPossiveis.addAll(listaVertices);
		listaVerticesIncluidos.add(listaVerticesPossiveis.get(0));
		listaVerticesPossiveis.remove(0);
		while (listaVerticesPossiveis.size() > 0) {
			passoDoisUm();
			passoTresUm();
			passoTresDois();
		}
	}

	public void passoDoisUm() {
		for (int indice = 0; indice < listaVerticesIncluidos.size(); indice++) {
			passoDoisDois(listaVerticesIncluidos.get(indice));
		}
	}

	public void passoDoisDois(Vertice vertice) {
		for (int indice = 0; indice < listaArestas.size(); indice++) {
			if (vertice == listaArestas.get(indice).getVertice1()
					|| vertice == listaArestas.get(indice).getVertice2()) {
				if (passoDoisTres(listaArestas.get(indice))) {
					listaArestasPossiveis.add(listaArestas.get(indice));
				}
			}
		}
	}

	public boolean passoDoisTres(Aresta aresta) {
		boolean resultado = true;
		if (listaArestasPossiveis.isEmpty()) {
			resultado = true;
		} else {
			for (int indice = 0; indice < listaArestasPossiveis.size(); indice++) {
				if (aresta == listaArestasPossiveis.get(indice)) {
					resultado = false;
				}
			}
		}
		return resultado;
	}

	public void passoTresUm() {
		Aresta menor;
		int indiceA;
		int indiceB;
		for (indiceA = 1; indiceA < listaArestasPossiveis.size(); indiceA++) {
			menor = listaArestasPossiveis.get(indiceA);
			indiceB = indiceA - 1;
			while ((indiceB >= 0)
					&& (menor.getCusto() < listaArestasPossiveis.get(indiceB)
							.getCusto())) {
				listaArestasPossiveis.set(indiceB + 1,
						listaArestasPossiveis.get(indiceB));
				indiceB--;
			}
			listaArestasPossiveis.set(indiceB + 1, menor);
		}
	}

	public void passoTresDois() {
		for (int indice = 0; indice < listaArestasPossiveis.size(); indice++) {
			if (passoTresQuatro(listaArestasPossiveis.get(indice))) {
				listaArestasIncluidas.add(listaArestasPossiveis.get(indice));
				listaArestasPossiveis.remove(indice);
				passoQuatroQuatro(listaArestasPossiveis.get(indice));
			}
		}
	}

	public boolean passoTresQuatro(Aresta aresta) {
		boolean resultado = false;
		if (passoTresTres(aresta) || passoQuatroUm(aresta)) {
			resultado = true;
		}
		return resultado;
	}

	public boolean passoTresTres(Aresta aresta) {
		boolean resultado = true;
		for (int indice = 0; indice < listaArestasIncluidas.size(); indice++) {
			if (aresta == listaArestasIncluidas.get(indice)) {
				resultado = false;
			}
		}
		return resultado;
	}

	public boolean passoQuatroUm(Aresta aresta) {
		boolean resultado = false;
		if (passoQuatroDois(aresta) || passoQuatroTres(aresta)) {
			resultado = true;
		}
		return resultado;
	}

	public boolean passoQuatroDois(Aresta aresta) {
		boolean resultado = true;
		for (int indice = 0; indice < listaArestasIncluidas.size(); indice++) {
			if (aresta.getVertice1() == listaArestasIncluidas.get(indice)
					.getVertice1()
					|| aresta.getVertice1() == listaArestasIncluidas
							.get(indice).getVertice2()) {
				resultado = false;
			}
		}
		return resultado;
	}

	public boolean passoQuatroTres(Aresta aresta) {
		boolean resultado = true;
		for (int indice = 0; indice < listaArestasIncluidas.size(); indice++) {
			if (aresta.getVertice2() == listaArestasIncluidas.get(indice)
					.getVertice1()
					|| aresta.getVertice2() == listaArestasIncluidas
							.get(indice).getVertice2()) {
				resultado = false;
			}
		}
		return resultado;
	}

	public void passoQuatroQuatro(Aresta aresta) {
		if (passoQuatroDois(aresta)) {
			listaVerticesIncluidos.add(aresta.getVertice1());
			listaVerticesPossiveis.remove(aresta.getVertice1());
		} else if (passoQuatroTres(aresta)) {
			listaVerticesIncluidos.add(aresta.getVertice2());
			listaVerticesPossiveis.remove(aresta.getVertice2());
		}
	}

	// public void percorrerArestas() {
	// Aresta menor;
	// for (int indice = 0; indice < listaArestasPossiveis.size(); indice++) {
	// if(listaArestasIncluidas.isEmpty()) {
	// menor = compararArestas(listaArestasPossiveis.get(indice));
	// } else {
	// if(compararArestas(listaArestasPossiveis.get(indice).getCusto() <
	// menor.getCusto()) {
	//
	// }}}}
	//
	// public Aresta compararArestas(Aresta aresta) {
	// int contador = 0;
	// if (!(listaArestasIncluidas.isEmpty())) {
	// for (int indice = 0; indice < listaArestasIncluidas.size(); indice++) {
	// if(aresta == listaArestasIncluidas.get(indice)) {
	// contador++;
	// }
	// }
	// if(contador == 0) {
	// return aresta;
	// }
	// } else {
	// return aresta;
	// }
	// return aresta;
	// }

	/**
	 * Método toString responsável pela representação em texto do sub-grafo
	 * gerado por esta Classe, no canal de saída padrão
	 * */

	@Override
	public String toString() {
		return listaVerticesIncluidos + "" + listaArestasIncluidas;
	}

}
