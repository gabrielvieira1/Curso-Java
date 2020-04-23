package sessao14.ExercicioDeFixacaoFinal;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.println(String.format("Tax payer #%d data:", i));
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double icome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double expenditures = sc.nextDouble();
				list.add(new Individual(name, icome, expenditures));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, icome, employees));
			}
			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0;
		for(TaxPayer tax : list) {
			double t = tax.tax();
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", t));
			total += tax.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", total));
		
		
		
	}

}
