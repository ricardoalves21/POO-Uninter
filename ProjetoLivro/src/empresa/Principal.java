package empresa;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital livroA = new LivroDigital("Senhor dos Aneis",
											   new Autor("Tolkien", "Britanico", "tolkien@email.com"),
											   "Aventura",
											   5,
											   10000,
											   3500);
		
		LivroFisico livroB = new LivroFisico("Sherlock Holmes", 
											  new Autor("Sir Arthur Conan Doyle", "Britanico", "authur@email.com"), 
											  "Aventura", 
											  2, 
											  50000, 
											  2500);
		
		Livro livro;  // Perceba que o objeto 'livro' da classe 'Livro' não está sendo instanciado.
		
		livro = livroA;  // A variável 'livro' neste momento está apondando para o objeto 'livroA' ou seja, 'LivroDigital'
		livro.info();
		
		System.out.println("---------------------------");
		
		livro = livroB;  // A variável 'livro' neste momento está apondando para o objeto 'livroB' ou seja, 'LivroFisico'
		livro.info();
		
	}	
	
}
