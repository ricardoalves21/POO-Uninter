package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		Cofrinho cofrinho;
		Moeda moeda;
		
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
		int opcao = teclado.nextInt();
		
		while(opcao != 0) {
			
			switch (opcao) {
			case 1: 				
				System.out.println("Escolha a Moeda:");
				System.out.println("1. Real");
				System.out.println("2. Dolar");
				System.out.println("3. Euro");
				int moedaEscolhida = teclado.nextInt();
				
				if (moedaEscolhida == 1) {
					System.out.println("Digite o valor:");
					double valor = teclado.nextDouble();
					cofrinho.adicionar(moeda);
				} 
				else if (moedaEscolhida == 2) {
					
				}
				else if (moedaEscolhida == 3) {
					
				}
				else {
					System.out.println("Você não escolheu uma moeda válida!");
				}
				break;
				
			case 2: 
				
				break;
				
			case 3: 
				
				break;
				
			default:
				System.out.println("Opção inválida!");
			}
		}
		
		
		
		

	}

}
