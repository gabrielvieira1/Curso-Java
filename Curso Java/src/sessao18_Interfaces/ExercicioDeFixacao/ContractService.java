package sessao18_Interfaces.ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContractService {
	PaypalService paypal = new PaypalService();
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	List<Installment> list = new ArrayList<>();

	public ContractService() {
	}

	public void processContract(Contract contract, Integer months) {

		cal.setTime(contract.getDate());
		if (months == 1) {
			cal.add(Calendar.DAY_OF_MONTH, 30);
			date = cal.getTime();
			Installment installment = new Installment(date, paypal.paymentFree(contract.getTotalValue()));
			list.add(installment);
		} else {
			for (int i = 1; i <= months; i++) {

				cal.add(Calendar.DAY_OF_MONTH, 30);
				date = cal.getTime();
				double newValue = contract.getTotalValue() / months;
				Installment installment = new Installment(date, paypal.interest(newValue, i));
				list.add(installment);
			}
		}
		for (Installment inst : list) {
			System.out.println(inst.toString());
		}
	}
}
