package sessao18_Interfaces.ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PaypalService implements OnlinePaymentService {

	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();

	public PaypalService() {
	}

	@Override
	public Double paymentFree(Double amount) {
		double jurosSimples = amount + amount * 0.01;
		double quotas = jurosSimples + jurosSimples * 0.02;
		return quotas;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		double jurosSimples = amount + amount * 0.01 * months;
		double quotas = jurosSimples + jurosSimples * 0.02;
		return quotas;

	}

}
