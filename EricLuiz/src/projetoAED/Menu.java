package projetoAED;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class Menu {

	public static void main(String[] args) {
		Collection<Vertice> vs = new TreeSet<Vertice>();
		Collection<Aresta> as = new TreeSet<Aresta>();
		Grafo grafo = new Grafo(vs, as);
		String texto = "";
		int texto1 = 0;
		String texto2 = "";
		String texto3 = "";
		for (int opcao = 10; opcao != 0;) {
			System.out.println("Selecione uma opcao: ");
			System.out.println("1-Inserir vertice");
			System.out.println("2-Remover vertice");
			System.out.println("3-Inserir aresta");
			System.out.println("4-Remover aresta");
			System.out.println("5-Visualizar grafo");
			System.out.println("6-Visualizar arvore-de-extensao-minima");
			System.out.println("0-Sair");
			Scanner ler = new Scanner(System.in);
			opcao = Integer.parseInt(ler.next());
			switch (opcao) {
			case 0:
				System.out.println("-Fim do Programa-");
				System.out.println("");
				break;
			case 1:
				System.out.println("Vertices existentes: " + vs.toString());
				System.out.println("Nome do vertice: ");
				texto = ler.next();
				if (vs.contains(new Vertice(texto.toUpperCase()))) {
					System.out.println("Vertice ja existe, escolha outro nome");
				} else {
					vs.add(new Vertice(texto.toUpperCase()));
					System.out.println("Vertice '" + texto.toUpperCase() + "' adicionado.");
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Vertices existentes: " + vs.toString());
				System.out.println("Nome do vertice: ");
				texto = ler.next();
				if (vs.contains(new Vertice(texto.toUpperCase()))) {
					System.out.println("Vertice '" + texto.toUpperCase() + "' removido.");
					vs.remove(new Vertice(texto.toUpperCase()));
					System.out.println();
				} else {
					System.out.println("Vertice nao existe, digite o nome correto");
				}
				break;
			case 3:
				System.out.println("Arestas existentes: " + as.toString());
				System.out.println("Vertices existentes: " + vs.toString());
				System.out.println("Nome de um vertice da aresta: ");
				texto2 = ler.next();
				System.out.println("Nome do outro vertice da aresta: ");
				texto3 = ler.next();
				System.out.println("Valor do custo da aresta: ");
				texto1 = Integer.parseInt(ler.next());
				if (vs.contains(new Vertice(texto2.toLowerCase())) && vs.contains(new Vertice(texto3.toLowerCase()))) {
//					if (as.contains(new Aresta(texto1, new Vertice(texto2.toLowerCase()), new Vertice(texto3.toLowerCase())))) {
//						System.out.println("Aresta ja existe, forme outra diferente");
//					} else {
						as.add(new Aresta(texto1, new Vertice(texto2.toLowerCase()), new Vertice(texto3.toLowerCase())));
						System.out.println("Aresta '" + texto2.toLowerCase() + "--" + texto3.toLowerCase() + "' de custo " + texto1 + " inserida.");						
						System.out.println();
//					}
				} else {
					System.out.println("Forme a aresta apenas com vertices existentes");
				}
				break;
			case 4:
				System.out.println("Arestas existentes: " + as.toString());
				System.out.println("Vertices existentes: " + vs.toString());
				System.out.println("Nome de um vertice da aresta: ");
				texto2 = ler.next();
				System.out.println("Nome do outro vertice da aresta: ");
				texto3 = ler.next();
				System.out.println("Valor do custo da aresta: ");
				texto1 = Integer.parseInt(ler.next());
				if (vs.contains(new Vertice(texto2.toLowerCase())) && vs.contains(new Vertice(texto3.toLowerCase()))) {
						System.out.println("Aresta '" + texto2.toLowerCase() + "--" + texto3.toLowerCase() + "' de custo " + texto1 + " removida.");
						as.remove(new Aresta(texto1, new Vertice(texto2.toLowerCase()), new Vertice(texto3.toLowerCase())));
				} else {
					System.out.println("Aresta nao existe, apague uma aresta valida");
				}
				System.out.println();
				break;
			case 5:
				System.out.println("Grafo de " + vs.size() + " vertices e " + as.size() + " arestas: ");
				System.out.println(new Grafo(vs, as).toString());
				System.out.println("");
				break;
			case 6:
				ArvoreGeradora arvore = new ArvoreGeradora(grafo);
				System.out.println("Arvore-de-extensao-minima de " + arvore.getListaVerticesIncluidos().size() + " vertices e " + arvore.getListaArestasIncluidos().size() + " arestas: ");
				System.out.println(grafo.toString());
				System.out.println("");
				break;

			default:
				System.out.println("Selecione novamente uma opcao valida");
				System.out.println("");
				break;
			}
		}
	}
}