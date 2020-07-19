package sessao16.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
	
	static List<Product> list = new ArrayList<>();
	static Product product = new Product();
	
	static File path;
	static String sourceFileStr;
	static File targetFileStr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		System.out.println("Enter file path");
		sourceFileStr = sc.nextLine();
		
		path = new File(sourceFileStr);
		
		
		boolean sucess = new File(sourceFileStr + "/out").mkdir();
		
		System.out.println("Produto");
		String itemCsv = sc.nextLine();
		String[] fields = itemCsv.split(", ");
		//",|, "
		//",|,\\s" 
		String name = fields[0];
		double price = Double.parseDouble(fields[1]);
		int quantity = Integer.parseInt(fields[2]);
		
		list.add(new Product(name, price, quantity));
		create();
		reader();
		
	}
	
	public static void create() {
		File[] files = path.listFiles(File::isDirectory);
		
		for (File file : files) {
			if (file.getName().equalsIgnoreCase("out")) {
				targetFileStr = new File(file.getPath() + "/summary.csv");
			}
		}
	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr, true))) {
			
			for (Product item : list) {
				bw.write(item.getName() + "," + String.format("%.2f", item.total()));
			//	bw.write(item.getName() + "," + item.getPrice() + "," + item.getQuantity());
				bw.newLine();
			}

			System.out.println(targetFileStr + " CREATED!");
			
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

	}
	
	public static void reader() {
		File[] files = path.listFiles(File::isDirectory);
		
		for (File file : files) {
			if (file.getName().equalsIgnoreCase("out")) {
				targetFileStr = new File(file.getPath() + "/summary.csv");
			}
		}
		try (BufferedReader br = new BufferedReader(new FileReader(targetFileStr)))  {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			// leitura do arquivo pro objeto
		/*	String itemCsv = br.readLine();
			while (itemCsv != null) {
				String[] fields = itemCsv.split(",|,\\s");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
			//	System.out.println("Entrou: " + name + " - " + price);
				System.out.println("Entrou: " + name + " - " + price + " - " + quantity);
				System.out.println(list);
				
				itemCsv = br.readLine();
			}*/
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
	}

}
