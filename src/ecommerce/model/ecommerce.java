package ecommerce.model;

public class ecommerce {
	
	private int numero;
	private int bebida;
	private int tipo;
	private float valor;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getBebida() {
		return bebida;
	}
	public void setBebida(int bebida) {
		this.bebida = bebida;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public ecommerce(int numero, int bebida, int tipo, float valor) {
		this.numero = numero;
		this.bebida = bebida;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	

}
