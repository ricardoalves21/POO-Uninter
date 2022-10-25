package empresa;

public class Principal {

	public static void main(String[] args) {
 
		Nota mario = new Nota();
		
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(8);
		mario.resultado();
		mario.avaliarFaltas();
		
		Nota luigi = new Nota(11, 12, 7);
		luigi.resultado();
		luigi.avaliarFaltas();

	}

}
