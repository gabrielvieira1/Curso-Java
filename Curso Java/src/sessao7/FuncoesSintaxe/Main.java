package sessao7.FuncoesSintaxe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three number: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		
		scan.close();
	}
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
