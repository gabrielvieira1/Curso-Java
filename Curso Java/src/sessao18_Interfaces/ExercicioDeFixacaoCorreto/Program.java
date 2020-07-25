package sessao18_Interfaces.ExercicioDeFixacaoCorreto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

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

		Contract contract = new Contract(numberContract, date, amount);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, months);
		
		System.out.println("Installments:");
		for (Installment installments : contract.getInstallments()) {
			System.out.println(installments.toString());
		}
		sc.close();

	}

}
