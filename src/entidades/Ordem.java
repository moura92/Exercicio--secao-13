package entidades;

import java.util.Date;

import status_pedido.StatusPedido;

public class Ordem {

	private Date momento;
	private StatusPedido status;
	
	OrdemItem ordemitens = new OrdemItem();
	
	public Ordem() {
	}

	public Ordem(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	
	public void adicionaritem (OrdemItem quantidade) {
		quantidade.getQuantidade();
	}
	
	public void removeritem (Ordem quantidade) {
		quantidade.removeritem(quantidade);
	}
	
	public Double totalordem () {
		
		return ordemitens;
	}
	
}
