package estrutura_condicional;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		// Estrutura opcional ao if-else quando se deseja dicidir um VALOR com base em um condição
		
		// sintaxe: ( condicao ) ? valor_se_verdadeiro : valor_se_falso
	
		// Exemplos:
		// ( 2 < 4 ) ? 50 : 80 -> Resposta: 50
		// ( 10 != 3) ? "Maria" : "Alex" -> Resposta: "Maria"
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();
	}

}
