package exercicios_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc, horasTrabalhadas;
		double valorHora, salario;
		
		numFunc = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("Number: " + numFunc);
		System.out.printf("Salary:  %.2f%n", salario);
		
		sc.close();
	}

}
