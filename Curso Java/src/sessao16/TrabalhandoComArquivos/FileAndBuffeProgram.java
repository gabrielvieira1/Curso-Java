package sessao16.TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAndBuffeProgram {

	public static void main(String[] args) {
		
		String path = "/media/gabriel/NOVO/Eclipse/git/Java-curso-completo/Curso Java/src/sessao16/TrabalhandoComArquivos/teste.txt";
		BufferedReader br = null;
		FileReader fr = null;
		try {
		//	fr = new FileReader(path);
		//	br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
