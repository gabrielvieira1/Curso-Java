package sessao14.ExercicioDeFixacaoFinal;

public class Company extends TaxPayer{
	
	private int numberOfEmployess;

	public Company() {
		super();
	}

	public Company(String name, double anualIncome, int numberOfEmployess) {
		super(name, anualIncome);
		this.numberOfEmployess = numberOfEmployess;
	}

	public int getNumberOfEmployess() {
		return numberOfEmployess;
	}

	public void setNumberOfEmployess(int numberOfEmployess) {
		this.numberOfEmployess = numberOfEmployess;
	}

	@Override
	public double tax() {
		if (numberOfEmployess > 10) {
			return (getAnualIncome() * 0.14);
		}
		return getAnualIncome() * 0.16;
	}
	

}
