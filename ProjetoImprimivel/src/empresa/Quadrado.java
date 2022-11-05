package empresa;

public class Quadrado implements Imprimivel {
	
	protected int medidaLado;

	
	public Quadrado(int medidaLado) {
		this.medidaLado = medidaLado;
	}


	@Override
	public void imprimir() {
		System.out.println("Quadrado");		
		System.out.println("Medida Lado: " + medidaLado);		
		System.out.println("Area: " + (4 * medidaLado));
		System.out.println("----------------");
	}
		

}
