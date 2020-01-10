package sessao8.OO.Introducao;

public class Employee {
	public String name;
	public double groosSalary;
	public double tax;
	
	public double netSalary() { //salario liquido
		return groosSalary - tax;
	}
	
	public void increaseSalary(double percentage) { //aumentar salario
		groosSalary += groosSalary * percentage/100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
