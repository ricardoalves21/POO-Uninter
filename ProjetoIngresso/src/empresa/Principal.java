package empresa;

public class Principal {

	public static void main(String[] args) {

		IngressoVip iv = new IngressoVip("Roch in Rio", 200, 100);		
		iv.info();
		
		Ingresso i = new Ingresso("Rock in Rio Pardo", 50);				
		i.info();

	}

}
