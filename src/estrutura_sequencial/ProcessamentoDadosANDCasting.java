package estrutura_sequencial;

public class ProcessamentoDadosANDCasting {

	public static void main(String[] args) {
		
		// sintaxe
		// <variavel> = <expressão>
		// a expressão que estiver do lado direito vai ser calculada, depois o valor é armazenado na variavel do lado esquerdo
		
		// exemplo 1 
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		// exemplo 2 
		int a;
		double c;
		
		a = 5;
		c = 2 * x;
		
		System.out.println(a);
		System.out.println(c);
		
		// exemplo 3 - area de um trapezio
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0; 
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		// exemplo 4
		int d, e;
		double resultado;
		
		d = 5;
		e = 2;
		
		// usando casting
		resultado = (double) d / e;
		
		System.out.println(resultado);
		
		// exemplo 5
		
		double f;
		int g;
		
		f = 5.0;
		g = (int) f;
		
		System.out.println(g);
	}

}
