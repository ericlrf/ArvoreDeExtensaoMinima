package projetoAED;

public class Vertice implements Comparable<Vertice> {

	String nome;

	public Vertice(String nome) {
		super();
		this.nome = nome;
	}

	public Vertice() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome + "";
	}

	@Override
	public int compareTo(Vertice vertice) {
		return this.getNome().compareToIgnoreCase(vertice.getNome());
	}
}
