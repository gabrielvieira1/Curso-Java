package sessao9.OO.ConstrutoresThisSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposito, saque;
		ContaBancaria conta;
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char escolha = sc.next().charAt(0);
		
		if (escolha == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposito = sc.nextDouble();
			conta = new ContaBancaria(nome, numConta, deposito);
		} else {
			conta = new ContaBancaria(nome, numConta);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		System.out.println("Update account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println("Update account data:");
		System.out.println(conta);
		
		sc.close();
		
	}

}
