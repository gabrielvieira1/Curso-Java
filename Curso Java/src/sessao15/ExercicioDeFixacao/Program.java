package sessao15.ExercicioDeFixacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdraw = sc.nextDouble();;
			Account account = new Account(number, holder, balance, withdraw);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
			
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}
