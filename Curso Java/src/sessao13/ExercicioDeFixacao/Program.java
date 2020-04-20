package sessao13.ExercicioDeFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");
		Scanner scan = new Scanner(System.in);
		OrderItem orditem = new OrderItem();

		System.out.println("Enter cliente data:");
		System.out.println("Name: ");
		String name = scan.nextLine();
		System.out.println("Email: ");
		String email = scan.nextLine();
		System.out.println("Birth date (DD/MM/YYYY: ");
		Date date = sdf.parse(scan.next());
		Client client = new Client(name, email, date);

		System.out.println("Enter order data:");
		System.out.println("Status:");
		OrderStatus os = OrderStatus.PROCESSING;

		Order order = new Order(new Date(), os);

		System.out.println("How many items to this order?");
		int itens = scan.nextInt();

		for (int i = 0; i < itens; i++) {
			System.out.println("Enter #" + (i + 1) + " item date:");
			scan.nextLine();
			System.out.println("Product name:");
			String nameProduct = scan.nextLine();
			System.out.println("Product price:");
			double price = scan.nextDouble();
			System.out.println("Quantity:");
			int quantity = scan.nextInt();

			Product item = new Product(nameProduct, price);
			order.addItem(new OrderItem(quantity, item));
		}

		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println(client.toString());
		System.out.println("order items:");
		System.out.print(order.toString());
		System.out.println("Total price: " + order.total());

	}

}
