package ecommerce.model;

public class Produto {
	
	String tipo;
	float valor;
	int quantidade;

	public Produto(String tipo, float valor, int quantidade) {
		this.tipo = tipo;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto() {
		
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String Tipo, String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizarProduto() {
		
		
		System.out.println("Tipo de bebida: " + this.getTipo());	
		System.out.println("Quantidade em estoque: " + this.getQuantidade());
		System.out.println("Preço: " + this.valor);

	}
}
