package exercicios_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Em um país imaginário chamado Lisarb, todos os habitantes ficaram felizes em pagar seus impostos, pois sabem que nele não existem politicos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda do país é o Rombus, cujo símbolo é o R$.
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		//    Renda                        |                 Imposto de Renda 
		//  de o.oo a R$2000.00            |					Isento
		//  de R$ 2000.01 até R$ 3000.00   |          			 8%
		//  de R$ 3000.01 até 4500.00      |                    18%
		//  acima de R$ 4500.00			   |					28%
		// Lembre que, se o salário dor 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido, a taxa é de 8% sobre R$1000.00 + 18% sobre R$2.00, o que resulta em R$80.36 no total. O valor deve ser impresso com duas casas decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		double imposto;
		if( salario <= 2000.00) {
			imposto = 0.0;
			System.out.println("Isento");
		}else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}else {
			imposto = (salario - 4.500) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		} 
		
		sc.close();
	}

}
