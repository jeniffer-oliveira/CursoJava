package exercicios_estruturaCondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtdItem;
		double total;
		
		cod = sc.nextInt();
		qtdItem = sc.nextInt();
		
		if(cod == 1) {
			total = qtdItem * 4.0;
		}else if (cod == 2) {
			total = qtdItem * 4.5;
		}else if(cod == 3) {
			total = qtdItem * 5.0;
		}else if(cod == 4) {
			total = qtdItem * 2.0;
		}else {
			total = qtdItem * 1.5;
		}
		
		System.out.printf("Valor total da conta: %.2f%n", total);
		
		sc.close();
	}

}
