package empresa;

public class Dolar extends Moeda {

	public Dolar(String nome, double valor) {
		super(nome, valor);
	}
	
	public Dolar() {}

	@Override
	public void info() {
		System.out.println(nome + " - " + valor);
	}

	@Override
	public double converter() {
		return valor * 5.35;
	}

}
