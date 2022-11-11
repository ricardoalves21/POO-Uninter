package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}
	
	public void listagemMoedas() {
		for (Moeda m : listaMoedas) {
			System.out.println(m);
		}		
	}

}
