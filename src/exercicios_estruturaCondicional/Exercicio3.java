package exercicios_estruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São múltiplos" ou "Não são múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos");
		}else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}

}
