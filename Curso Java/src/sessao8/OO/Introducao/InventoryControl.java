package sessao8.OO.Introducao;

import java.util.Locale;
import java.util.Scanner;

public class InventoryControl {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		InventoryControlProduct product = new InventoryControlProduct();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scan.next();
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		scan.close();
	}

}
