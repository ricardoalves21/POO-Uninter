package empresa;

public class Euro extends Moeda {

	public Euro(String nome, double valor) {
		super(nome, valor);
	}
	
	public Euro() {}

	@Override
	public void info() {
		System.out.println(nome + " - " + valor);
	}

	@Override
	public double converter() {
		return valor * 5.44;
	}

}
