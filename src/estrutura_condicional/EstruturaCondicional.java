package estrutura_condicional;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		// estrutura simples::
		// if (<condição>){
		// <comando 1>
		// <comando 2>
		// }
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas horas são?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}else if (hora < 18) {
			System.out.println("Boa tarde");
		}else {
			System.out.println("Boa noite");
		}
		

		sc.close();
		// estrutura composta::
		// if (<condição>){
		// <comando 1>
		// <comando 2>
		// } else {
		//       comando 3
		//		 comando 4
		// }
	}

}
