package numerosMultiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		int numA, numB, mult;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		numA = sc.nextInt();

		System.out.print("\nDigite o segundo n�mero: ");
		numB = sc.nextInt();

		if (numA > numB) {
			mult = numA / numB;
		} else {
			mult = numB / numA;
		}
		
		
		if (mult * numA == numB || mult * numB == numA) {
			System.out.printf("\nOs N�meros %d e %d, s�o m�ltiplos ", numA, numB);
			System.out.println("\nMultipicador/Divisor: " + mult);
		}else {
			System.out.printf("\nOs N�meros %d e %d, N�O S�O m�ltiplos", numA,numB);
		}

		sc.close();

	}

}
