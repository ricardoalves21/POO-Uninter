package empresa;

public class Curso {
	
	String nome;
	double mensalidade;
	
	public Curso() {		
	}

	public Curso(String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
	
	void info() {
		System.out.println("Nome Curso: " + nome);
		System.out.println("Mensalidade do Curso: " + mensalidade);
	}

}
