package projetoAED;

public class Vertice {

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
	
	
}
