package exercicios_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordernadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, pu se está sobre os eixos cartesianos ou na origem (x = y = 0).
		// Se o ponto estiver na origem, escreva a mensagem "Origem"
		// Se o ponto estiver sobre um dos eixos escreve "Eixo X" ou "Eixo Y", conforme for a situação.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0.0 && y == 0) {
			System.out.println("Origem");
		}else if(x == 0.0) {
			System.out.println("Eixo Y");
		}else if(y == 0.0) {
			System.out.println("Eixo X");
		}else if(x < 0.0 && y > 0.0) {
			System.out.println("Q1");
		}else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
