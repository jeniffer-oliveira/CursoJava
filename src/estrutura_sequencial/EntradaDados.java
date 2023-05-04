package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		// para ler um número int
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		// para ler um double
		double z;
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n ", z);
		
		// para ler um char
		char a;
		a = sc.next().charAt(0);
		System.out.println("Você digitou: " + a);
		
		// para ler vários dados na mesma linha 
		String b;
		int c;
		double d;
		
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close();
		
	}

}
