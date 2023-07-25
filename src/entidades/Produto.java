package entidades;

public class Produto {

	private String produto;
	private Double preço;
	
	public Produto() {
	}

	public Produto(String produto, Double preço) {
		this.produto = produto;
		this.preço = preço;
	}

	public String getproduto() {
		return produto;
	}

	public void setproduto(String nomeproduto) {
		this.produto = nomeproduto;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	

	
}
