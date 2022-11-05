package empresa;

public class Funcionario implements Imprimivel {
	
	protected String nome;
	protected String cpf;
	
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}


	@Override
	public void imprimir() {
		System.out.println("Funcionário");		
		System.out.println("Nome: " + nome);		
		System.out.println("Cpf: " + cpf);		
		System.out.println("----------------");
	}

}
