package empresa;

public class Ingresso {
	
	public String nomeEvento;
	public double valor;
	
	
	public Ingresso(String nomeEvento, double valor) {
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}
	
	public Ingresso() {}
	
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void info() {
		System.out.println("Nome Evento: " + nomeEvento);
		System.out.println("Valor: " + valor);
	}

}
