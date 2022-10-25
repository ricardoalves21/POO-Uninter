package empresa;

public class Nota {
	
	private double nota1;
	private double nota2;
	private int faltas;
	
	void resultado() {
		double media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
		
		if(media < 4) {
			System.out.println("Reprovado");
		} else if(media < 7) {
			System.out.println("Exame Final");
		} else {
			System.out.println("Aprovado");
		}
	}
	
	void setNota1(double nota1) {
		if (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota inválida");
		} else {
			this.nota1 = nota1;	
		}		
	}
	
	void setNota2(double nota2) {
		if (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota inválida");
		} else {
			this.nota2 = nota2;	
		}	
	}
	
	public double getNota1() {
		return this.nota1;
	}
	
	public double getNota2() {
		return this.nota2;
	}
	
	public int getFaltas() {
		return this.faltas;
	}
	
	void setFaltas(int nFaltas) {
		this.faltas = nFaltas;
	}
	
	void avaliarFaltas() {		
		if(this.faltas > 7) {
			System.out.println("Reprovado por faltas");
		}
	}
	
	public Nota() {		
	}

	public Nota(double nota1, double nota2, int faltas) {
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}
	
	
}
