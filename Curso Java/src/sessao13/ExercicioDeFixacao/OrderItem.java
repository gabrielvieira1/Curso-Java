package sessao13.ExercicioDeFixacao;

public class OrderItem {

	private Integer quantity;
	private double price;
	private Product product;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = product.getPrice();
	}

	public double subTotal() {
		return quantity * price;
	}

	public String toString() {
		return "Quntity: " + quantity + ", " + "Subtotal: " + subTotal();
	}

}
