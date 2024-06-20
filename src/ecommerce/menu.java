package ecommerce;

import java.util.Scanner;

public class menu {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, bebida;
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                ADEGA DO FLAVIO                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Consultar produtos                   ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("            2 - Ajuda                                ");
			System.out.println("            3 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			if(opcao == 3) {
				System.out.println("Até a próxima" );
				leia.close();
				System.exit(0);
				
			}if(opcao == 2) {
					System.out.println("Entre em contato pelo whatsapp: 11967421552 ");
				
				
				
			}if(opcao >= 4 && opcao <= 0 ) {
				System.out.println("Digite uma opção válida");
				
			}if(opcao == 1) {
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                ADEGA DO FLAVIO                      ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("       1 - Refrigerantes                             ");
				System.out.println("       2 - Cervejas                                  ");
				System.out.println("       3 - Sucos                                     ");
				System.out.println("                                                     ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     ");
				
				bebida = leia.nextInt();
				
				switch (bebida) {
					case 1:
						System.out.println("Coca-cola, Fanta uva e guarana");
						
						break;
					case 2:
						System.out.println("Itaipava, Brahma e Skol");
						
						break;
					case 3:
						System.out.println("Del valle e Su fresh");
						
						default:
							System.out.println("opção inválida");
				}
				}
			}
		}
	}


