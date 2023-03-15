package exercicioCapEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod;
		int qtd;
		double val1,val2;
		double total, total1 , total2, desconto;
		
		System.out.print("Digite o c�digo, a quantidade e o valor da primeira pe�a: ");
		cod = sc.nextInt();
		qtd = sc.nextInt();
		val1 =sc.nextDouble();
		total1 = val1 * qtd;
		
		System.out.println("\n********PE�A 1************");
		System.out.println("\nC�digo: " + cod);
		System.out.println("Quantidade: " + qtd);
		System.out.printf("Valor unit�rio R$: %.2f\n", val1);
		System.out.printf("Total parcial R$: %.2f\n", total1);
		System.out.println("**************************");
		
		
		System.out.print("\nDigite o c�digo, a quantidade e o valor da segunda pe�a: ");
		cod = sc.nextInt();
		qtd = sc.nextInt();
		val2 = sc.nextDouble();
		total2 = val2 * qtd;
		System.out.println("\n*********PE�A 2************");
		System.out.println("\nC�digo: " + cod);
		System.out.println("Quantidade: " + qtd);
		System.out.printf("Valor unit�rio R$: %.2f\n", val2);
		System.out.printf("Total parcial R$: %.2f\n", total2);
		System.out.println("**************************");
		
		total = total1 + total2;
		desconto = total * 10 / 100;
		
		if(total >= 500) {
			System.out.printf("\nVoc� teve um desconto de (R$ %.2f)\n", desconto);
			total-=desconto;
			System.out.printf("\nTotal a pagar R$: %.2f ", total);
		}
		else {
			System.out.printf("\nTotal a pagar R$: %.2f ", total);
		}
		
		
		sc.close();
	}

}
