package sessao10.MemoriaArraysListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import sessao10.MemoriaArraysListas.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> obj = new ArrayList<>();

		System.out.print("How many employess will be registered? ");
		int reg = sc.nextInt();
		for (int i = 1; i <= reg; i++) {
			System.out.print("Employee #" + i + ":");
			System.out.println();
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			obj.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = obj.stream().filter(x ->  x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee objeto : obj) {
			System.out.println(objeto);
		}

		sc.close();
	}

}
