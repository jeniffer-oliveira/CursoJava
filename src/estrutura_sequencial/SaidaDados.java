package estrutura_sequencial;

import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		System.out.print("Bom dia!");
		// a diferença é que o primeiro não possui quebra de linha automática no fim da linha, já o segundo sim
		System.out.println("Bom dia!");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x); // imprime com duas casas decimais
		System.out.printf("%.4f%n", x); // imprime com 4 casas decimais
		// %n = quebra de linha, assim como /n 

		
		Locale.setDefault(Locale.US); // para definir a localidade e modificar as vírgulas dos números para ponto 
		System.out.printf("%.4f%n", x); // imprime com 4 casas decimais e a "," se torna "."
		
		System.out.println("Resultado: " + x + " metros");
		System.out.printf("Resultado: %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		// %s = texto (string);
		// %d = numero inteiro;
		// %f = número decimal
	}

}
