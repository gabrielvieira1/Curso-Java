package sessao16.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesProgram {
	
	public static void main(String[] args) {
	/*	// FileReader e BufferedReader
		
		String path = "/media/gabriel/NOVO/Eclipse/git/Java-curso-completo/Curso Java/src/sessao16/TrabalahndoComArquivos/teste.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	*/	
		// FileWriter e BufferedWriter
		
		String path = "/media/gabriel/NOVO/Eclipse/git/Java-curso-completo/Curso Java/src/sessao16/TrabalhandoComArquivos/teste.txt";
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
