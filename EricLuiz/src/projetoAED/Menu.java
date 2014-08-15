package projetoAED;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String texto = null;
		Menu menu = new Menu();
		System.out.println("-Inserir Vértices-");
		System.out.println("");
		while (texto.toLowerCase() != "fim") {
			System.out.println("Digite o nome do novo vertice: ");
			texto = ler.next();
			menu.inserirVertice(texto);
			System.out.println("(Para encerrar, digite 'fim')");
			System.out.println("");
		}
		texto = "";
		System.out.println("-Inserir Arestas-");
		System.out.println("");
		while (texto.toLowerCase() != "fim") {
			menu.exibirVertices();
			System.out.println("Escolha um dos vertices: ");
			texto = ler.next();
			menu.inserirAresta(texto);
			System.out.println("Escolha outro vertice: ");
			texto = ler.next();
			menu.inserirAresta(texto);
			System.out.println("Digite o custo da aresta: ");
			texto = ler.next();
			menu.inserirAresta(Integer.parseInt(texto));
			System.out.println("(Para encerrar, digite 'fim')");
			System.out.println("");
		}
		texto = "";
		System.out.println("-Exibir Grafo e sub-grafo-");
		System.out.println("");
		while (texto.toLowerCase() != "fim") {
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
			System.out.println("(Para encerrar, digite 'fim')");
			System.out.println("");
		}
	}

	private void exibirAEM() {
		// TODO Auto-generated method stub

	}

	private void exibirGrafo() {
		// TODO Auto-generated method stub

	}

	private void inserirAresta(int custo) {
		// TODO Auto-generated method stub

	}

	private void inserirAresta(String texto) {
		// TODO Auto-generated method stub

	}

	private void exibirVertices() {
		// TODO Auto-generated method stub

	}

	private void inserirVertice(String texto) {
		// TODO Auto-generated method stub

	}

}
