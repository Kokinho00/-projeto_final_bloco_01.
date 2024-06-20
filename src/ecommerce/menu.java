package ecommerce;

import java.io.IOException;
import java.util.Scanner;

public class menu {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
					keyPress();
					leia.skip("\\R?");
					break;
				case 2:
					System.out.println("Listar produto\n");
					keyPress();
					leia.skip("\\R?");
					break;
				case 3:
					System.out.println("Atualizar produto");
					keyPress();
					leia.skip("\\R?");
					break;
				case 4:
					System.out.println("Deletar produto");
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

	public static void keyPress() {
		try {
			System.out.println("Pressione Enter para continuar ... \n\n\n\n\n");
			System.in.read();
		
		
		}catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}


