package sessao8.OO.Introducao;

import java.util.Locale;
import java.util.Scanner;

import sessao8.OO.Introducao.*;

public class StudentPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Nome do Aluno: ");
		student.name = sc.next();
		System.out.println("Notas: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println(student);
		System.out.println(student.resultado());
		sc.close();
		
	}

}
