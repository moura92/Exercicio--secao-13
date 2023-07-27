package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import status_pedido.StatusPedido;

public class Ordem {

	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<OrdemItem> ordemitem = new ArrayList<>();

	
	
	public Ordem() {
	}
	

	public Ordem(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getOrdemItem() {
		return ordemitem;
	}

	public void additem(OrdemItem OrdemItem) {
		ordemitem.add(OrdemItem);
	}

	public void removeritem(OrdemItem OrdemItem) {
		ordemitem.remove(OrdemItem);
	}
	
	public double total(Double subtotal) {
		double soma = 0;
		for (OrdemItem c : ordemitem) {
			soma += c.subTotal();
		}
		return soma;
	}	
	
	
}
