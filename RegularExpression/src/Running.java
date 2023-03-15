import java.util.Scanner;

public class Running {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome: ");
		String firstName = scanner.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String lastName = scanner.nextLine();
		System.out.println("Digite seu endere�o: ");
		String address = scanner.nextLine();
		System.out.println("Digite sua cidade: ");
		String city = scanner.nextLine();
		System.out.println("Digite seu estado: ");
		String state = scanner.nextLine();
		System.out.println("Digite seu cep: ");
		String cep = scanner.nextLine();
		System.out.println("Digite seu telefone: ");
		String phone = scanner.nextLine();
		

		System.out.printf("%nResultado das Valida��es: ");

		if (!Validating.validateFirstName(firstName))
			System.out.println("Nome Inv�lido");

		else if (!Validating.validateLastName(lastName))
			System.out.println("Sobrenome Inv�lido");
		
		else if (!Validating.validateAddress(address))
			System.out.println("Endere�o Inv�lido");
		
		else if (!Validating.validateCity(city))
			System.out.println("Cidade Inv�lida");
		
		else if (!Validating.validateState(state))
			System.out.println("Estado Inv�lido");
		
		else if (!Validating.validateCep(cep))
			System.out.println("Cep Inv�lido");
		
		else if (!Validating.validatePhone(phone))
			System.out.println("Telefone Inv�lido:");
			
		else
			System.out.println("Tudo Certo! Obrigado.");
	}

}// fim da classe Running
