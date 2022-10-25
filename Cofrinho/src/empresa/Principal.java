package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho c = new Cofrinho();
		
		c.adicionar(new Moeda("Euro", 0.5));
		c.adicionar(new Moeda("Euro", 1.0));
		c.adicionar(new Moeda("Euro", 0.1));
		c.adicionar(new Moeda("Euro", 0.05));
		
		System.out.println("O total do cofrinho é : " + c.calcularTotal());

	}

}
