package lacoFor;

import java.util.Iterator;
import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int count;
		int sum = 0;
		
		System.out.print("Quantos n�meros ser�o digitados? :  ");
		count = sc.nextInt();
		
		for (int i = 1 ; i <= count; i++) {
			
			System.out.print("\nDigite o " + i + "� numero: ");
			x = sc.nextInt();
			
			sum += x;
		}
		
		System.out.print("\nO total da soma �: " + sum);
		
		sc.close();

	}

}
