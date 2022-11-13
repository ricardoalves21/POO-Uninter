package empresa;

public class Real extends Moeda {

	public Real(String nome, double valor) {
		super(nome, valor);
	}
	
	public Real() {}

	@Override
	public void info() {
		System.out.println(nome + " - " + valor);
	}

	@Override
	public double converter() {
		return valor * 1.00;
	}

}
