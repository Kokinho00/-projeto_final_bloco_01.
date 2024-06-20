package ecommerce;

import java.io.IOException;
import java.util.Scanner;

import controller.EcommerceController;
import ecommerce.model.Adega;

public class menu {
	
	public static void main(String[] args) {
		
		EcommerceController produtos = new EcommerceController();
		
		
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, quantidade, numero;
		String tipo, bebida;
		float valor;
		
		
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                ADEGA DO FLAVIO                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar                            ");
			System.out.println("            2 - Listar produtos                      ");
			System.out.println("            3 - Atualizar produtos                   ");
			System.out.println("            4 - Deletar produtos                     ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("Cadastrar produto\n");
					
					System.out.println(" Digite o nome do produto: ");
					leia.skip("\\R?");
					tipo = leia.nextLine();
					System.out.println(" Digite a quantidade: ");
					quantidade = leia.nextInt();
					System.out.println(" Digite o valor do produto");
					valor = leia.nextFloat();
					System.out.println(" A bebida é refrigerante ou suco?: ");
					leia.skip("\\R?");
					bebida = leia.nextLine();
					
					produtos.cadastrarProduto(new Adega(produtos.gerarNumero(),bebida, valor, quantidade, tipo));
					
					
					
					
					
					keyPress();
					leia.skip("\\R?");
					break;
				case 2:
					System.out.println("Listar produto\n");
					produtos.listarTodosProdutos();
					
					
					keyPress();
					leia.skip("\\R?");
					break;
				case 3:
					System.out.println("Atualizar produto");
					
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					var buscarAdega = produtos.buscarNaCollection(numero); 
					
					if(buscarAdega != null) {
						System.out.println(" Digite o nome do produto: ");
						leia.skip("\\R?");
						tipo = leia.nextLine();
						System.out.println(" Digite a quantidade: ");
						quantidade = leia.nextInt();
						System.out.println(" Digite o valor do produto");
						valor = leia.nextFloat();
						System.out.println(" A bebida é refiregrante ou suco?: ");
						leia.skip("\\R?");
						bebida = leia.nextLine();
						
						produtos.atualizarProduto(new Adega(numero,bebida, valor, quantidade, tipo));
						
					}else {
						System.out.println("Número invalido");
					}
					
					keyPress();
					leia.skip("\\R?");
					break;
				case 4:
					System.out.println("Deletar produto");
					
					
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					produtos.deletarProduto(numero);
					
					keyPress();
					leia.skip("\\R?");
					break;
				case 5:
					System.out.println("Até a próxima");
					leia.close();
					System.exit(0);
					break;
					default:
						System.out.println("Digite uma opção válida");
						keyPress();
						
			}	
		}
			
	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void keyPress() {
		try {
			System.out.println("Pressione Enter para continuar ... \n\n\n\n\n");
			System.in.read();
		
		
		}catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}


