package sessao18_Interfaces.ExercicioDeFixacaoCorreto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dueDate;
	private Double amount;

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
		return sdf.format(dueDate) + " - " + getAmount();
	}

}
