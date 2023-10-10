package programacaoestruturada.exercicios;

public class E04_fatorial_recursivo {

	public static void main(String[] args) {
		
		System.out.println(fatorial(4));

	}

	public static int fatorial(int numero) {
		if(numero==1) return 1;
		
		return numero * fatorial(numero -1);
	}
	
	// 4 * ( 3 * ( 2 * 1)))
}
