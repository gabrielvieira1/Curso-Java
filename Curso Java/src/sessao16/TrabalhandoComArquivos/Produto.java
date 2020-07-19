package sessao16.TrabalhandoComArquivos;

public class Produto {
	private String nome = null;
	private double preco = 0;
	private int quantidade = 0;
	
	public Produto() {
		this.nome = null;
		this.preco = 0;
		this.quantidade = 0;
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total() {
		return getPreco() * getQuantidade();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(", " + total());
		return sb.toString();
	}
}
