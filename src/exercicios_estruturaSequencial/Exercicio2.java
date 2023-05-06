package exercicios_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// area de um circulo
		double raio, pi, area;
		
		pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;

		System.out.printf("Área: %.4f%n", area);
		
		sc.close();
	}

}
