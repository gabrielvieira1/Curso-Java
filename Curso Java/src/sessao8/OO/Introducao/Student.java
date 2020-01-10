package sessao8.OO.Introducao;

public class Student {
	public String name;
	public String resultado;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String resultado() {
	
		if (finalGrade() < 60) {
			resultado = "FAILED";
			return resultado + "\nMISSING " + String.format("%.2f", (60 - finalGrade())) + " POINTS";
		} else if (finalGrade() >= 60 && finalGrade() <= 100) {
			resultado =  "PASS";
		}
		return resultado;
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", finalGrade());
	}

}
