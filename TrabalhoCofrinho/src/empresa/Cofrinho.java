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
			m.info();
		}		
	}
	
	public double converterMoedas() {
		double total = 0;
		for (Moeda m : listaMoedas) {
			total += m.converter();
		}	
		return total;
	}

}
