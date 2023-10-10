package programacaoestruturada.exercicios;

public class E02_fatorial {

	public static void main(String[] args) {
		
		System.out.println(fatorial(4));

	}

	public static int fatorial(int numero) {
		int contador = 1,fat = 1;
		
		while(contador<=numero) {
			fat*=contador;
			contador++;
		}
		return fat;
	}
}
