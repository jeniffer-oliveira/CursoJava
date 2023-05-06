package exercicios_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTrianguloR, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
		
		pi = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//a) area do triângulo retangulo que tem A por base e C por altura
		areaTrianguloR = (A * C)/2;
		
		//b) area do circulo de raio C (pi = 3.14159)
		areaCirculo = pi * C * C;
		
		//c) area do trapezio que tem A e B por bases e C por altura
		areaTrapezio = ((A + B)* C)/2;
		
		//d) area do quadrado que tem lado B
		areaQuadrado = B * B;
		
		//e) area do retangulo que tem lados A e B
		areaRetangulo = A * B;
		
		// mostrando areas: 
		System.out.printf("Triângulo: %.3f%n", areaTrianguloR);
		System.out.printf("Círculo: %.3f%n", areaCirculo);
		System.out.printf("Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retângulo: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
