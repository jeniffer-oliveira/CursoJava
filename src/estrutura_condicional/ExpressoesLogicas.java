package estrutura_condicional;

public class ExpressoesLogicas {

	public static void main(String[] args) {
		// && = E
		// || = OU
		// !  = NÂO
		
		// ---- operador E (&&) 
		// -> Todas as afirmações TÊM que serem VERDADEIRAS. EX:
		
		// suponha x = 5
		
		// x <= 20 && x == 10;
		//   V          F   -> Logo o resultado da expressão é FALSO
		
		// x > 0 && x != 3
		//   V         V    -> Logo o resultado da expressão é VERDADEIRO
		
		// x <= 20 && x == 10 && x != 3 
		//   V          F          V     -> Logo o resultado da expressão é FALSO
		
		
		// ---- operador OU (||)
		// -> Pelo menos UMA DAS condições precisam ser VERDADEIRAS. EX:
		
		// x == 10 || x <= 20
		//   F          V     -> Logo o resultado da expressão é VERDADEIRO
		
		// x > 0 || x != 3
		//   V		   V      -> Logo o resultado da expressão é VERDADEIRO
		
		// x <= 0 || x != 3 || x != 5
		//   F         V         F     -> Logo a expressão é VERDADEIRO
		
		// ---- operador NÃO (!)
		// -> O operador "NÃO" inverte a condição
		
		// !(x == 10)
		//nao   F		-> Logo o resultado da expressão é VERDADEIRO
		
		// !(x >= 2)
		//nao   V    	-> Logo o resultado da expressão é FALSO 
		
		// !(x <= 20 && x == 10)
		//nao(   V    &&    F  )  -> Logo o resultado da expressão entre parenteses é FALSO, mas por causa do ! se torna VERDADEIRO
	}

}
