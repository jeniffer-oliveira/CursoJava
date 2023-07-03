package exercicios_estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int i=0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = ( a * 2.0 + b * 3.0 + c * 5.0 )/ 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
