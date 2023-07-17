package entidades;

public class Produto {

	private String nomeproduto;
	private Double preço;
	
	public Produto() {
	}

	public Produto(String nomeproduto, Double preço) {
		this.nomeproduto = nomeproduto;
		this.preço = preço;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	

	
}
