package mostrarImparesComFor;

import java.util.Scanner;

public class ImparComFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.print("Escolha um n�mero: ");
		x = sc.nextInt();
		
		System.out.println("\nVeja os n�meros �mpares at� " + x);
		
		for (int i = 1; i <= x; i++) {
			
			System.out.println(i);
			i += 1;
			
		}
		
		sc.close();

	}

}
