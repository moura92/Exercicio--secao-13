package aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;


public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		LocalDate data = LocalDate.now();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		
		
		System.out.println("Digite os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		Date niver = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, niver);
				
		System.out.println();
		System.out.println("Digite os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.nextLine();		
		
		
		
		sc.close();
	}

}
