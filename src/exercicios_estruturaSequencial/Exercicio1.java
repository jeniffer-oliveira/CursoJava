package exercicios_estruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, resultado;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		resultado = a + b;
		
		System.out.println("Soma: " + resultado );
		
		sc.close();
	}

}
