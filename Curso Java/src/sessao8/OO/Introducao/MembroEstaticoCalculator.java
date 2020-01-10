package sessao8.OO.Introducao;

public class MembroEstaticoCalculator {
	
	/* versão 2
	  
	public final double PI = 3.14159;
	

	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public  double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	*/
	
	// versão 3
	
	public static final double PI = 3.14159;
	

	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
