package empresa;

public abstract class Computador {
	
	protected int gbMemoria;
	protected int numProcessadores;
	
		
	public Computador(int gbMemoria, int numProcessadores) {
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}


	public abstract double calculaValor();  // Este calculo vai depender de como este método será implementado na classe que irá implementar este metodo.	

}
