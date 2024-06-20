package repository;

import ecommerce.model.Adega;
import ecommerce.model.Produto;

public interface EcommerceRepository {
	
	public void listarTodosProdutos();
	
	public void cadastrarProduto(Adega adega);
	
	public void deletarProduto(int numero);
	
	public void atualizarProduto(Adega adega);

}
