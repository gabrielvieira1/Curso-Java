package sessao16.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class TesteProduto {
	
	static Scanner sc = new Scanner(System.in);
	static File path = null;
	static String strPath = null;
	static boolean subDir;
	static Produto produto = null;
	static File newPath = null;
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter a folder path: ");
		strPath = sc.nextLine();
		
		path = new File(strPath);
		subDir = new File(strPath + "/out").mkdir();
	
		
		System.out.println("produto: ");
		String nome = sc.nextLine();
		double preco = sc.nextDouble();
		int quantidade = sc.nextInt();
		
		produto = new Produto(nome, preco, quantidade);
		
		String textoSeparado = produto.toString();
		
		criarArquivo(textoSeparado);
		System.out.println();
		lerArquivo();
		
		sc.close();
	}
	
	public static void criarArquivo(String arquivo) {
		File[] files = path.listFiles(File::isDirectory);
		
		for (File file : files) {
			if (file.getName().equalsIgnoreCase("out")) {
				newPath = new File(file.getPath() + "/summary.csv");
			}
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath, true))) {
			bw.write(arquivo);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivo() {
		try (BufferedReader br = new BufferedReader(new FileReader(newPath))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
