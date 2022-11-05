package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Desktop compA = new Desktop(8, 4, 600);
		Notebook compB = new Notebook(8, 4, 15);
		
		Computador comp;  // Declarando a variavel de uma classe abstrata
		
		ArrayList<Computador> listaComputadores = new ArrayList();
		
		listaComputadores.add(compA);  // Adicionando na lista um objeto já criado da classe 'Desktop'
		listaComputadores.add(compB);  // Adicionando na lista um objeto já criado da classe 'Notebook'
		listaComputadores.add(new Desktop(16, 8, 1200));  // Adicionando na lista um novo objeto criado da classe 'Desktop'
		listaComputadores.add(new Notebook(16, 8, 18));  // Adicionando na lista um novo objeto criado da classe 'Notebook'
		
		double total = 0;		
		for(Computador c : listaComputadores) {  // Para cada computador 'c' dentro da listaComputadores
			total += c.calculaValor();  // Aqui está calculando o valor de cada computador que está na lista
		}
		
		System.out.println("Total do valor: " + total);
		
	}

}
