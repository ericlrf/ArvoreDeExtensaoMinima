package projetoAED;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	ArrayList<Vertice> listaV = new ArrayList<Vertice>();
	ArrayList<Aresta> listaA = new ArrayList<Aresta>();

	Vertice vertice = new Vertice();
	Aresta aresta = new Aresta();
	Grafo grafo = new Grafo(listaV, listaA);
	ArvoreGeradora arvoreGeradora = new ArvoreGeradora();

	public Menu() {
		super();
	}

	public ArrayList<Vertice> getListaV() {
		return listaV;
	}

	public void setListaV(ArrayList<Vertice> listaV) {
		this.listaV = listaV;
	}

	public ArrayList<Aresta> getListaA() {
		return listaA;
	}

	public void setListaA(ArrayList<Aresta> listaA) {
		this.listaA = listaA;
	}

	public Vertice getVertice() {
		return vertice;
	}

	public void setVertice(Vertice vertice) {
		this.vertice = vertice;
	}

	public Aresta getAresta() {
		return aresta;
	}

	public void setAresta(Aresta aresta) {
		this.aresta = aresta;
	}

	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	public ArvoreGeradora getArvoreGeradora() {
		return arvoreGeradora;
	}

	public void setArvoreGeradora(ArvoreGeradora arvoreGeradora) {
		this.arvoreGeradora = arvoreGeradora;
	}

	public void inserirV(String texto) {
		// TODO Auto-generated method stub
		vertice.setNome(texto);
		listaV.add(vertice);

	}

	public void removerV(String texto) {
		// TODO Auto-generated method stub
		vertice.setNome(texto);
		listaV.remove(vertice);

	}

	public boolean verificaV(String texto) {
		vertice.setNome(texto);
		if (listaV.contains(vertice)) {
			return true;
		} else {
			return false;
		}
	}

	public void inserirA(String texto) {
		// TODO Auto-generated method stub
		do {
			if (verificaV(texto)) {
				inserirA(texto);
			} else {
				System.out
						.println("Selecione novamente uma opcao valida");
			}
		} while (!(verificaV(texto)));
	}

	private void removerA(String texto) {
		// TODO Auto-generated method stub

	}

	public void verGrafo() {
		System.out.println(grafo.toString());
	}

	public void verAEM() {
		System.out.println(arvoreGeradora.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String texto = null;
		Menu menu = new Menu();

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
				System.out.println("Nome do vertice: ");
				texto = ler.next();
				menu.inserirV(texto);
				System.out.println();
				break;
			case 2:
				System.out.println("Nome do vertice: ");
				texto = ler.next();
				menu.removerV(texto);
				System.out.println();
				break;
			case 3:
				System.out.println("Selecione um vertice da aresta: ");
				System.out.println(menu.getListaV().toString());
				texto = ler.next();
				menu.inserirA(texto);
				System.out.println("Selecione o outro vertice da aresta: ");
				System.out.println(menu.getListaV().toString());
				texto = ler.next();
				menu.inserirA(texto);
				System.out.println("Valor do custo da aresta: ");
				int custo = Integer.parseInt(ler.next());
				
				break;
			case 4:
				System.out.println("Nome de um vertice da aresta: ");
				System.out.println(menu.getListaV().toString());
				texto = ler.next();
				menu.removerA(texto);				
				System.out.println("Nome do outro vertice da aresta: ");
				System.out.println(menu.getListaV().toString());
				texto = ler.next();
				menu.removerA(texto);				

				break;
			case 5:
				menu.verGrafo();
				System.out.println("");
				break;
			case 6:
				menu.verAEM();
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
