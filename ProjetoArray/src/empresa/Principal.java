package empresa;

public class Principal {

	public static int[] arrayTeste(int n) {
		return new int[n];
	}
	
	public static void main(String[] args) {	
		int tam = -10;
		int arr[];
		
		try {
			arr = arrayTeste(tam);		
			for (int i = 0; i < tam; i++) {
				System.out.println(arr[i]);
			}	
		} catch (Exception e) {
			System.out.println("Valor inválido, digite outro");
			System.out.println(e);
		}		
	}
	
}
