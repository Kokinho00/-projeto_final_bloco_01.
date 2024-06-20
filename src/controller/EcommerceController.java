package controller;

import java.util.ArrayList;

import ecommerce.model.Adega;
import ecommerce.model.Produto;
import repository.EcommerceRepository;
	


public class EcommerceController implements EcommerceRepository{
	
	private ArrayList<Adega> listarProdutos = new ArrayList<Adega>();
	int numero =0;

	@Override
	public void listarTodosProdutos() {
		for(Produto produto : listarProdutos) {
				produto.visualizarProduto();	
		}
		
		
	}

	@Override
	public void cadastrarProduto(Adega adega) {
		listarProdutos.add(adega);
		System.out.println(" O Produto do tipo " + adega.getTipo() + " foi adicionado com sucesso");
		
		
		
	

	
	}

	@Override
	public void deletarProduto(int numero) {
			var adega = buscarNaCollection(numero);
			
			if (adega != null) {
				if (listarProdutos.remove(adega) == true)
					System.out.println("O produto " + numero + " foi deletado com sucesso");
			}else
				System.out.println("O produto " + numero + " não foi encontrado");
	}
		
		
	

	@Override
	public void atualizarProduto( Adega adega) {
		var buscarAdega = buscarNaCollection(adega.getNumero());
		
		if(buscarAdega != null) {
			listarProdutos.set(listarProdutos.indexOf(buscarAdega), adega);
			System.out.println("O produto " + adega.getNumero() + " foi atualizado com sucesso!");		
			
		}else
			System.out.println("O produto " + adega.getNumero() + " não foi encontrado");
		
	}
	public Adega buscarNaCollection(int numero) {
		for(var adega : listarProdutos) {
			if(adega.getNumero() == numero) {
				return adega;
			}
		}
		return null;
	}
	public int gerarNumero() {
		return ++ numero;
	
	}
	
	

}
