package sessao9.OO.ConstrutoresThisSobrecargaEncapsulamento;

public class ContaBancaria {
	private String nome;
	private int numeroConta;
	private double saldo;
	
		
	public ContaBancaria(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
	}
	
	public ContaBancaria(String nome, int numeroConta, double depositoIncial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		deposito(depositoIncial);
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= (saque + 5.00);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Account " +  getNumeroConta() + ", Holder: " + getNome() + ", Balance: $" +String.format("%.2f", getSaldo());
	}
	


}
