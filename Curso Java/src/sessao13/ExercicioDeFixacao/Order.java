package sessao13.ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	private Date moment;
	private OrderStatus status;

	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double somaTotal = 0;
		for (OrderItem ord : items) {
			somaTotal += ord.subTotal();
		}
		return somaTotal;
	}

	public String getMoment() {
		return sdf.format(moment);
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String toString() {
		OrderItem oItem = new OrderItem();
		StringBuilder sb = new StringBuilder();
		for (OrderItem orderItem : items) {
			sb.append(orderItem.getProduct());
			sb.append(", Quantity: " + orderItem.getQuantity() + ",");
			sb.append("Subtotal: " + orderItem.subTotal() + "\n");
		}
		return sb.toString();
	}

}
