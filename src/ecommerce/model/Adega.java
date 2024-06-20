package ecommerce.model;

public class Adega extends Produto {
	
	int bebida;
	
	public Adega(String tipo, float valor, int quantidade, int bebida) {
		super(tipo, valor, quantidade);
		this.bebida = bebida;
	}
	
	public Adega() {
		
	}
	
	public int getBebida() {
		return bebida;
	}
	
	public void setBebida(int bebida) {
		this.bebida = bebida;
	}
	
	public void visualizarProduto() {
		super.visualizarProduto();
		System.out.println("tipo de bebida" + this.bebida);
	}
}

