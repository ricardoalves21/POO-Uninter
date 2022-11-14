package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		System.out.print("-> ");		
		opcao = teclado.nextInt();
		System.out.println("------------------------");	
		
		Moeda moeda; // criando a variavel para acessar atributos e metodos da classe Moeda
		Cofrinho cofrinho = new Cofrinho(); // criando o objeto para acessar os métodos da classe Cofrinho
		
		while(opcao != 0) { // enquanto não escolher zero
			
			switch (opcao) { // inicio do switch case
			
			case 1: // opção para adicionar moedas
				System.out.println("1. Real");
				System.out.println("2. Dolar");
				System.out.println("3. Euro");
				System.out.print("Escolha a Moeda: ");
				int moedaEscolhida = teclado.nextInt();
				System.out.println("------------------------");
				
				if (moedaEscolhida == 1) { // caso opte pela moeda Real
					System.out.print("Vai guardar quantos Reais? ");
					Real real = new Real("Real", teclado.nextDouble());
					moeda = real;					
					cofrinho.adicionar(real);
					break;
				} 
				else if (moedaEscolhida == 2) { // caso opte pela moeda Dolar
					System.out.print("Vai guardar quantos Dolares? ");
					Dolar dolar = new Dolar("Dolar", teclado.nextDouble());
					moeda = dolar;					
					cofrinho.adicionar(dolar);
					break;
				}
				else if (moedaEscolhida == 3) { // caso opte pela moeda Euro
					System.out.print("Vai guardar quantos Euros? ");
					Euro euro = new Euro("Euro", teclado.nextDouble());
					moeda = euro;					
					cofrinho.adicionar(euro);
					break;
				}
				else { // caso não escolha nenhuma das opções de moedas
					System.out.println("Você não escolheu uma moeda válida!");
				}
				break;
				
			case 2: // opção para remover moedas
				System.out.println("1. Real");
				System.out.println("2. Dolar");
				System.out.println("3. Euro");
				System.out.print("Escolha a Moeda: ");
				int moedaEscolhidaRemover = teclado.nextInt();
				System.out.println("------------------------");
				
				if (moedaEscolhidaRemover == 1) {  // para remover Reais
					System.out.print("Vai remover quantos Reais? ");
					Real real = new Real("Real", teclado.nextDouble());
					moeda = real;					
					cofrinho.remover(real);
					break;
				} 
				else if (moedaEscolhidaRemover == 2) { // para remover Dolares
					System.out.print("Vai remover quantos Dolares? ");
					Dolar dolar = new Dolar("Dolar", teclado.nextDouble());
					moeda = dolar;					
					cofrinho.remover(dolar);
					break;
				}
				else if (moedaEscolhidaRemover == 3) { // para remover Euros
					System.out.print("Vai remover quantos Euros? ");
					Euro euro = new Euro("Euro", teclado.nextDouble());
					moeda = euro;					
					cofrinho.remover(euro);
					break;
				}
				else { // caso escolha uma opção não listada
					System.out.println("Você não escolheu uma moeda válida!");
				}
				break;
				
			case 3: // para listar as moedas do cofrinho
				cofrinho.listagemMoedas();
				break;
				
			case 4: // para converter todas as moedas do cofrinho em Reais e totaliza-las
				System.out.printf("O total convertido para Real é %.2f\n", cofrinho.converterMoedas());				
				break;
				
			default: // caso escolha uma opção não listada
				System.out.println("Opção inválida!");
			}
			System.out.println("------------------------");
			System.out.println("COFRINHO:");
			System.out.println("1-Adicionar Moeda");
			System.out.println("2-Remover Moeda");
			System.out.println("3-Listar Moedas");
			System.out.println("4-Calcular total convertido para Real");
			System.out.println("0-Encerrar");
			System.out.print("-> ");		
			opcao = teclado.nextInt();
			System.out.println("------------------------");
		}
		System.out.println("Obrigado por usar nosso software!");
		System.out.println();
		teclado.close();
	}

}
