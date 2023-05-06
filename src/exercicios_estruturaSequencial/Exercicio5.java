package exercicios_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, valorTotal;
		
		// peça 1
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		// peça 2
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		valorTotal = preco1 * qtd1 + preco2 * qtd2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
		
		sc.close();
	}

}
