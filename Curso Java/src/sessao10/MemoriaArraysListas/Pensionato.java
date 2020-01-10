package sessao10.MemoriaArraysListas;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int posicao = 0;
		
		System.out.print("How many rooms will be rented?");
		int qtd = sc.nextInt();
		PensionatoQuartos[] qtdEstudantes = new PensionatoQuartos[10];
		
		for(int i = 1; i <= qtd; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			posicao = sc.nextInt();
			qtdEstudantes[posicao] = new PensionatoQuartos(nome, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < qtdEstudantes.length; i++) {
			if (qtdEstudantes[i] != null) {
				System.out.println(i + ": " + qtdEstudantes[i]);
			}
		}
		
		sc.close();
		
	}

}
