package sessao10.MemoriaArraysListas;

public class BoxingUnboxing {
	
	public String name;
	public Double price;
	public Integer quantity;

	public static void main(String[] args) {
		
		int x = 20;
	//	Object obj = x; 
		Integer obj = x; // Wrapper classe
		System.out.println(obj);
	//	int y = (int) obj;
		int y = obj * 2; // Wrapper classe
		System.out.println(y);
	}

}
