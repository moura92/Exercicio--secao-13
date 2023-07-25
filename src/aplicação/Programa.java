package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;
import entidades.Produto;
import status_pedido.StatusPedido;




public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	    LocalDateTime momento = LocalDateTime.now();
	    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		SimpleDateFormat dataniver = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		Date niver = dataniver.parse(sc.next());
		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.next();	
		Cliente cliente = new Cliente(nome, email, niver);
		
		Ordem ordem = new Ordem(new Date(), StatusPedido.valueOf(status), cliente);
		
		System.out.print("quantos itens tem neste pedido? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
				System.out.println("insira os dados do " + i + "º item:");
				System.out.print("Nome do Produto: ");
				String produtos = sc.next();
				System.out.print("Preço do Produto: ");
				Double preço = sc.nextDouble();
				System.out.print("Quantidade: ");
				Integer quantidade = sc.nextInt();
				
				OrdemItem ordemitem = new OrdemItem(quantidade, preço, new Produto(produtos,preço));
				ordem.additem(ordemitem);
				
		}
		
		
	
		
	    System.out.println("-----------------------------------------------");

	
	    System.out.println("Resumo do Pedido:");
	    System.out.println("Momento do pedido: " + momento.format(sdf));
	    System.out.println("Status do Pedido: " + ordem.getStatus());
		System.out.println(cliente);
		System.out.println("Ordens dos Itens:");
		
		for(OrdemItem emp : ordem.getOrdemItem()) {
			System.out.println(emp);
		}
						
		System.out.printf("Valor Total: R$ %.2f", ordem.total(null));
		
		
		
		sc.close();
	}

}
