package empresa;

public class Aluno {
	
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	public Aluno() {		
	}

	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}
	
	public double pagamento(double desconto) {
		return curso.mensalidade - (curso.mensalidade * desconto);
	}
	
	void info() {
		System.out.println("Nome Aluno: " + nome);
		System.out.println("Matricula Aluno: " + matricula);
		System.out.println("Desconto Aluno: " + desconto);
		curso.info();
	}

}
