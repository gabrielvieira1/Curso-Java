package sessao16.TrabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulacaoDePastasProgram {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "novoDiretorio.txt").mkdir();
		System.out.println("Directory crated sucessfully: " + sucess);
		scan.close();
	}

}
