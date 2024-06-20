package ecommerce.model;

public class Adega extends Produto {
	
	String bebida;
	
	public Adega(int numero, String tipo, float valor, int quantidade, String bebida) {
		super(numero, tipo, valor, quantidade);
		this.bebida = bebida;
	}
	
	public Adega() {
		
	}
	
	public String getBebida() {
		return bebida;
	}
	
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	
	public void visualizarProduto() {
		super.visualizarProduto();
		System.out.println("tipo de bebida: " + this.bebida);
	}
}

