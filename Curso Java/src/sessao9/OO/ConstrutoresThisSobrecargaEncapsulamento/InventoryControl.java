package sessao9.OO.ConstrutoresThisSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class InventoryControl {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		InventoryControlProduct product1 = new InventoryControlProduct();
		
	//	InventoryControlProduct product = new InventoryControlProduct("TV", 900, 10);
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = scan.next();
		System.out.print("Price: ");
		double price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();
		InventoryControlProduct product = new InventoryControlProduct(name, price, quantity);
		InventoryControlProduct product3 = new InventoryControlProduct(name, price);
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = scan.nextInt();
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
