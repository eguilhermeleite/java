package parOuImpar;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite um n�mero para saber se � par ou �mpar: ");
		number = sc.nextInt();
		
		if (number %2 == 0) {
			System.out.println("\nO n�mero " + number + " � par.");
		}else {
			System.out.println("\nO n�mero " + number + " � �mpar.");
		}
		sc.close();
	}

}
