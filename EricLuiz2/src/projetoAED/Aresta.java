package projetoAED;

public class Aresta {

	int custo;
	Vertice vertice1;
	Vertice vertice2;
	
	public Aresta(int custo, Vertice vertice1, Vertice vertice2) {
		super();
		this.custo = custo;
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
	}
	
	public Aresta() {
		
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}

	public Vertice getVertice1() {
		return vertice1;
	}

	public void setVertice1(Vertice vertice1) {
		this.vertice1 = vertice1;
	}

	public Vertice getVertice2() {
		return vertice2;
	}

	public void setVertice2(Vertice vertice2) {
		this.vertice2 = vertice2;
	}

	@Override
	public String toString() {
		return vertice1
				+ "--" + vertice2;
	}
	
	
}
