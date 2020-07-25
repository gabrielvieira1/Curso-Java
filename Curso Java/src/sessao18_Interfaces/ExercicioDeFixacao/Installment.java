package sessao18_Interfaces.ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Installment {

	private Date dueDate;
	private Double amount;
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();

	public Installment() {
	}

	public Installment(Date date, Double totalValue) {
		this.dueDate = date;
		this.amount = totalValue;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String toString() {
		return sdf.format(getDueDate()) + " - " + getAmount();
	}

}
