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
		
		Moeda moeda; // criando a variavel para acessar atributos e metodos
		Cofrinho cofrinho = new Cofrinho(); // criando o objeto para acessar os métodos do menu
		
		while(opcao != 0) {
			
			switch (opcao) {
			
			case 1:
				System.out.println("1. Real");
				System.out.println("2. Dolar");
				System.out.println("3. Euro");
				System.out.print("Escolha a Moeda: ");
				int moedaEscolhida = teclado.nextInt();
				System.out.println("------------------------");
				
				if (moedaEscolhida == 1) {
					System.out.print("Vai guardar quantos Reais? ");
					Real real = new Real("Real", teclado.nextDouble());
					moeda = real;					
					cofrinho.adicionar(real);
					break;
				} 
				else if (moedaEscolhida == 2) {
					System.out.print("Vai guardar quantos Dolares? ");
					Dolar dolar = new Dolar("Dolar", teclado.nextDouble());
					moeda = dolar;					
					cofrinho.adicionar(dolar);
					break;
				}
				else if (moedaEscolhida == 3) {
					System.out.print("Vai guardar quantos Euros? ");
					Euro euro = new Euro("Euro", teclado.nextDouble());
					moeda = euro;					
					cofrinho.adicionar(euro);
					break;
				}
				else {
					System.out.println("Você não escolheu uma moeda válida!");
				}
				break;
				
			case 2: 
				System.out.println("1. Real");
				System.out.println("2. Dolar");
				System.out.println("3. Euro");
				System.out.print("Escolha a Moeda: ");
				int moedaEscolhidaRemover = teclado.nextInt();
				System.out.println("------------------------");
				
				if (moedaEscolhidaRemover == 1) {
					System.out.print("Vai remover quantos Reais? ");
					Real real = new Real("Real", teclado.nextDouble());
					moeda = real;					
					cofrinho.remover(real);
					break;
				} 
				else if (moedaEscolhidaRemover == 2) {
					System.out.print("Vai remover quantos Dolares? ");
					Dolar dolar = new Dolar("Dolar", teclado.nextDouble());
					moeda = dolar;					
					cofrinho.remover(dolar);
					break;
				}
				else if (moedaEscolhidaRemover == 3) {
					System.out.print("Vai remover quantos Euros? ");
					Euro euro = new Euro("Euro", teclado.nextDouble());
					moeda = euro;					
					cofrinho.remover(euro);
					break;
				}
				else {
					System.out.println("Você não escolheu uma moeda válida!");
				}
				break;
				
			case 3: 
				cofrinho.listagemMoedas();
				break;
				
			case 4: 
				System.out.printf("O total convertido para Real é %.2f\n", cofrinho.converterMoedas());				
				break;
				
			default:
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
	}

}
