package sessao18_Interfaces.ExercicioDeFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ContractService contractService = new ContractService();

		System.out.println("EnterContract data");
		System.out.print("Number: ");
		int numberContract = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double amount = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int months = sc.nextInt();

		System.out.println("Installments:");
		Contract contract = new Contract(numberContract, date, amount);
		contractService.processContract(contract, months);

	}

}
