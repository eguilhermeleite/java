
public class Validating {

	// valida nome
	public static boolean validateFirstName(String firstName) {

		return firstName.matches("[A-Z�-�][a-z�-�A-Z�-�]*");
		//1� Express�o - [A-Z�-�] Primeira letra entre A e Z. Primeira letra pode ter acento
		//2� Express�o - [a-z�-�A-Z�-�] A partir da segunda letra, pode ser a-z, �-�, aceita acento, A-Z aceita letras mai�sculas, �-� acento em letra mai�scula
		//3� Express�o - * quantidade indefinida de letras para a segunda express�o
	}

	// valida sobrenome
	public static boolean validateLastName(String lastName) {
		
		return lastName.matches("[a-zA-Z�-��-�]+([\\s][a-zA-Z�-��-�]+)*");
		//1� Express�o [a-zA-Z�-��-�] primeira letra mai�scula ou min�scula ou letra acentuada min. ou mai.
		//2� Express�o (\\s[a-zA-Z�-�]+) aceita espa�o  * quantidade de repeti��o indefinida do bloco
	}

	// valida endereco
	public static boolean validateAddress(String address) {
		return address.matches("[a-zA-Z�-��-�]+([\\s][a-zA-Z�-��-�]+)*+([\\s][0-9]{1,5})");
		//2� express�o ([\\s][a-zA-Z�-��-�]+)* = depois do espa�o, letras min�sculas ou mai�sculas acentuadas. O bloco se repete * vezes
		//�ltima express�o ([\\s][0-9]{1,5}) = depois do espa�o, cont�m do 0-9, entre 1 e 5 d�gitos
		
	}

	// valida cidade
	public static boolean validateCity(String city) {
		return city.matches("[a-zA-Z�-��-�]+([\\s][a-zA-Z�-��-�]+)*");
	}

	// valida estado
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]{1}+[a-zA-Z]{1})");
		// de a-z min. ou mai. 1 d�gito + de a-z min. ou mai. 1 d�gito
	}

	// valida cep
	public static boolean validateCep(String cep) {
		return cep.matches("([0-9]{8})");
	}

	// valida telefone
	public static boolean validatePhone(String phone) {
		return phone.matches("([1-9]{2})+[9]+([0-9]{8})");
		//1� express�o ([1-9]{2}) = de 1 a 9, 2 d�gitos
		//2� express�o [9] = d�gito deve ser 9
		//3� express�o ([0-9]{8}) = de 0-9, 8 d�gitos
	}
}
