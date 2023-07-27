package entidades;

public class OrdemItem {

	private Integer quantidade;
	private Double preço;
	
	private Produto produto;
	
	public OrdemItem() {		
	}

	public OrdemItem(Integer quantidade, Double preço, Produto produto) {
		this.produto = produto;
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

	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double subTotal() {
		return quantidade * preço;
	}

	@Override
	public String toString() {
		return produto.getproduto()
				+  ", R$ " + String.format("%.2f" , preço)
				+ ", Quantidade: " + quantidade
				+ ", Subtotal: R$ " + String.format("%.2f" , subTotal());
	}
	
	
}
