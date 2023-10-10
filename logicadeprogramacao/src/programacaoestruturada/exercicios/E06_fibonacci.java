package programacaoestruturada.exercicios;

public class E06_fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 55...
		
		System.out.println(fibRecursivo(10));
		
		System.out.println(fib(10));

	}
	
	public static int fib(int numero) {
		
		int contador = 1, a = 1, b = 0, c = 0;
		
		while(contador <= numero) {
			c = a + b;
			a = b;
			b = c;
			
			contador++;
			//System.out.println(c);
		}
		return c;
	}
	
	public static int fibRecursivo(int numero) {
		if(numero < 2) return numero;
		
		return fibRecursivo(numero-1) + fibRecursivo(numero -2);
	} 
}
