package exercicios_estruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("É par");
		}else {
			System.out.println("É ímpar");
		}
		
		sc.close();
	}

}
