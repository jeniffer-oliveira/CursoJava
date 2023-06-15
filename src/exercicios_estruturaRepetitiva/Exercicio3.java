package exercicios_estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustivel abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim. Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito s mensagem: "Muito Obrigado" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
		
	Scanner sc = new Scanner(System.in);
	
	int alcool = 0;
	int gasolina = 0;
	int diesel = 0;
	
	int tipoCombustivel = sc.nextInt();
	
	while( tipoCombustivel != 4 ) {
		if ( tipoCombustivel == 1 ) {
			alcool += 1;
		}else if ( tipoCombustivel == 2 ) {
			gasolina += 1;
		}else if ( tipoCombustivel == 3 ) {
			diesel += 1;
		}
		
		tipoCombustivel = sc.nextInt();
	}
	
	System.out.println("Muito obrigado pela preferência");
	System.out.println("Abastecimento total de Álcool: " + alcool);
	System.out.println("Abastecimento total de Gasolina: " + gasolina);
	System.out.println("Abastecimento total de Diesel: " + diesel);
	
	sc.close();

	}

}
