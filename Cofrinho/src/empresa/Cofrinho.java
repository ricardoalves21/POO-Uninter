package empresa;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	
	private ArrayList<Moeda> moedas = new ArrayList();
	
	public void confrinho() {		
	}
	
	public void adicionar(Moeda m) {		
		moedas.add(m);
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for(Moeda itemMoeda : moedas) {
			total += itemMoeda.getValor();
		}
		
		return total;
	}

}
