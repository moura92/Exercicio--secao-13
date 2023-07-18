package aplicação;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entidades.Cliente;
import status_pedido.StatusPedido;



public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	    LocalDateTime momentopedido = LocalDateTime.now();
	    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		SimpleDateFormat dataniver = new SimpleDateFormat("dd/MM/yyy");
		
		
		
		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		Date niver = dataniver.parse(sc.next());
		
		System.out.println();
		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.next();	
		
		Cliente cliente = new Cliente(nome, email, niver, StatusPedido.valueOf(status));
		
		System.out.println();
		
		/*
		System.out.printf("Nome: %s\n"  , cliente.getNome());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("Data Aniversário: " + dataniver.format(niver));
		System.out.println("Status do pedido: " + cliente.getStatus());
		System.out.println("------------------------------------------------------------------");
		*/
		
	    System.out.println("------------------------------------------------------------------");
	    System.out.println();

	    System.out.println("Resumo do Pedido:");
	    System.out.println("Momento do pedido: " + momentopedido.format(sdf));
		System.out.println(cliente);
		System.out.println("Ordens dos Itens:");
		
		
		
		sc.close();
	}

}
