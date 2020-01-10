package sessao10.MemoriaArraysListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// adicionar do arraylist
		list.add("Maria");
		list.add("alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		
		System.out.println(list.size());
		
	//	list.remove("Anna");
		
		// remover do arraylist
		
		for(String x : list) {
			System.out.print(x);
		}
		System.out.println("-----------------");
		
	//	list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------"); // tamanho do arraylist
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of bob: " + list.indexOf("Marco"));
	
		System.out.println("-----------------"); // achar nome no arraylist
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A' ).collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------"); // colocar null no nome não encontrado
		String name = list.stream().filter(x -> x.charAt(0) == 'A' ).findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("-----------------"); // colocar null no nome não encontrado
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J' ).findFirst().orElse(null);
		System.out.println(name2);
		
	}

}
