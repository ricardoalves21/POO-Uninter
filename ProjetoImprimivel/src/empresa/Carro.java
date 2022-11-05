package empresa;

public class Carro implements Imprimivel {
	
	protected String marca;
	protected String cor;
	protected int portas;
	
	
	public Carro(String marca, String cor, int portas) {
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
	}


	@Override
	public void imprimir() {
		System.out.println("Carro");		
		System.out.println("Marca: " + marca);		
		System.out.println("Cor: " + cor);		
		System.out.println("Portas: " + portas);	
		System.out.println("----------------");
	}
	
	

}
