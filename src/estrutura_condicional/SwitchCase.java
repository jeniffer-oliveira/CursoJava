package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// ao invés de usar várias estruturas if-else encadeadas,pode utilizar a estrutura switch-case
		
		// Exemplo: Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por dainte). Escrever na tela o dia da semana correspondente, conforme exemplos
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String diaSemana;
		
		switch (x) {
		case 1:
			diaSemana = "Domingo";
		    break;
		case 2:
			diaSemana = "Segunda-feira";
			break;
		case 3:
			diaSemana = "Terça-feira";
			break;
		case 4:
			diaSemana = "Quarta-feira";
			break;
		case 5:
			diaSemana = "Quinta-feira";
			break;
		case 6: 
			diaSemana = "Sexta-feira";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			diaSemana = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + diaSemana);
		
		sc.close();
	
	}

}
