package sessao14.ExercicioDeFixacao;

public class ImportProduct extends Product{
	
	private Double customsFee;
	
	public ImportProduct() {
		super();
	}

	public ImportProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + String.format("%.2f", totalPrice()) + "(Customs fee: $ " + customsFee + ")";
	}
	
	public double totalPrice() {
		return price + customsFee; 
	}
}
