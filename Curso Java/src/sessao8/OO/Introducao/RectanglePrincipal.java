package sessao8.OO.Introducao;

import java.util.Locale;
import java.util.Scanner;

public class RectanglePrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.height = scan.nextDouble();
		rectangle.width = scan.nextDouble();
		
		System.out.printf("AREA = %.2f%n" , rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		scan.close();
		
	}

}
