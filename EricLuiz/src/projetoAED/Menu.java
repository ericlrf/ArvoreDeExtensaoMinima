package projetoAED;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
	
	ArrayList<Vertice> listaVertices = new ArrayList<Vertice>();
	ArrayList<Aresta> listaArestas = new ArrayList<Aresta>();
//	Vertice vertice = new Vertice();
//	Aresta aresta = new Aresta();
	
	public Menu() {
		super();
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String texto = "";
		Menu menu = new Menu();
		System.out.println("-Inserir Vértices-");
//		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do novo vertice: ");
			texto = ler.next();
			menu.inserirVertice(texto);
//			System.out.println("(Para encerrar, digite 'fim')");
//			System.out.println("");
		}
//		texto = "";
		System.out.println("-Inserir Arestas-");
//		System.out.println("");
		for (int i = 0; i < 8; i++) {
			int custo = 0, indice1 = 0, indice2 = 0;
			menu.exibirVertices();
			System.out.println("Digite o número de um vertice: ");
			indice1 = ler.nextInt();
			System.out.println("Digite o número de outro vertice: ");
			indice2 = ler.nextInt();
			System.out.println("Digite o custo da aresta: ");
			custo = ler.nextInt();
			menu.inserirAresta(custo, indice1, indice2);
//			System.out.println("(Para encerrar, digite 'fim')");
//			System.out.println("");
		}
//		texto = "";
		System.out.println("-Exibir Grafo e sub-grafo-");
//		System.out.println("");
		for (int i = 0; i < 3; i++)  {
			System.out.println("[1] Exibir Grafo");
			System.out.println("[2] Exibir Árvore de Extensão Mínima");
			texto = ler.next();
			switch (Integer.parseInt(texto)) {
			case 1:
				menu.exibirGrafo();
				break;
			case 2:
				menu.exibirAEM();
				break;

			default:
				System.out.println("Digite uma das opções!");
				System.out.println("");
				break;
			}
//			System.out.println("(Para encerrar, digite 'fim')");
//			System.out.println("");
		}
	}

	private void exibirAEM() {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		ArvoreGeradora arvoreGeradora = new ArvoreGeradora();
		arvoreGeradora.setListaVertices(listaVertices);
		arvoreGeradora.setListaArestas(listaArestas);
		Grafo grafo = new Grafo(arvoreGeradora.getListaVerticesIncluidos(), arvoreGeradora.getListaArestasIncluidas());
		System.out.println(grafo.toString());

	}

	private void exibirGrafo() {
		// TODO Auto-generated method stub
		Grafo grafo = new Grafo(listaVertices, listaArestas);
		System.out.println(grafo.toString());

	}

	private Vertice metodoUm(int indice) {
		return listaVertices.get(indice);
	}
	
	private Vertice metodoDois(int indice) {
		return listaVertices.get(indice);
	}
	
	private void inserirAresta(int custo, int indice1, int indice2) {
		// TODO Auto-generated method stub
		Aresta aresta = new Aresta();
		aresta.setCusto(custo);
		aresta.setVertice1(metodoUm(indice1));
		aresta.setVertice1(metodoDois(indice2));
		listaArestas.add(aresta);
	}
		

	private void exibirVertices() {
		// TODO Auto-generated method stub
		int i = 0;
		Iterator<Vertice> iterator = listaVertices.iterator();
		while (iterator.hasNext()) {
			System.out.print(i + "-" + iterator.next());
			System.out.print(", ");
			i++;
		}
		System.out.println("");

	}

	private void inserirVertice(String texto) {
		// TODO Auto-generated method stub
		Vertice vertice = new Vertice();
		vertice.setNome(texto);
		listaVertices.add(vertice);

	}

}
