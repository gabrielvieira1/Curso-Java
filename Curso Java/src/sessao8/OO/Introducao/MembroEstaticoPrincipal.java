package sessao8.OO.Introducao;

import java.util.Locale;
import java.util.Scanner;

public class MembroEstaticoPrincipal {
	
//	public static final double PI = 3.14159; versão 1

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/* versão 2
		MembroEstaticoCalculator calc = new MembroEstaticoCalculator();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = calc.circunference(radius);
		double c = calc.circunference(radius);
		*/
		
		// versão 3
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = MembroEstaticoCalculator.circunference(radius);
		double v = MembroEstaticoCalculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", MembroEstaticoCalculator.PI);
		
		sc.close();

	}
	
/*	public static double circunference(double radius) {  versão 1
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
*/
}
