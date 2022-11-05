package empresa;

public class Desktop extends Computador {
	
	private double acessorios;


	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}


	@Override
	public double calculaValor() {
		double total = 200 * gbMemoria + 400 * numProcessadores + acessorios;
		return total;
	}
	
	

}
