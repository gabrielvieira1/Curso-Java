package sessao8.OO.Introducao;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSemOrientacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		TriangleComOrientacao x, y;
		x = new TriangleComOrientacao();
		y = new TriangleComOrientacao();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Largeer area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		scan.close();
	}

}
