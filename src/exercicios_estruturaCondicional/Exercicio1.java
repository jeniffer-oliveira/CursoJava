package exercicios_estruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("Não negativo");
		}else {
			System.out.println("Negativo");
		}
		
		
		sc.close();
	}

}
