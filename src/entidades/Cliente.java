package entidades;


import java.text.SimpleDateFormat;
import java.util.Date;

import status_pedido.StatusPedido;

public class Cliente {

	private String nome;
	private String email;
	private Date niver;
	private StatusPedido status;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente() {
	}

	public Cliente(String nome, String email, Date niver, StatusPedido status) {
		this.nome = nome;
		this.email = email;
		this.niver = niver;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNiver() {
		return niver;
	}

	public void setNiver(Date niver) {
		this.niver = niver;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return 	 String.format("Status do pedido: %s%n", status)
				+ String.format("Nome: %s (%s) - %s ", nome, sdf.format(niver), email);
		
	}


	
	
}
