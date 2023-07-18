package entidades;

public class OrdemItem {

	private Integer quantidade;
	private Double preço;
	
	public OrdemItem() {		
	}

	public OrdemItem(Integer quantidade, Double preço) {
		this.quantidade = quantidade;
		this.preço = preço;
	}

	
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public Double total() {
		return quantidade * preço;
	}
}
