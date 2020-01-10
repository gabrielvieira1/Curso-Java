package sessao8.OO.Introducao;

import java.util.Locale;
import java.util.Scanner;

import sessao8.OO.Introducao.Employee;

public class EmployeePrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.next();
		System.out.print("Gross salary: ");
		employee.groosSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which pecentage to increase salary? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		sc.close();
	}

}
