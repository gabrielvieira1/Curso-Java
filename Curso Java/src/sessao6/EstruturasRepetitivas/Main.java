 package sessao6.EstruturasRepetitivas;
 import java.util.Scanner;
 import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	/*	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int soma = 0;
		for(int i =0; i<n;i++) {
			int x = scan.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		scan.close();
		
		*/
		
	/*	
	 	Locale.setDefault(Locale.US); // aqui ele recebe "." ao inves de ",".
		Scanner scan = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Calsius: ");
			double C = scan.nextDouble();
			double F = 9.0*C/5.0+32.00;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = scan.next().charAt(0);
		} while (resp != 'n');
		
		*/
		String original = "- abcde FGHIJ ABC abc DEFG  -";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9) -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc','xy') : -" + s07 + "-");
		System.out.println("index OF 'bc': " + i);
		System.out.println("Last index OF 'bc': " + j);
		
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]); 
		
		
		
	}

}
