package sessao8.OO.Introducao;

public class CurrencyConverter {
	
	public static double dollar;
	public static double reais;
	
	public static double converter() {
		double valor = dollar * reais;
		return (valor + ((valor  * 6)/100));
	}
}
